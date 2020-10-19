package com.asan.card.transaction;

import com.asan.type.ProcessingCode;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Date;

public class FinancialRequest {
    private String cardNo;
    private ProcessingCode processingCode;
    private Number gateway;
    private Number hostId;
    private Number refTranType;
    private String refTranId;
    private Date localDateTime;


    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @JsonGetter("process")
    public ProcessingCode getProcessingCode() {
        return processingCode;
    }

    @JsonSetter("process")
    public void setProcessingCode(ProcessingCode processingCode) {
        this.processingCode = processingCode;
    }

    @JsonGetter("gate")
    public Number getGateway() {
        return gateway;
    }

    @JsonSetter("gate")
    public void setGateway(Number gateway) {
        this.gateway = gateway;
    }

    @JsonGetter("hostid")
    public Number getHostId() {
        return hostId;
    }

    @JsonSetter("hostid")
    public void setHostId(Number hostId) {
        this.hostId = hostId;
    }

    @JsonGetter("refType")
    public Number getRefTranType() {
        return refTranType;
    }

    @JsonSetter("refType")
    public void setRefTranType(Number refTranType) {
        this.refTranType = refTranType;
    }

    @JsonGetter("refId")
    public String getRefTranId() {
        return refTranId;
    }

    @JsonSetter("refId")
    public void setRefTranId(String refTranId) {
        this.refTranId = refTranId;
    }

    @JsonGetter("clientTime")
    public Date getLocalDateTime() {
        return localDateTime;
    }

    @JsonSetter("clientTime")
    public void setLocalDateTime(Date localDateTime) {
        this.localDateTime = localDateTime;
    }
}
