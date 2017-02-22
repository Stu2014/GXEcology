/**
 * ServiceRelationshipsCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fundcenter.beans.ws.mdm.sap.com;

public class ServiceRelationshipsCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.TextCriteria cLIENT_SYSTEM;

    private beans.ws.mdm.sap.com.TextCriteria cLIENT_SYSTEM_NAME;

    private beans.ws.mdm.sap.com.PicklistCriteria dISTUS;

    private beans.ws.mdm.sap.com.TextCriteria dGUID;

    private beans.ws.mdm.sap.com.TextCriteria rETURN;

    public ServiceRelationshipsCriteria() {
    }

    public ServiceRelationshipsCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.TextCriteria cLIENT_SYSTEM,
           beans.ws.mdm.sap.com.TextCriteria cLIENT_SYSTEM_NAME,
           beans.ws.mdm.sap.com.PicklistCriteria dISTUS,
           beans.ws.mdm.sap.com.TextCriteria dGUID,
           beans.ws.mdm.sap.com.TextCriteria rETURN) {
        this.namedSearchCriteria = namedSearchCriteria;
        this.maskCriteria = maskCriteria;
        this.logicalOperator = logicalOperator;
        this.keywordCriteria = keywordCriteria;
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
        this.cLIENT_SYSTEM_NAME = cLIENT_SYSTEM_NAME;
        this.dISTUS = dISTUS;
        this.dGUID = dGUID;
        this.rETURN = rETURN;
    }


    /**
     * Gets the namedSearchCriteria value for this ServiceRelationshipsCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this ServiceRelationshipsCriteria.
     * 
     * @param namedSearchCriteria
     */
    public void setNamedSearchCriteria(java.lang.String[] namedSearchCriteria) {
        this.namedSearchCriteria = namedSearchCriteria;
    }

    public java.lang.String getNamedSearchCriteria(int i) {
        return this.namedSearchCriteria[i];
    }

    public void setNamedSearchCriteria(int i, java.lang.String _value) {
        this.namedSearchCriteria[i] = _value;
    }


    /**
     * Gets the maskCriteria value for this ServiceRelationshipsCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this ServiceRelationshipsCriteria.
     * 
     * @param maskCriteria
     */
    public void setMaskCriteria(java.lang.String[] maskCriteria) {
        this.maskCriteria = maskCriteria;
    }

    public java.lang.String getMaskCriteria(int i) {
        return this.maskCriteria[i];
    }

    public void setMaskCriteria(int i, java.lang.String _value) {
        this.maskCriteria[i] = _value;
    }


    /**
     * Gets the logicalOperator value for this ServiceRelationshipsCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this ServiceRelationshipsCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this ServiceRelationshipsCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this ServiceRelationshipsCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the cLIENT_SYSTEM value for this ServiceRelationshipsCriteria.
     * 
     * @return cLIENT_SYSTEM
     */
    public beans.ws.mdm.sap.com.TextCriteria getCLIENT_SYSTEM() {
        return cLIENT_SYSTEM;
    }


    /**
     * Sets the cLIENT_SYSTEM value for this ServiceRelationshipsCriteria.
     * 
     * @param cLIENT_SYSTEM
     */
    public void setCLIENT_SYSTEM(beans.ws.mdm.sap.com.TextCriteria cLIENT_SYSTEM) {
        this.cLIENT_SYSTEM = cLIENT_SYSTEM;
    }


    /**
     * Gets the cLIENT_SYSTEM_NAME value for this ServiceRelationshipsCriteria.
     * 
     * @return cLIENT_SYSTEM_NAME
     */
    public beans.ws.mdm.sap.com.TextCriteria getCLIENT_SYSTEM_NAME() {
        return cLIENT_SYSTEM_NAME;
    }


    /**
     * Sets the cLIENT_SYSTEM_NAME value for this ServiceRelationshipsCriteria.
     * 
     * @param cLIENT_SYSTEM_NAME
     */
    public void setCLIENT_SYSTEM_NAME(beans.ws.mdm.sap.com.TextCriteria cLIENT_SYSTEM_NAME) {
        this.cLIENT_SYSTEM_NAME = cLIENT_SYSTEM_NAME;
    }


    /**
     * Gets the dISTUS value for this ServiceRelationshipsCriteria.
     * 
     * @return dISTUS
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getDISTUS() {
        return dISTUS;
    }


    /**
     * Sets the dISTUS value for this ServiceRelationshipsCriteria.
     * 
     * @param dISTUS
     */
    public void setDISTUS(beans.ws.mdm.sap.com.PicklistCriteria dISTUS) {
        this.dISTUS = dISTUS;
    }


    /**
     * Gets the dGUID value for this ServiceRelationshipsCriteria.
     * 
     * @return dGUID
     */
    public beans.ws.mdm.sap.com.TextCriteria getDGUID() {
        return dGUID;
    }


    /**
     * Sets the dGUID value for this ServiceRelationshipsCriteria.
     * 
     * @param dGUID
     */
    public void setDGUID(beans.ws.mdm.sap.com.TextCriteria dGUID) {
        this.dGUID = dGUID;
    }


    /**
     * Gets the rETURN value for this ServiceRelationshipsCriteria.
     * 
     * @return rETURN
     */
    public beans.ws.mdm.sap.com.TextCriteria getRETURN() {
        return rETURN;
    }


    /**
     * Sets the rETURN value for this ServiceRelationshipsCriteria.
     * 
     * @param rETURN
     */
    public void setRETURN(beans.ws.mdm.sap.com.TextCriteria rETURN) {
        this.rETURN = rETURN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsCriteria)) return false;
        ServiceRelationshipsCriteria other = (ServiceRelationshipsCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.namedSearchCriteria==null && other.getNamedSearchCriteria()==null) || 
             (this.namedSearchCriteria!=null &&
              java.util.Arrays.equals(this.namedSearchCriteria, other.getNamedSearchCriteria()))) &&
            ((this.maskCriteria==null && other.getMaskCriteria()==null) || 
             (this.maskCriteria!=null &&
              java.util.Arrays.equals(this.maskCriteria, other.getMaskCriteria()))) &&
            ((this.logicalOperator==null && other.getLogicalOperator()==null) || 
             (this.logicalOperator!=null &&
              this.logicalOperator.equals(other.getLogicalOperator()))) &&
            ((this.keywordCriteria==null && other.getKeywordCriteria()==null) || 
             (this.keywordCriteria!=null &&
              this.keywordCriteria.equals(other.getKeywordCriteria()))) &&
            ((this.cLIENT_SYSTEM==null && other.getCLIENT_SYSTEM()==null) || 
             (this.cLIENT_SYSTEM!=null &&
              this.cLIENT_SYSTEM.equals(other.getCLIENT_SYSTEM()))) &&
            ((this.cLIENT_SYSTEM_NAME==null && other.getCLIENT_SYSTEM_NAME()==null) || 
             (this.cLIENT_SYSTEM_NAME!=null &&
              this.cLIENT_SYSTEM_NAME.equals(other.getCLIENT_SYSTEM_NAME()))) &&
            ((this.dISTUS==null && other.getDISTUS()==null) || 
             (this.dISTUS!=null &&
              this.dISTUS.equals(other.getDISTUS()))) &&
            ((this.dGUID==null && other.getDGUID()==null) || 
             (this.dGUID!=null &&
              this.dGUID.equals(other.getDGUID()))) &&
            ((this.rETURN==null && other.getRETURN()==null) || 
             (this.rETURN!=null &&
              this.rETURN.equals(other.getRETURN())));
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
        if (getNamedSearchCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamedSearchCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamedSearchCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaskCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaskCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaskCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogicalOperator() != null) {
            _hashCode += getLogicalOperator().hashCode();
        }
        if (getKeywordCriteria() != null) {
            _hashCode += getKeywordCriteria().hashCode();
        }
        if (getCLIENT_SYSTEM() != null) {
            _hashCode += getCLIENT_SYSTEM().hashCode();
        }
        if (getCLIENT_SYSTEM_NAME() != null) {
            _hashCode += getCLIENT_SYSTEM_NAME().hashCode();
        }
        if (getDISTUS() != null) {
            _hashCode += getDISTUS().hashCode();
        }
        if (getDGUID() != null) {
            _hashCode += getDGUID().hashCode();
        }
        if (getRETURN() != null) {
            _hashCode += getRETURN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "namedSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "maskCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "logicalOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "keywordCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeywordConstraint"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_SYSTEM");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "cLIENT_SYSTEM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIENT_SYSTEM_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "cLIENT_SYSTEM_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DISTUS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "dISTUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "dGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RETURN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "rETURN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
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
