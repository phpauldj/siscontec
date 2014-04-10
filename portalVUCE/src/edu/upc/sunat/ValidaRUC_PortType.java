/**
 * ValidaRUC_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.upc.sunat;

public interface ValidaRUC_PortType extends java.rmi.Remote {
    public edu.upc.sunat.Persona consultaRuc(java.lang.String ruc, java.lang.String usuario, java.lang.String clave) throws java.rmi.RemoteException;
}
