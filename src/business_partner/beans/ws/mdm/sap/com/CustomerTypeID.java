/**
 * CustomerTypeID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package business_partner.beans.ws.mdm.sap.com;

public class CustomerTypeID  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.math.BigInteger internalID;

    private business_partner.beans.ws.mdm.sap.com.CustomerTypeDisplayFields displayFields;

    public CustomerTypeID() {
    }

    public CustomerTypeID(
           java.math.BigInteger internalID,
           business_partner.beans.ws.mdm.sap.com.CustomerTypeDisplayFields displayFields) {
        this.internalID = internalID;
        this.displayFields = displayFields;
    }


    /**
     * Gets the internalID value for this CustomerTypeID.
     * 
     * @return internalID
     */
    public java.math.BigInteger getInternalID() {
        return internalID;
    }


    /**
     * Sets the internalID value for this CustomerTypeID.
     * 
     * @param internalID
     */
    public void setInternalID(java.math.BigInteger internalID) {
        this.internalID = internalID;
    }


    /**
     * Gets the displayFields value for this CustomerTypeID.
     * 
     * @return displayFields
     */
    public business_partner.beans.ws.mdm.sap.com.CustomerTypeDisplayFields getDisplayFields() {
        return displayFields;
    }


    /**
     * Sets the displayFields value for this CustomerTypeID.
     * 
     * @param displayFields
     */
    public void setDisplayFields(business_partner.beans.ws.mdm.sap.com.CustomerTypeDisplayFields displayFields) {
        this.displayFields = displayFields;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerTypeID)) return false;
        CustomerTypeID other = (CustomerTypeID) obj;
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
            ((this.displayFields==null && other.getDisplayFields()==null) || 
             (this.displayFields!=null &&
              this.displayFields.equals(other.getDisplayFields())));
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
        if (getDisplayFields() != null) {
            _hashCode += getDisplayFields().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerTypeID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "CustomerTypeID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "internalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "displayFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "CustomerTypeDisplayFields"));
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