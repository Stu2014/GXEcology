/**
 * ServiceRelationshipsTupleTuple.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fundcenter.beans.ws.mdm.sap.com;

public class ServiceRelationshipsTupleTuple  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String message;

    private java.lang.String displayValue;

    private java.lang.Boolean removeTupleValueIndicator;

    private fundcenter.beans.ws.mdm.sap.com.ClientLookup client;

    private fundcenter.beans.ws.mdm.sap.com.DistributionStatusLookup distrbution;

    private beans.ws.mdm.sap.com.MultilingualText[] gUID;

    private beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId;

    public ServiceRelationshipsTupleTuple() {
    }

    public ServiceRelationshipsTupleTuple(
           java.lang.String message,
           java.lang.String displayValue,
           java.lang.Boolean removeTupleValueIndicator,
           fundcenter.beans.ws.mdm.sap.com.ClientLookup client,
           fundcenter.beans.ws.mdm.sap.com.DistributionStatusLookup distrbution,
           beans.ws.mdm.sap.com.MultilingualText[] gUID,
           beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.message = message;
        this.displayValue = displayValue;
        this.removeTupleValueIndicator = removeTupleValueIndicator;
        this.client = client;
        this.distrbution = distrbution;
        this.gUID = gUID;
        this.tupleValueId = tupleValueId;
    }


    /**
     * Gets the message value for this ServiceRelationshipsTupleTuple.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ServiceRelationshipsTupleTuple.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the displayValue value for this ServiceRelationshipsTupleTuple.
     * 
     * @return displayValue
     */
    public java.lang.String getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this ServiceRelationshipsTupleTuple.
     * 
     * @param displayValue
     */
    public void setDisplayValue(java.lang.String displayValue) {
        this.displayValue = displayValue;
    }


    /**
     * Gets the removeTupleValueIndicator value for this ServiceRelationshipsTupleTuple.
     * 
     * @return removeTupleValueIndicator
     */
    public java.lang.Boolean getRemoveTupleValueIndicator() {
        return removeTupleValueIndicator;
    }


    /**
     * Sets the removeTupleValueIndicator value for this ServiceRelationshipsTupleTuple.
     * 
     * @param removeTupleValueIndicator
     */
    public void setRemoveTupleValueIndicator(java.lang.Boolean removeTupleValueIndicator) {
        this.removeTupleValueIndicator = removeTupleValueIndicator;
    }


    /**
     * Gets the client value for this ServiceRelationshipsTupleTuple.
     * 
     * @return client
     */
    public fundcenter.beans.ws.mdm.sap.com.ClientLookup getClient() {
        return client;
    }


    /**
     * Sets the client value for this ServiceRelationshipsTupleTuple.
     * 
     * @param client
     */
    public void setClient(fundcenter.beans.ws.mdm.sap.com.ClientLookup client) {
        this.client = client;
    }


    /**
     * Gets the distrbution value for this ServiceRelationshipsTupleTuple.
     * 
     * @return distrbution
     */
    public fundcenter.beans.ws.mdm.sap.com.DistributionStatusLookup getDistrbution() {
        return distrbution;
    }


    /**
     * Sets the distrbution value for this ServiceRelationshipsTupleTuple.
     * 
     * @param distrbution
     */
    public void setDistrbution(fundcenter.beans.ws.mdm.sap.com.DistributionStatusLookup distrbution) {
        this.distrbution = distrbution;
    }


    /**
     * Gets the gUID value for this ServiceRelationshipsTupleTuple.
     * 
     * @return gUID
     */
    public beans.ws.mdm.sap.com.MultilingualText[] getGUID() {
        return gUID;
    }


    /**
     * Sets the gUID value for this ServiceRelationshipsTupleTuple.
     * 
     * @param gUID
     */
    public void setGUID(beans.ws.mdm.sap.com.MultilingualText[] gUID) {
        this.gUID = gUID;
    }

    public beans.ws.mdm.sap.com.MultilingualText getGUID(int i) {
        return this.gUID[i];
    }

    public void setGUID(int i, beans.ws.mdm.sap.com.MultilingualText _value) {
        this.gUID[i] = _value;
    }


    /**
     * Gets the tupleValueId value for this ServiceRelationshipsTupleTuple.
     * 
     * @return tupleValueId
     */
    public beans.ws.mdm.sap.com.BasicRecordIdentification getTupleValueId() {
        return tupleValueId;
    }


    /**
     * Sets the tupleValueId value for this ServiceRelationshipsTupleTuple.
     * 
     * @param tupleValueId
     */
    public void setTupleValueId(beans.ws.mdm.sap.com.BasicRecordIdentification tupleValueId) {
        this.tupleValueId = tupleValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRelationshipsTupleTuple)) return false;
        ServiceRelationshipsTupleTuple other = (ServiceRelationshipsTupleTuple) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              this.displayValue.equals(other.getDisplayValue()))) &&
            ((this.removeTupleValueIndicator==null && other.getRemoveTupleValueIndicator()==null) || 
             (this.removeTupleValueIndicator!=null &&
              this.removeTupleValueIndicator.equals(other.getRemoveTupleValueIndicator()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.distrbution==null && other.getDistrbution()==null) || 
             (this.distrbution!=null &&
              this.distrbution.equals(other.getDistrbution()))) &&
            ((this.gUID==null && other.getGUID()==null) || 
             (this.gUID!=null &&
              java.util.Arrays.equals(this.gUID, other.getGUID()))) &&
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getDisplayValue() != null) {
            _hashCode += getDisplayValue().hashCode();
        }
        if (getRemoveTupleValueIndicator() != null) {
            _hashCode += getRemoveTupleValueIndicator().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getDistrbution() != null) {
            _hashCode += getDistrbution().hashCode();
        }
        if (getGUID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGUID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGUID(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceRelationshipsTupleTuple.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsTupleTuple"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeTupleValueIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "removeTupleValueIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distrbution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "distrbution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusLookup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "gUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "MultilingualText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tupleValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "tupleValueId"));
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
