/**
 * BusinessSectionsResultSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jsgx_mdm_business_partner.beans.ws.mdm.sap.com;

public class BusinessSectionsResultSet  extends beans.ws.mdm.sap.com.ResultSetBase  implements java.io.Serializable {
    private jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSections[] businessSections;

    public BusinessSectionsResultSet() {
    }

    public BusinessSectionsResultSet(
           beans.ws.mdm.sap.com.ExecutionStatus executionStatus,
           jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSections[] businessSections) {
        super(
            executionStatus);
        this.businessSections = businessSections;
    }


    /**
     * Gets the businessSections value for this BusinessSectionsResultSet.
     * 
     * @return businessSections
     */
    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSections[] getBusinessSections() {
        return businessSections;
    }


    /**
     * Sets the businessSections value for this BusinessSectionsResultSet.
     * 
     * @param businessSections
     */
    public void setBusinessSections(jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSections[] businessSections) {
        this.businessSections = businessSections;
    }

    public jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSections getBusinessSections(int i) {
        return this.businessSections[i];
    }

    public void setBusinessSections(int i, jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BusinessSections _value) {
        this.businessSections[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessSectionsResultSet)) return false;
        BusinessSectionsResultSet other = (BusinessSectionsResultSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessSections==null && other.getBusinessSections()==null) || 
             (this.businessSections!=null &&
              java.util.Arrays.equals(this.businessSections, other.getBusinessSections())));
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
        if (getBusinessSections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusinessSections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusinessSections(), i);
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
        new org.apache.axis.description.TypeDesc(BusinessSectionsResultSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSectionsResultSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessSections");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "businessSections"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_business_partner", "BusinessSections"));
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
