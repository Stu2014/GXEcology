/**
 * BanksUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package business_partner.beans.ws.mdm.sap.com;

public class BanksUpdate  extends business_partner.beans.ws.mdm.sap.com.BanksCreate  implements java.io.Serializable {
    private business_partner.beans.ws.mdm.sap.com.BanksID recordIdentification;

    public BanksUpdate() {
    }

    public BanksUpdate(
           java.lang.String applyNumber,
           java.lang.String bANKL,
           java.lang.String bANKA,
           java.lang.String sTRAS,
           java.lang.String oRT01,
           java.lang.String bRNCH,
           java.lang.String aPMEM,
           java.lang.String applicant,
           java.lang.String updateBy,
           java.lang.Boolean dATAC,
           business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS,
           business_partner.beans.ws.mdm.sap.com.RegionsLookup pROVZ,
           business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup aPCOD,
           java.util.Calendar applyDate,
           java.util.Calendar applyTime,
           business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple[] serviceRelationshipsTuple,
           business_partner.beans.ws.mdm.sap.com.OperationLookup operation,
           beans.ws.mdm.sap.com.KeyMapping[] keyMapping,
           business_partner.beans.ws.mdm.sap.com.BanksID recordIdentification) {
        super(
            applyNumber,
            bANKL,
            bANKA,
            sTRAS,
            oRT01,
            bRNCH,
            aPMEM,
            applicant,
            updateBy,
            dATAC,
            bANKS,
            pROVZ,
            aPCOD,
            applyDate,
            applyTime,
            serviceRelationshipsTuple,
            operation,
            keyMapping);
        this.recordIdentification = recordIdentification;
    }


    /**
     * Gets the recordIdentification value for this BanksUpdate.
     * 
     * @return recordIdentification
     */
    public business_partner.beans.ws.mdm.sap.com.BanksID getRecordIdentification() {
        return recordIdentification;
    }


    /**
     * Sets the recordIdentification value for this BanksUpdate.
     * 
     * @param recordIdentification
     */
    public void setRecordIdentification(business_partner.beans.ws.mdm.sap.com.BanksID recordIdentification) {
        this.recordIdentification = recordIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BanksUpdate)) return false;
        BanksUpdate other = (BanksUpdate) obj;
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
        new org.apache.axis.description.TypeDesc(BanksUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "BanksUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "recordIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "BanksID"));
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
