/**
 * TradePartnersResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package business_partner.beans.ws.mdm.sap.com;

public class TradePartnersResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private business_partner.beans.ws.mdm.sap.com.TradePartners[] tradePartners;

    public TradePartnersResultSet() {
    }

    public TradePartnersResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           business_partner.beans.ws.mdm.sap.com.TradePartners[] tradePartners) {
        super(
            executionStatus);
        this.tradePartners = tradePartners;
    }


    /**
     * Gets the tradePartners value for this TradePartnersResultSet.
     * 
     * @return tradePartners
     */
    public business_partner.beans.ws.mdm.sap.com.TradePartners[] getTradePartners() {
        return tradePartners;
    }


    /**
     * Sets the tradePartners value for this TradePartnersResultSet.
     * 
     * @param tradePartners
     */
    public void setTradePartners(business_partner.beans.ws.mdm.sap.com.TradePartners[] tradePartners) {
        this.tradePartners = tradePartners;
    }

    public business_partner.beans.ws.mdm.sap.com.TradePartners getTradePartners(int i) {
        return this.tradePartners[i];
    }

    public void setTradePartners(int i, business_partner.beans.ws.mdm.sap.com.TradePartners _value) {
        this.tradePartners[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TradePartnersResultSet)) return false;
        TradePartnersResultSet other = (TradePartnersResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tradePartners==null && other.getTradePartners()==null) || 
             (this.tradePartners!=null &&
              java.util.Arrays.equals(this.tradePartners, other.getTradePartners())));
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
        if (getTradePartners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTradePartners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTradePartners(), i);
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
        new org.apache.axis.description.TypeDesc(TradePartnersResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "TradePartnersResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradePartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "tradePartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "TradePartners"));
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
