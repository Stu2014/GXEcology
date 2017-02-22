/**
 * DistributionStatusUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fundcenter.beans.ws.mdm.sap.com;

public class DistributionStatusUpdate  extends fundcenter.beans.ws.mdm.sap.com.DistributionStatusCreate  implements java.io.Serializable {
    private fundcenter.beans.ws.mdm.sap.com.DistributionStatusID recordIdentification;

    public DistributionStatusUpdate() {
    }

    public DistributionStatusUpdate(
           java.lang.String code,
           java.lang.String name,
           fundcenter.beans.ws.mdm.sap.com.DistributionStatusID recordIdentification) {
        super(
            code,
            name);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this DistributionStatusUpdate.
     * 
     * @return recordIdentification
     */
    public fundcenter.beans.ws.mdm.sap.com.DistributionStatusID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this DistributionStatusUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(fundcenter.beans.ws.mdm.sap.com.DistributionStatusID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributionStatusUpdate)) return false;
        DistributionStatusUpdate other = (DistributionStatusUpdate) obj;
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
        new org.apache.axis.description.TypeDesc(DistributionStatusUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusID"));
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