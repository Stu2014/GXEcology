/**
 * BankAccountsTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package business_partner.beans.ws.mdm.sap.com;

public class BankAccountsTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String bANKN;

    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS;

    private business_partner.beans.ws.mdm.sap.com.BanksLookup bANKL;

    private beans.ws.mdm.sap.com.MultilingualText[] kOINH;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public BankAccountsTuple() {
    }

    public BankAccountsTuple(
           java.lang.String bANKN,
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS,
           business_partner.beans.ws.mdm.sap.com.BanksLookup bANKL,
           beans.ws.mdm.sap.com.MultilingualText[] kOINH,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.bANKN = bANKN;
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.bANKS = bANKS;
        this.bANKL = bANKL;
        this.kOINH = kOINH;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the bANKN value for this BankAccountsTuple.
     * 
     * @return bANKN
     */
    public java.lang.String getBANKN() {
        return bANKN;
    }


    /**
     * Sets the bANKN value for this BankAccountsTuple.
     * 
     * @param bANKN
     */
    public void setBANKN(java.lang.String bANKN) {
        this.bANKN = bANKN;
    }


    /**
     * Gets the displayValue value for this BankAccountsTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this BankAccountsTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this BankAccountsTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this BankAccountsTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the bANKS value for this BankAccountsTuple.
     * 
     * @return bANKS
     */
    public business_partner.beans.ws.mdm.sap.com.CountriesLookup getBANKS() {
        return bANKS;
    }


    /**
     * Sets the bANKS value for this BankAccountsTuple.
     * 
     * @param bANKS
     */
    public void setBANKS(business_partner.beans.ws.mdm.sap.com.CountriesLookup bANKS) {
        this.bANKS = bANKS;
    }


    /**
     * Gets the bANKL value for this BankAccountsTuple.
     * 
     * @return bANKL
     */
    public business_partner.beans.ws.mdm.sap.com.BanksLookup getBANKL() {
        return bANKL;
    }


    /**
     * Sets the bANKL value for this BankAccountsTuple.
     * 
     * @param bANKL
     */
    public void setBANKL(business_partner.beans.ws.mdm.sap.com.BanksLookup bANKL) {
        this.bANKL = bANKL;
    }


    /**
     * Gets the kOINH value for this BankAccountsTuple.
     * 
     * @return kOINH
     */
    public beans.ws.mdm.sap.com.MultilingualText[] getKOINH() {
        return kOINH;
    }


    /**
     * Sets the kOINH value for this BankAccountsTuple.
     * 
     * @param kOINH
     */
    public void setKOINH(beans.ws.mdm.sap.com.MultilingualText[] kOINH) {
        this.kOINH = kOINH;
    }

    public beans.ws.mdm.sap.com.MultilingualText getKOINH(int i) {
        return this.kOINH[i];
    }

    public void setKOINH(int i, beans.ws.mdm.sap.com.MultilingualText _value) {
        this.kOINH[i] = _value;
    }


    /**
     * Gets the tupleValueId value for this BankAccountsTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this BankAccountsTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccountsTuple)) return false;
        BankAccountsTuple other = (BankAccountsTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bANKN==null && other.getBANKN()==null) || 
             (this.bANKN!=null &&
              this.bANKN.equals(other.getBANKN()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.bANKS==null && other.getBANKS()==null) || 
             (this.bANKS!=null &&
              this.bANKS.equals(other.getBANKS()))) &&
            ((this.bANKL==null && other.getBANKL()==null) || 
             (this.bANKL!=null &&
              this.bANKL.equals(other.getBANKL()))) &&
            ((this.kOINH==null && other.getKOINH()==null) || 
             (this.kOINH!=null &&
              java.util.Arrays.equals(this.kOINH, other.getKOINH()))) &&
            ((this.tupleValueId==null && other.getTupleValueId()==null) || 
             (this.tupleValueId!=null &&
              this.tupleValueId.equals(other.getTupleValueId())));
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
        if (getBANKN() != null) {
            _hashCode += getBANKN().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getBANKS() != null) {
            _hashCode += getBANKS().hashCode();
        }
        if (getBANKL() != null) {
            _hashCode += getBANKL().hashCode();
        }
        if (getKOINH() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKOINH());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKOINH(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTupleValueId() != null) {
            _hashCode += getTupleValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccountsTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "BankAccountsTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "bANKN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeTupleValueIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "removeTupleValueIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "bANKS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "CountriesLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BANKL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "bANKL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "BanksLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KOINH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "kOINH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "MultilingualText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tupleValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.business_partner", "tupleValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentification"));
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
