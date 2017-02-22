/**
 * ServiceRelationshipsUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fundcenter.beans.ws.mdm.sap.com;

public class ServiceRelationshipsUpdate  extends fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsCreate  implements java.io.Serializable {
    private fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsID recordIdentification;

    public ServiceRelationshipsUpdate() {
    }

    public ServiceRelationshipsUpdate(
           java.lang.String cLIENT_SYSTEM_NAME,
           java.lang.String dGUID,
           java.lang.String rETURN,
           beans.ws.mdm.sap.com.MultilingualText[] cLIENT_SYSTEM,
           fundcenter.beans.ws.mdm.sap.com.DistributionStatusLookup dISTUS,
           fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsID recordIdentification) {
        super(
            cLIENT_SYSTEM_NAME,
            dGUID,
            rETURN,
            cLIENT_SYSTEM,
            dISTUS);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this ServiceRelationshipsUpdate.
     * 
     * @return recordIdentification
     */
    public fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this ServiceRelationshipsUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsUpdate)) return false;
        ServiceRelationshipsUpdate other = (ServiceRelationshipsUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.recordIdentification==null && other.getRecordIdentification()==null) || 
             (this.recordIdentification!=null &&
              this.recordIdentification.equals(other.getRecordIdentification())));
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
        if (getRecordIdentification() != null) {
            _hashCode += getRecordIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsID"));
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
