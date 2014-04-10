/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.upc.sunat;

public class Persona  implements java.io.Serializable {
    private java.lang.String apellido;

    private java.lang.String clave;

    private java.lang.String direccion;

    private java.lang.String fecnaci;

    private java.lang.String nombre;

    private java.lang.String rpta;

    private java.lang.String ruc;

    private java.lang.String usuario;

    public Persona() {
    }

    public Persona(
           java.lang.String apellido,
           java.lang.String clave,
           java.lang.String direccion,
           java.lang.String fecnaci,
           java.lang.String nombre,
           java.lang.String rpta,
           java.lang.String ruc,
           java.lang.String usuario) {
           this.apellido = apellido;
           this.clave = clave;
           this.direccion = direccion;
           this.fecnaci = fecnaci;
           this.nombre = nombre;
           this.rpta = rpta;
           this.ruc = ruc;
           this.usuario = usuario;
    }


    /**
     * Gets the apellido value for this Persona.
     * 
     * @return apellido
     */
    public java.lang.String getApellido() {
        return apellido;
    }


    /**
     * Sets the apellido value for this Persona.
     * 
     * @param apellido
     */
    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }


    /**
     * Gets the clave value for this Persona.
     * 
     * @return clave
     */
    public java.lang.String getClave() {
        return clave;
    }


    /**
     * Sets the clave value for this Persona.
     * 
     * @param clave
     */
    public void setClave(java.lang.String clave) {
        this.clave = clave;
    }


    /**
     * Gets the direccion value for this Persona.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this Persona.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the fecnaci value for this Persona.
     * 
     * @return fecnaci
     */
    public java.lang.String getFecnaci() {
        return fecnaci;
    }


    /**
     * Sets the fecnaci value for this Persona.
     * 
     * @param fecnaci
     */
    public void setFecnaci(java.lang.String fecnaci) {
        this.fecnaci = fecnaci;
    }


    /**
     * Gets the nombre value for this Persona.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Persona.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the rpta value for this Persona.
     * 
     * @return rpta
     */
    public java.lang.String getRpta() {
        return rpta;
    }


    /**
     * Sets the rpta value for this Persona.
     * 
     * @param rpta
     */
    public void setRpta(java.lang.String rpta) {
        this.rpta = rpta;
    }


    /**
     * Gets the ruc value for this Persona.
     * 
     * @return ruc
     */
    public java.lang.String getRuc() {
        return ruc;
    }


    /**
     * Sets the ruc value for this Persona.
     * 
     * @param ruc
     */
    public void setRuc(java.lang.String ruc) {
        this.ruc = ruc;
    }


    /**
     * Gets the usuario value for this Persona.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Persona.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellido==null && other.getApellido()==null) || 
             (this.apellido!=null &&
              this.apellido.equals(other.getApellido()))) &&
            ((this.clave==null && other.getClave()==null) || 
             (this.clave!=null &&
              this.clave.equals(other.getClave()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.fecnaci==null && other.getFecnaci()==null) || 
             (this.fecnaci!=null &&
              this.fecnaci.equals(other.getFecnaci()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.rpta==null && other.getRpta()==null) || 
             (this.rpta!=null &&
              this.rpta.equals(other.getRpta()))) &&
            ((this.ruc==null && other.getRuc()==null) || 
             (this.ruc!=null &&
              this.ruc.equals(other.getRuc()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApellido() != null) {
            _hashCode += getApellido().hashCode();
        }
        if (getClave() != null) {
            _hashCode += getClave().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getFecnaci() != null) {
            _hashCode += getFecnaci().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getRpta() != null) {
            _hashCode += getRpta().hashCode();
        }
        if (getRuc() != null) {
            _hashCode += getRuc().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Persona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sunat.upc.edu/", "persona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clave");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecnaci");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecnaci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rpta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
