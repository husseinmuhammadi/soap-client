package com.asan;

import com.asan.card.transaction.FinancialRequest;
import com.asan.cms.CMSTransactionEjb;
import com.asan.cms.CMSTransactionWS;
import com.asan.type.ProcessingCode;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.*;
import java.util.*;

public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    private static final CMSTransactionWS service;
    private static TransactionReferenceGenerator referenceGenerator = new TransactionReferenceGenerator();

    static {
        URL url = null;
        try {
            url = new URL("http://localhost:7001/TransactionService_Bean/CMS_Transaction_WS?wsdl");
        } catch (MalformedURLException e) {
            LOGGER.warn(e.getMessage(), e);
        }
        service = new CMSTransactionWS(url);
    }

    public static void main(String[] args) {
        try {
            CMSTransactionEjb endpoint = service.getCMSTransactionWSPort();
            FinancialRequest request = new FinancialRequest();
            request.setCardNo("9832559913327466");
            request.setProcessingCode(ProcessingCode.Payment);
            request.setGateway(40);
            request.setHostId(99);
            request.setRefTranType(16);
            request.setRefTranId(referenceGenerator.getRandomRefTranId());
            request.setLocalDateTime(current());



            LOGGER.info(serializeRequest(request));
            String response = endpoint.doCardTransaction(serializeRequest(request));
            LOGGER.info(response);
        } catch (JsonProcessingException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public static String serializeRequest(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(ProcessingCode.class, new StdSerializer<ProcessingCode>(ProcessingCode.class) {
            @Override
            public void serialize(ProcessingCode processingCode, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException, JsonGenerationException {
                jsonGenerator.writeNumber(processingCode.getValue());
            }
        });
        mapper.registerModule(module);
        return mapper.writeValueAsString(obj);
    }

    public static Date current() {
        LocalDateTime now = LocalDateTime.now();
        TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("Asia/Tehran"));
        Instant instant = now.atZone(ZoneId.of(timeZone.getID())).toInstant();
        return Date.from(instant);
    }
}

class TransactionReferenceGenerator {
    private String getRandomDigit() {
        Random rand = new Random();
        return rand.nextInt(10) + "";
    }

    protected String getRandomRRN() {
        return (new Date().getTime() + getRandomDigit() + getRandomDigit()).substring(3, 15);
    }

    protected String getRandomRefTranId() {
        return new Date().getTime() + getRandomDigit();
    }
}

class DisplayZoneAndOffSet {

    public static final Logger LOGGER = LoggerFactory.getLogger(DisplayZoneAndOffSet.class);

    public static final boolean SORT_BY_REGION = false;

    public static void display() {
        Map<String, String> sortedMap = new LinkedHashMap<>();
        Map<String, String> allZoneIdsAndItsOffSet = getAllZoneIdsAndItsOffSet();

        //sort map by key
        if (SORT_BY_REGION) {
            allZoneIdsAndItsOffSet.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));
        } else {
            // sort by value, descending order
            allZoneIdsAndItsOffSet.entrySet().stream()
                    .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                    .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));
        }

        // print map
        sortedMap.forEach((k, v) -> {
            String out = String.format("%35s (UTC%s) %n", k, v);
            LOGGER.info(out);
        });

        LOGGER.info("\nTotal Zone IDs " + sortedMap.size());

    }

    private static Map<String, String> getAllZoneIdsAndItsOffSet() {
        Map<String, String> result = new HashMap<>();
        LocalDateTime localDateTime = LocalDateTime.now();

        for (String zoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId id = ZoneId.of(zoneId);
            // LocalDateTime -> ZonedDateTime
            ZonedDateTime zonedDateTime = localDateTime.atZone(id);
            // ZonedDateTime -> ZoneOffset
            ZoneOffset zoneOffset = zonedDateTime.getOffset();
            //replace Z to +00:00
            String offset = zoneOffset.getId().replaceAll("Z", "+00:00");
            result.put(id.toString(), offset);
        }
        return result;
    }
}