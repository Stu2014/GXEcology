/**
 * SearchCommitmentltemResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package JSGX_MDM_FICOTRVi;

public class SearchCommitmentltemResponse  implements java.io.Serializable {
    private jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet response;

    public SearchCommitmentltemResponse() {
    }

    public SearchCommitmentltemResponse(
           jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet response) {
           this.response = response;
    }


    /**
     * Gets the response value for this SearchCommitmentltemResponse.
     * 
     * @return response
     */
    public jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet getResponse() {
        return response;
    }


    /**
     * Sets the response value for this SearchCommitmentltemResponse.
     * 
     * @param response
     */
    public void setResponse(jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchCommitmentltemResponse)) return false;
        SearchCommitmentltemResponse other = (SearchCommitmentltemResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchCommitmentltemResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", ">searchCommitmentltemResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:JSGX_MDM_FICOTRVi", "Response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.jsgx_mdm_ficotr", "CommitmentltemResultSet"));
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
