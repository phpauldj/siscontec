package edu.upc.sunat;

public class ValidaRUCProxy implements edu.upc.sunat.ValidaRUC_PortType {
  private String _endpoint = null;
  private edu.upc.sunat.ValidaRUC_PortType validaRUC_PortType = null;
  
  public ValidaRUCProxy() {
    _initValidaRUCProxy();
  }
  
  public ValidaRUCProxy(String endpoint) {
    _endpoint = endpoint;
    _initValidaRUCProxy();
  }
  
  private void _initValidaRUCProxy() {
    try {
      validaRUC_PortType = (new edu.upc.sunat.ValidaRUC_ServiceLocator()).getvalidaRUCPort();
      if (validaRUC_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)validaRUC_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)validaRUC_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (validaRUC_PortType != null)
      ((javax.xml.rpc.Stub)validaRUC_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.upc.sunat.ValidaRUC_PortType getValidaRUC_PortType() {
    if (validaRUC_PortType == null)
      _initValidaRUCProxy();
    return validaRUC_PortType;
  }
  
  public edu.upc.sunat.Persona consultaRuc(java.lang.String ruc, java.lang.String usuario, java.lang.String clave) throws java.rmi.RemoteException{
    if (validaRUC_PortType == null)
      _initValidaRUCProxy();
    return validaRUC_PortType.consultaRuc(ruc, usuario, clave);
  }
  
  
}