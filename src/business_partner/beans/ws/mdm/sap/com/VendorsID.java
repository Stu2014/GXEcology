/**
 * VendorsID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package business_partner.beans.ws.mdm.sap.com;

public class VendorsID  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.math.BigInteger internalID;

    private beans.ws.mdm.sap.com.KeyMapping keyMapping;

    private java.math.BigInteger autoID;

    private business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint1 uniqueConstraint1;

    private business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint2 uniqueConstraint2;

    private business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint3 uniqueConstraint3;

    private business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint4 uniqueConstraint4;

    private business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint5 uniqueConstraint5;

    public VendorsID() {
    }

    public VendorsID(
           java.math.BigInteger internalID,
           beans.ws.mdm.sap.com.KeyMapping keyMapping,
           java.math.BigInteger autoID,
           business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint1 uniqueConstraint1,
           business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint2 uniqueConstraint2,
           business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint3 uniqueConstraint3,
           business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint4 uniqueConstraint4,
           business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint5 uniqueConstraint5) {
        this.internalID = internalID;
        this.keyMapping = keyMapping;
        this.autoID = autoID;
        this.uniqueConstraint1 = uniqueConstraint1;
        this.uniqueConstraint2 = uniqueConstraint2;
        this.uniqueConstraint3 = uniqueConstraint3;
        this.uniqueConstraint4 = uniqueConstraint4;
        this.uniqueConstraint5 = uniqueConstraint5;
    }


    /**
     * Gets the internalID value for this VendorsID.
     * 
     * @return internalID
     */
    public java.math.BigInteger getInternalID() {
        return internalID;
    }


    /**
     * Sets the internalID value for this VendorsID.
     * 
     * @param internalID
     */
    public void setInternalID(java.math.BigInteger internalID) {
        this.internalID = internalID;
    }


    /**
     * Gets the keyMapping value for this VendorsID.
     * 
     * @return keyMapping
     */
    public beans.ws.mdm.sap.com.KeyMapping getKeyMapping() {
        return keyMapping;
    }


    /**
     * Sets the keyMapping value for this VendorsID.
     * 
     * @param keyMapping
     */
    public void setKeyMapping(beans.ws.mdm.sap.com.KeyMapping keyMapping) {
        this.keyMapping = keyMapping;
    }


    /**
     * Gets the autoID value for this VendorsID.
     * 
     * @return autoID
     */
    public java.math.BigInteger getAutoID() {
        return autoID;
    }


    /**
     * Sets the autoID value for this VendorsID.
     * 
     * @param autoID
     */
    public void setAutoID(java.math.BigInteger autoID) {
        this.autoID = autoID;
    }


    /**
     * Gets the uniqueConstraint1 value for this VendorsID.
     * 
     * @return uniqueConstraint1
     */
    public business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint1 getUniqueConstraint1() {
        return uniqueConstraint1;
    }


    /**
     * Sets the uniqueConstraint1 value for this VendorsID.
     * 
     * @param uniqueConstraint1
     */
    public void setUniqueConstraint1(business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint1 uniqueConstraint1) {
        this.uniqueConstraint1 = uniqueConstraint1;
    }


    /**
     * Gets the uniqueConstraint2 value for this VendorsID.
     * 
     * @return uniqueConstraint2
     */
    public business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint2 getUniqueConstraint2() {
        return uniqueConstraint2;
    }


    /**
     * Sets the uniqueConstraint2 value for this VendorsID.
     * 
     * @param uniqueConstraint2
     */
    public void setUniqueConstraint2(business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint2 uniqueConstraint2) {
        this.uniqueConstraint2 = uniqueConstraint2;
    }


    /**
     * Gets the uniqueConstraint3 value for this VendorsID.
     * 
     * @return uniqueConstraint3
     */
    public business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint3 getUniqueConstraint3() {
        return uniqueConstraint3;
    }


    /**
     * Sets the uniqueConstraint3 value for this VendorsID.
     * 
     * @param uniqueConstraint3
     */
    public void setUniqueConstraint3(business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint3 uniqueConstraint3) {
        this.uniqueConstraint3 = uniqueConstraint3;
    }


    /**
     * Gets the uniqueConstraint4 value for this VendorsID.
     * 
     * @return uniqueConstraint4
     */
    public business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint4 getUniqueConstraint4() {
        return uniqueConstraint4;
    }


    /**
     * Sets the uniqueConstraint4 value for this VendorsID.
     * 
     * @param uniqueConstraint4
     */
    public void setUniqueConstraint4(business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint4 uniqueConstraint4) {
        this.uniqueConstraint4 = uniqueConstraint4;
    }


    /**
     * Gets the uniqueConstraint5 value for this VendorsID.
     * 
     * @return uniqueConstraint5
     */
    public business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint5 getUniqueConstraint5() {
        return uniqueConstraint5;
    }


    /**
     * Sets the uniqueConstraint5 value for this VendorsID.
     * 
     * @param uniqueConstraint5
     */
    public void setUniqueConstraint5(business_partner.beans.ws.mdm.sap.com.VendorsUniqueConstraint5 uniqueConstraint5) {
        this.uniqueConstraint5 = uniqueConstraint5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VendorsID)) return false;
        VendorsID other = (VendorsID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.internalID==null && other.getInternalID()==null) || 
             (this.internalID!=null &&
              this.internalID.equals(other.getInternalID()))) &&
            ((this.keyMapping==null && other.getKeyMapping()==null) || 
             (this.keyMapping!=null &&
              this.keyMapping.equals(other.getKeyMapping()))) &&
            ((this.autoID==null && other.getAutoID()==null) || 
             (this.autoID!=null &&
              this.autoID.equals(other.getAutoID()))) &&
            ((this.uniqueConstraint1==null && other.getUniqueConstraint1()==null) || 
             (this.uniqueConstraint1!=null &&
              this.uniqueConstraint1.equals(other.getUniqueConstraint1()))) &&
            ((this.uniqueConstraint2==null && other.getUniqueConstraint2()==null) || 
             (this.uniqueConstraint2!=null &&
              this.uniqueConstraint2.equals(other.getUniqueConstraint2()))) &&
            ((this.uniqueConstraint3==null && other.getUniqueConstraint3()==null) || 
             (this.uniqueConstraint3!=null &&
              this.uniqueConstraint3.equals(other.getUniqueConstraint3()))) &&
            ((this.uniqueConstraint4==null && other.getUniqueConstraint4()==null) || 
             (this.uniqueConstraint4!=null &&
              this.uniqueConstraint4.equals(other.getUniqueConstraint4()))) &&
            ((this.uniqueConstraint5==null && other.getUniqueConstraint5()==null) || 
             (this.uniqueConstraint5!=null &&
              this.uniqueConstraint5.equals(other.getUniqueConstraint5())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getInternalID() != null) {
            _hashCode += getInternalID().hashCode();
        }
        if (getKeyMapping() != null) {
            _hashCode += getKeyMapping().hashCode();
        }
        if (getAutoID() != null) {
            _hashCode += getAutoID().hashCode();
        }
        if (getUniqueConstraint1() != null) {
            _hashCode += getUniqueConstraint1().hashCode();
        }
        if (getUniqueConstraint2() != null) {
            _hashCode += getUniqueConstraint2().hashCode();
        }
        if (getUniqueConstraint3() != null) {
            _hashCode += getUniqueConstraint3().hashCode();
        }
        if (getUniqueConstraint4() != null) {
            _hashCode += getUniqueConstraint4().hashCode();
        }
        if (getUniqueConstraint5() != null) {
            _hashCode += getUniqueConstraint5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VendorsID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "VendorsID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "internalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "keyMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMapping"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "autoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "uniqueConstraint1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "VendorsUniqueConstraint1"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "uniqueConstraint2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "VendorsUniqueConstraint2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "uniqueConstraint3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "VendorsUniqueConstraint3"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint4");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "uniqueConstraint4"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "VendorsUniqueConstraint4"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueConstraint5");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "uniqueConstraint5"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "VendorsUniqueConstraint5"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
