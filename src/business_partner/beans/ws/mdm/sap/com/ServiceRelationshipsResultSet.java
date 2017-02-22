/**
 * ServiceRelationshipsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package business_partner.beans.ws.mdm.sap.com;

public class ServiceRelationshipsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private business_partner.beans.ws.mdm.sap.com.ServiceRelationships[] serviceRelationships;

    public ServiceRelationshipsResultSet() {
    }

    public ServiceRelationshipsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           business_partner.beans.ws.mdm.sap.com.ServiceRelationships[] serviceRelationships) {
        super(
            executionStatus);
        this.serviceRelationships = serviceRelationships;
    }


    /**
     * Gets the serviceRelationships value for this ServiceRelationshipsResultSet.
     * 
     * @return serviceRelationships
     */
    public business_partner.beans.ws.mdm.sap.com.ServiceRelationships[] getServiceRelationships() {
        return serviceRelationships;
    }


    /**
     * Sets the serviceRelationships value for this ServiceRelationshipsResultSet.
     * 
     * @param serviceRelationships
     */
    public void setServiceRelationships(business_partner.beans.ws.mdm.sap.com.ServiceRelationships[] serviceRelationships) {
        this.serviceRelationships = serviceRelationships;
    }

    public business_partner.beans.ws.mdm.sap.com.ServiceRelationships getServiceRelationships(int i) {
        return this.serviceRelationships[i];
    }

    public void setServiceRelationships(int i, business_partner.beans.ws.mdm.sap.com.ServiceRelationships _value) {
        this.serviceRelationships[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsResultSet)) return false;
        ServiceRelationshipsResultSet other = (ServiceRelationshipsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.serviceRelationships==null && other.getServiceRelationships()==null) || 
             (this.serviceRelationships!=null &&
              java.util.Arrays.equals(this.serviceRelationships, other.getServiceRelationships())));
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
        if (getServiceRelationships() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceRelationships());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceRelationships(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "ServiceRelationshipsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "serviceRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "ServiceRelationships"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
