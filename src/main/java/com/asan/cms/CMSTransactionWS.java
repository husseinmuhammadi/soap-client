
package com.asan.cms;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CMS_Transaction_WS", targetNamespace = "http://cms.asan.com/", wsdlLocation = "http://localhost:7001/TransactionService_Bean/CMS_Transaction_WS?wsdl")
public class CMSTransactionWS
    extends Service
{

    private final static URL CMSTRANSACTIONWS_WSDL_LOCATION;
    private final static WebServiceException CMSTRANSACTIONWS_EXCEPTION;
    private final static QName CMSTRANSACTIONWS_QNAME = new QName("http://cms.asan.com/", "CMS_Transaction_WS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/TransactionService_Bean/CMS_Transaction_WS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CMSTRANSACTIONWS_WSDL_LOCATION = url;
        CMSTRANSACTIONWS_EXCEPTION = e;
    }

    public CMSTransactionWS() {
        super(__getWsdlLocation(), CMSTRANSACTIONWS_QNAME);
    }

    public CMSTransactionWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), CMSTRANSACTIONWS_QNAME, features);
    }

    public CMSTransactionWS(URL wsdlLocation) {
        super(wsdlLocation, CMSTRANSACTIONWS_QNAME);
    }

    public CMSTransactionWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CMSTRANSACTIONWS_QNAME, features);
    }

    public CMSTransactionWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CMSTransactionWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CMSTransactionEjb
     */
    @WebEndpoint(name = "CMS_Transaction_WSPort")
    public CMSTransactionEjb getCMSTransactionWSPort() {
        return super.getPort(new QName("http://cms.asan.com/", "CMS_Transaction_WSPort"), CMSTransactionEjb.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CMSTransactionEjb
     */
    @WebEndpoint(name = "CMS_Transaction_WSPort")
    public CMSTransactionEjb getCMSTransactionWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cms.asan.com/", "CMS_Transaction_WSPort"), CMSTransactionEjb.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CMSTRANSACTIONWS_EXCEPTION!= null) {
            throw CMSTRANSACTIONWS_EXCEPTION;
        }
        return CMSTRANSACTIONWS_WSDL_LOCATION;
    }

}
