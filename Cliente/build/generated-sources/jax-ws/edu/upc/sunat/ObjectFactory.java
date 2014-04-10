
package edu.upc.sunat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.upc.sunat package. 
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

    private final static QName _ConsultaRuc_QNAME = new QName("http://sunat.upc.edu/", "consultaRuc");
    private final static QName _ConsultaRucResponse_QNAME = new QName("http://sunat.upc.edu/", "consultaRucResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.upc.sunat
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaRucResponse }
     * 
     */
    public ConsultaRucResponse createConsultaRucResponse() {
        return new ConsultaRucResponse();
    }

    /**
     * Create an instance of {@link ConsultaRuc }
     * 
     */
    public ConsultaRuc createConsultaRuc() {
        return new ConsultaRuc();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaRuc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sunat.upc.edu/", name = "consultaRuc")
    public JAXBElement<ConsultaRuc> createConsultaRuc(ConsultaRuc value) {
        return new JAXBElement<ConsultaRuc>(_ConsultaRuc_QNAME, ConsultaRuc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaRucResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sunat.upc.edu/", name = "consultaRucResponse")
    public JAXBElement<ConsultaRucResponse> createConsultaRucResponse(ConsultaRucResponse value) {
        return new JAXBElement<ConsultaRucResponse>(_ConsultaRucResponse_QNAME, ConsultaRucResponse.class, null, value);
    }

}
