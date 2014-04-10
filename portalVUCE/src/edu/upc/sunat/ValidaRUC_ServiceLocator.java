/**
 * ValidaRUC_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.upc.sunat;

public class ValidaRUC_ServiceLocator extends org.apache.axis.client.Service implements edu.upc.sunat.ValidaRUC_Service {

    public ValidaRUC_ServiceLocator() {
    }


    public ValidaRUC_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ValidaRUC_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for validaRUCPort
    private java.lang.String validaRUCPort_address = "http://localhost:8080/servidorSunat/validaRUC";

    public java.lang.String getvalidaRUCPortAddress() {
        return validaRUCPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String validaRUCPortWSDDServiceName = "validaRUCPort";

    public java.lang.String getvalidaRUCPortWSDDServiceName() {
        return validaRUCPortWSDDServiceName;
    }

    public void setvalidaRUCPortWSDDServiceName(java.lang.String name) {
        validaRUCPortWSDDServiceName = name;
    }

    public edu.upc.sunat.ValidaRUC_PortType getvalidaRUCPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(validaRUCPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getvalidaRUCPort(endpoint);
    }

    public edu.upc.sunat.ValidaRUC_PortType getvalidaRUCPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.upc.sunat.ValidaRUCPortBindingStub _stub = new edu.upc.sunat.ValidaRUCPortBindingStub(portAddress, this);
            _stub.setPortName(getvalidaRUCPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setvalidaRUCPortEndpointAddress(java.lang.String address) {
        validaRUCPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.upc.sunat.ValidaRUC_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.upc.sunat.ValidaRUCPortBindingStub _stub = new edu.upc.sunat.ValidaRUCPortBindingStub(new java.net.URL(validaRUCPort_address), this);
                _stub.setPortName(getvalidaRUCPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("validaRUCPort".equals(inputPortName)) {
            return getvalidaRUCPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sunat.upc.edu/", "validaRUC");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sunat.upc.edu/", "validaRUCPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("validaRUCPort".equals(portName)) {
            setvalidaRUCPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
