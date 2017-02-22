/**
 * MaritalStatusQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_hr.beans.ws.mdm.sap.com;

public class MaritalStatusQuery  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusCriteria criteria;

    private beans.ws.mdm.sap.com.ResultDefinition resultDefinition;

    public MaritalStatusQuery() {
    }

    public MaritalStatusQuery(
           jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusCriteria criteria,
           beans.ws.mdm.sap.com.ResultDefinition resultDefinition) {
        this.criteria = criteria;
        this.resultDefinition = resultDefinition;
    }


    /**
     * Gets the criteria value for this MaritalStatusQuery.
     * 
     * @return criteria
     */
    public jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusCriteria getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this MaritalStatusQuery.
     * 
     * @param criteria
     */
    public void setCriteria(jsgx_mdm_hr.beans.ws.mdm.sap.com.MaritalStatusCriteria criteria) {
        this.criteria = criteria;
    }


    /**
     * Gets the resultDefinition value for this MaritalStatusQuery.
     * 
     * @return resultDefinition
     */
    public beans.ws.mdm.sap.com.ResultDefinition getResultDefinition() {
        return resultDefinition;
    }


    /**
     * Sets the resultDefinition value for this MaritalStatusQuery.
     * 
     * @param resultDefinition
     */
    public void setResultDefinition(beans.ws.mdm.sap.com.ResultDefinition resultDefinition) {
        this.resultDefinition = resultDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaritalStatusQuery)) return false;
        MaritalStatusQuery other = (MaritalStatusQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              this.criteria.equals(other.getCriteria()))) &&
            ((this.resultDefinition==null && other.getResultDefinition()==null) || 
             (this.resultDefinition!=null &&
              this.resultDefinition.equals(other.getResultDefinition())));
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
        if (getCriteria() != null) {
            _hashCode += getCriteria().hashCode();
        }
        if (getResultDefinition() != null) {
            _hashCode += getResultDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaritalStatusQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "MaritalStatusCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_hr", "resultDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ResultDefinition"));
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
