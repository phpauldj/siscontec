
package edu.upc.sunat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "validaRUC", targetNamespace = "http://sunat.upc.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ValidaRUC {


    /**
     * 
     * @param usuario
     * @param ruc
     * @param clave
     * @return
     *     returns edu.upc.sunat.Persona
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaRuc", targetNamespace = "http://sunat.upc.edu/", className = "edu.upc.sunat.ConsultaRuc")
    @ResponseWrapper(localName = "consultaRucResponse", targetNamespace = "http://sunat.upc.edu/", className = "edu.upc.sunat.ConsultaRucResponse")
    @Action(input = "http://sunat.upc.edu/validaRUC/consultaRucRequest", output = "http://sunat.upc.edu/validaRUC/consultaRucResponse")
    public Persona consultaRuc(
        @WebParam(name = "ruc", targetNamespace = "")
        String ruc,
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

}