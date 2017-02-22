/**
 * FundcenterResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fundcenter.beans.ws.mdm.sap.com;

public class FundcenterResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private fundcenter.beans.ws.mdm.sap.com.Fundcenter[] fundcenter;

    public FundcenterResultSet() {
    }

    public FundcenterResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           fundcenter.beans.ws.mdm.sap.com.Fundcenter[] fundcenter) {
        super(
            executionStatus);
        this.fundcenter = fundcenter;
    }


    /**
     * Gets the fundcenter value for this FundcenterResultSet.
     * 
     * @return fundcenter
     */
    public fundcenter.beans.ws.mdm.sap.com.Fundcenter[] getFundcenter() {
        return fundcenter;
    }


    /**
     * Sets the fundcenter value for this FundcenterResultSet.
     * 
     * @param fundcenter
     */
    public void setFundcenter(fundcenter.beans.ws.mdm.sap.com.Fundcenter[] fundcenter) {
        this.fundcenter = fundcenter;
    }

    public fundcenter.beans.ws.mdm.sap.com.Fundcenter getFundcenter(int i) {
        return this.fundcenter[i];
    }

    public void setFundcenter(int i, fundcenter.beans.ws.mdm.sap.com.Fundcenter _value) {
        this.fundcenter[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundcenterResultSet)) return false;
        FundcenterResultSet other = (FundcenterResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fundcenter==null && other.getFundcenter()==null) || 
             (this.fundcenter!=null &&
              java.util.Arrays.equals(this.fundcenter, other.getFundcenter())));
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
        if (getFundcenter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFundcenter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFundcenter(), i);
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
        new org.apache.axis.description.TypeDesc(FundcenterResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundcenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "fundcenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "Fundcenter"));
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
