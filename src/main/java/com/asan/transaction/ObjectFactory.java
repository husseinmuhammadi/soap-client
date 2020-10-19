
package com.asan.transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.asan.transaction package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCardInfoResponse_QNAME = new QName("http://transaction.asan.com/", "getCardInfoResponse");
    private final static QName _GetCardInfo_QNAME = new QName("http://transaction.asan.com/", "getCardInfo");
    private final static QName _DoCardTransactionResponse_QNAME = new QName("http://transaction.asan.com/", "doCardTransactionResponse");
    private final static QName _DoCardTransaction_QNAME = new QName("http://transaction.asan.com/", "doCardTransaction");
    private final static QName _TransactionInquiry_QNAME = new QName("http://transaction.asan.com/", "TransactionInquiry");
    private final static QName _DoCardTransactionReverseResponse_QNAME = new QName("http://transaction.asan.com/", "doCardTransactionReverseResponse");
    private final static QName _RegisterCard_QNAME = new QName("http://transaction.asan.com/", "registerCard");
    private final static QName _DoCardTransactionReverse_QNAME = new QName("http://transaction.asan.com/", "doCardTransactionReverse");
    private final static QName _RegisterCardResponse_QNAME = new QName("http://transaction.asan.com/", "registerCardResponse");
    private final static QName _TransactionInquiryResponse_QNAME = new QName("http://transaction.asan.com/", "TransactionInquiryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.asan.transaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCardInfoResponse }
     * 
     */
    public GetCardInfoResponse createGetCardInfoResponse() {
        return new GetCardInfoResponse();
    }

    /**
     * Create an instance of {@link GetCardInfo }
     * 
     */
    public GetCardInfo createGetCardInfo() {
        return new GetCardInfo();
    }

    /**
     * Create an instance of {@link DoCardTransactionResponse }
     * 
     */
    public DoCardTransactionResponse createDoCardTransactionResponse() {
        return new DoCardTransactionResponse();
    }

    /**
     * Create an instance of {@link DoCardTransaction }
     * 
     */
    public DoCardTransaction createDoCardTransaction() {
        return new DoCardTransaction();
    }

    /**
     * Create an instance of {@link TransactionInquiry }
     * 
     */
    public TransactionInquiry createTransactionInquiry() {
        return new TransactionInquiry();
    }

    /**
     * Create an instance of {@link DoCardTransactionReverseResponse }
     * 
     */
    public DoCardTransactionReverseResponse createDoCardTransactionReverseResponse() {
        return new DoCardTransactionReverseResponse();
    }

    /**
     * Create an instance of {@link RegisterCard }
     * 
     */
    public RegisterCard createRegisterCard() {
        return new RegisterCard();
    }

    /**
     * Create an instance of {@link TransactionInquiryResponse }
     * 
     */
    public TransactionInquiryResponse createTransactionInquiryResponse() {
        return new TransactionInquiryResponse();
    }

    /**
     * Create an instance of {@link DoCardTransactionReverse }
     * 
     */
    public DoCardTransactionReverse createDoCardTransactionReverse() {
        return new DoCardTransactionReverse();
    }

    /**
     * Create an instance of {@link RegisterCardResponse }
     * 
     */
    public RegisterCardResponse createRegisterCardResponse() {
        return new RegisterCardResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "getCardInfoResponse")
    public JAXBElement<GetCardInfoResponse> createGetCardInfoResponse(GetCardInfoResponse value) {
        return new JAXBElement<GetCardInfoResponse>(_GetCardInfoResponse_QNAME, GetCardInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "getCardInfo")
    public JAXBElement<GetCardInfo> createGetCardInfo(GetCardInfo value) {
        return new JAXBElement<GetCardInfo>(_GetCardInfo_QNAME, GetCardInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCardTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "doCardTransactionResponse")
    public JAXBElement<DoCardTransactionResponse> createDoCardTransactionResponse(DoCardTransactionResponse value) {
        return new JAXBElement<DoCardTransactionResponse>(_DoCardTransactionResponse_QNAME, DoCardTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCardTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "doCardTransaction")
    public JAXBElement<DoCardTransaction> createDoCardTransaction(DoCardTransaction value) {
        return new JAXBElement<DoCardTransaction>(_DoCardTransaction_QNAME, DoCardTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInquiry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "TransactionInquiry")
    public JAXBElement<TransactionInquiry> createTransactionInquiry(TransactionInquiry value) {
        return new JAXBElement<TransactionInquiry>(_TransactionInquiry_QNAME, TransactionInquiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCardTransactionReverseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "doCardTransactionReverseResponse")
    public JAXBElement<DoCardTransactionReverseResponse> createDoCardTransactionReverseResponse(DoCardTransactionReverseResponse value) {
        return new JAXBElement<DoCardTransactionReverseResponse>(_DoCardTransactionReverseResponse_QNAME, DoCardTransactionReverseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "registerCard")
    public JAXBElement<RegisterCard> createRegisterCard(RegisterCard value) {
        return new JAXBElement<RegisterCard>(_RegisterCard_QNAME, RegisterCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoCardTransactionReverse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "doCardTransactionReverse")
    public JAXBElement<DoCardTransactionReverse> createDoCardTransactionReverse(DoCardTransactionReverse value) {
        return new JAXBElement<DoCardTransactionReverse>(_DoCardTransactionReverse_QNAME, DoCardTransactionReverse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "registerCardResponse")
    public JAXBElement<RegisterCardResponse> createRegisterCardResponse(RegisterCardResponse value) {
        return new JAXBElement<RegisterCardResponse>(_RegisterCardResponse_QNAME, RegisterCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionInquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://transaction.asan.com/", name = "TransactionInquiryResponse")
    public JAXBElement<TransactionInquiryResponse> createTransactionInquiryResponse(TransactionInquiryResponse value) {
        return new JAXBElement<TransactionInquiryResponse>(_TransactionInquiryResponse_QNAME, TransactionInquiryResponse.class, null, value);
    }

}
