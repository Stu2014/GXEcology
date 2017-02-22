/**
 * FundcenterCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fundcenter.beans.ws.mdm.sap.com;

public class FundcenterCriteria  extends base.core.mdm.sap.com.AbstractMdmDataObject  implements java.io.Serializable {
    private java.lang.String[] namedSearchCriteria;

    private java.lang.String[] maskCriteria;

    private java.lang.String logicalOperator;

    private beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria;

    private beans.ws.mdm.sap.com.TextCriteria applyNumber;

    private beans.ws.mdm.sap.com.TextCriteria fIKRS;

    private beans.ws.mdm.sap.com.TextCriteria fICTR;

    private beans.ws.mdm.sap.com.TextCriteria bEZEICH;

    private beans.ws.mdm.sap.com.TextCriteria bESCHR;

    private beans.ws.mdm.sap.com.DateTimeCriteria dATAB;

    private beans.ws.mdm.sap.com.DateTimeCriteria dATBIS;

    private beans.ws.mdm.sap.com.BooleanCriteria lVOMA;

    private beans.ws.mdm.sap.com.PicklistCriteria aPCOD;

    private beans.ws.mdm.sap.com.TextCriteria applicant;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyData;

    private beans.ws.mdm.sap.com.DateTimeCriteria applyTime;

    private beans.ws.mdm.sap.com.TextCriteria createBy;

    private beans.ws.mdm.sap.com.DateTimeCriteria createDate;

    private beans.ws.mdm.sap.com.TextCriteria updateBy;

    private beans.ws.mdm.sap.com.BooleanCriteria dATAC;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleClient;

    private beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDistrbution;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleGUID;

    private beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleMessage;

    private beans.ws.mdm.sap.com.PicklistCriteria operation;

    public FundcenterCriteria() {
    }

    public FundcenterCriteria(
           java.lang.String[] namedSearchCriteria,
           java.lang.String[] maskCriteria,
           java.lang.String logicalOperator,
           beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria,
           beans.ws.mdm.sap.com.TextCriteria applyNumber,
           beans.ws.mdm.sap.com.TextCriteria fIKRS,
           beans.ws.mdm.sap.com.TextCriteria fICTR,
           beans.ws.mdm.sap.com.TextCriteria bEZEICH,
           beans.ws.mdm.sap.com.TextCriteria bESCHR,
           beans.ws.mdm.sap.com.DateTimeCriteria dATAB,
           beans.ws.mdm.sap.com.DateTimeCriteria dATBIS,
           beans.ws.mdm.sap.com.BooleanCriteria lVOMA,
           beans.ws.mdm.sap.com.PicklistCriteria aPCOD,
           beans.ws.mdm.sap.com.TextCriteria applicant,
           beans.ws.mdm.sap.com.DateTimeCriteria applyData,
           beans.ws.mdm.sap.com.DateTimeCriteria applyTime,
           beans.ws.mdm.sap.com.TextCriteria createBy,
           beans.ws.mdm.sap.com.DateTimeCriteria createDate,
           beans.ws.mdm.sap.com.TextCriteria updateBy,
           beans.ws.mdm.sap.com.BooleanCriteria dATAC,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleClient,
           beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDistrbution,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleGUID,
           beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleMessage,
           beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.namedSearchCriteria = namedSearchCriteria;
        this.maskCriteria = maskCriteria;
        this.logicalOperator = logicalOperator;
        this.keywordCriteria = keywordCriteria;
        this.applyNumber = applyNumber;
        this.fIKRS = fIKRS;
        this.fICTR = fICTR;
        this.bEZEICH = bEZEICH;
        this.bESCHR = bESCHR;
        this.dATAB = dATAB;
        this.dATBIS = dATBIS;
        this.lVOMA = lVOMA;
        this.aPCOD = aPCOD;
        this.applicant = applicant;
        this.applyData = applyData;
        this.applyTime = applyTime;
        this.createBy = createBy;
        this.createDate = createDate;
        this.updateBy = updateBy;
        this.dATAC = dATAC;
        this.serviceRelationshipsTupleClient = serviceRelationshipsTupleClient;
        this.serviceRelationshipsTupleDistrbution = serviceRelationshipsTupleDistrbution;
        this.serviceRelationshipsTupleGUID = serviceRelationshipsTupleGUID;
        this.serviceRelationshipsTupleMessage = serviceRelationshipsTupleMessage;
        this.operation = operation;
    }


    /**
     * Gets the namedSearchCriteria value for this FundcenterCriteria.
     * 
     * @return namedSearchCriteria
     */
    public java.lang.String[] getNamedSearchCriteria() {
        return namedSearchCriteria;
    }


    /**
     * Sets the namedSearchCriteria value for this FundcenterCriteria.
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
     * Gets the maskCriteria value for this FundcenterCriteria.
     * 
     * @return maskCriteria
     */
    public java.lang.String[] getMaskCriteria() {
        return maskCriteria;
    }


    /**
     * Sets the maskCriteria value for this FundcenterCriteria.
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
     * Gets the logicalOperator value for this FundcenterCriteria.
     * 
     * @return logicalOperator
     */
    public java.lang.String getLogicalOperator() {
        return logicalOperator;
    }


    /**
     * Sets the logicalOperator value for this FundcenterCriteria.
     * 
     * @param logicalOperator
     */
    public void setLogicalOperator(java.lang.String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }


    /**
     * Gets the keywordCriteria value for this FundcenterCriteria.
     * 
     * @return keywordCriteria
     */
    public beans.ws.mdm.sap.com.KeywordConstraint getKeywordCriteria() {
        return keywordCriteria;
    }


    /**
     * Sets the keywordCriteria value for this FundcenterCriteria.
     * 
     * @param keywordCriteria
     */
    public void setKeywordCriteria(beans.ws.mdm.sap.com.KeywordConstraint keywordCriteria) {
        this.keywordCriteria = keywordCriteria;
    }


    /**
     * Gets the applyNumber value for this FundcenterCriteria.
     * 
     * @return applyNumber
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplyNumber() {
        return applyNumber;
    }


    /**
     * Sets the applyNumber value for this FundcenterCriteria.
     * 
     * @param applyNumber
     */
    public void setApplyNumber(beans.ws.mdm.sap.com.TextCriteria applyNumber) {
        this.applyNumber = applyNumber;
    }


    /**
     * Gets the fIKRS value for this FundcenterCriteria.
     * 
     * @return fIKRS
     */
    public beans.ws.mdm.sap.com.TextCriteria getFIKRS() {
        return fIKRS;
    }


    /**
     * Sets the fIKRS value for this FundcenterCriteria.
     * 
     * @param fIKRS
     */
    public void setFIKRS(beans.ws.mdm.sap.com.TextCriteria fIKRS) {
        this.fIKRS = fIKRS;
    }


    /**
     * Gets the fICTR value for this FundcenterCriteria.
     * 
     * @return fICTR
     */
    public beans.ws.mdm.sap.com.TextCriteria getFICTR() {
        return fICTR;
    }


    /**
     * Sets the fICTR value for this FundcenterCriteria.
     * 
     * @param fICTR
     */
    public void setFICTR(beans.ws.mdm.sap.com.TextCriteria fICTR) {
        this.fICTR = fICTR;
    }


    /**
     * Gets the bEZEICH value for this FundcenterCriteria.
     * 
     * @return bEZEICH
     */
    public beans.ws.mdm.sap.com.TextCriteria getBEZEICH() {
        return bEZEICH;
    }


    /**
     * Sets the bEZEICH value for this FundcenterCriteria.
     * 
     * @param bEZEICH
     */
    public void setBEZEICH(beans.ws.mdm.sap.com.TextCriteria bEZEICH) {
        this.bEZEICH = bEZEICH;
    }


    /**
     * Gets the bESCHR value for this FundcenterCriteria.
     * 
     * @return bESCHR
     */
    public beans.ws.mdm.sap.com.TextCriteria getBESCHR() {
        return bESCHR;
    }


    /**
     * Sets the bESCHR value for this FundcenterCriteria.
     * 
     * @param bESCHR
     */
    public void setBESCHR(beans.ws.mdm.sap.com.TextCriteria bESCHR) {
        this.bESCHR = bESCHR;
    }


    /**
     * Gets the dATAB value for this FundcenterCriteria.
     * 
     * @return dATAB
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getDATAB() {
        return dATAB;
    }


    /**
     * Sets the dATAB value for this FundcenterCriteria.
     * 
     * @param dATAB
     */
    public void setDATAB(beans.ws.mdm.sap.com.DateTimeCriteria dATAB) {
        this.dATAB = dATAB;
    }


    /**
     * Gets the dATBIS value for this FundcenterCriteria.
     * 
     * @return dATBIS
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getDATBIS() {
        return dATBIS;
    }


    /**
     * Sets the dATBIS value for this FundcenterCriteria.
     * 
     * @param dATBIS
     */
    public void setDATBIS(beans.ws.mdm.sap.com.DateTimeCriteria dATBIS) {
        this.dATBIS = dATBIS;
    }


    /**
     * Gets the lVOMA value for this FundcenterCriteria.
     * 
     * @return lVOMA
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getLVOMA() {
        return lVOMA;
    }


    /**
     * Sets the lVOMA value for this FundcenterCriteria.
     * 
     * @param lVOMA
     */
    public void setLVOMA(beans.ws.mdm.sap.com.BooleanCriteria lVOMA) {
        this.lVOMA = lVOMA;
    }


    /**
     * Gets the aPCOD value for this FundcenterCriteria.
     * 
     * @return aPCOD
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getAPCOD() {
        return aPCOD;
    }


    /**
     * Sets the aPCOD value for this FundcenterCriteria.
     * 
     * @param aPCOD
     */
    public void setAPCOD(beans.ws.mdm.sap.com.PicklistCriteria aPCOD) {
        this.aPCOD = aPCOD;
    }


    /**
     * Gets the applicant value for this FundcenterCriteria.
     * 
     * @return applicant
     */
    public beans.ws.mdm.sap.com.TextCriteria getApplicant() {
        return applicant;
    }


    /**
     * Sets the applicant value for this FundcenterCriteria.
     * 
     * @param applicant
     */
    public void setApplicant(beans.ws.mdm.sap.com.TextCriteria applicant) {
        this.applicant = applicant;
    }


    /**
     * Gets the applyData value for this FundcenterCriteria.
     * 
     * @return applyData
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyData() {
        return applyData;
    }


    /**
     * Sets the applyData value for this FundcenterCriteria.
     * 
     * @param applyData
     */
    public void setApplyData(beans.ws.mdm.sap.com.DateTimeCriteria applyData) {
        this.applyData = applyData;
    }


    /**
     * Gets the applyTime value for this FundcenterCriteria.
     * 
     * @return applyTime
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getApplyTime() {
        return applyTime;
    }


    /**
     * Sets the applyTime value for this FundcenterCriteria.
     * 
     * @param applyTime
     */
    public void setApplyTime(beans.ws.mdm.sap.com.DateTimeCriteria applyTime) {
        this.applyTime = applyTime;
    }


    /**
     * Gets the createBy value for this FundcenterCriteria.
     * 
     * @return createBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getCreateBy() {
        return createBy;
    }


    /**
     * Sets the createBy value for this FundcenterCriteria.
     * 
     * @param createBy
     */
    public void setCreateBy(beans.ws.mdm.sap.com.TextCriteria createBy) {
        this.createBy = createBy;
    }


    /**
     * Gets the createDate value for this FundcenterCriteria.
     * 
     * @return createDate
     */
    public beans.ws.mdm.sap.com.DateTimeCriteria getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this FundcenterCriteria.
     * 
     * @param createDate
     */
    public void setCreateDate(beans.ws.mdm.sap.com.DateTimeCriteria createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the updateBy value for this FundcenterCriteria.
     * 
     * @return updateBy
     */
    public beans.ws.mdm.sap.com.TextCriteria getUpdateBy() {
        return updateBy;
    }


    /**
     * Sets the updateBy value for this FundcenterCriteria.
     * 
     * @param updateBy
     */
    public void setUpdateBy(beans.ws.mdm.sap.com.TextCriteria updateBy) {
        this.updateBy = updateBy;
    }


    /**
     * Gets the dATAC value for this FundcenterCriteria.
     * 
     * @return dATAC
     */
    public beans.ws.mdm.sap.com.BooleanCriteria getDATAC() {
        return dATAC;
    }


    /**
     * Sets the dATAC value for this FundcenterCriteria.
     * 
     * @param dATAC
     */
    public void setDATAC(beans.ws.mdm.sap.com.BooleanCriteria dATAC) {
        this.dATAC = dATAC;
    }


    /**
     * Gets the serviceRelationshipsTupleClient value for this FundcenterCriteria.
     * 
     * @return serviceRelationshipsTupleClient
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleClient() {
        return serviceRelationshipsTupleClient;
    }


    /**
     * Sets the serviceRelationshipsTupleClient value for this FundcenterCriteria.
     * 
     * @param serviceRelationshipsTupleClient
     */
    public void setServiceRelationshipsTupleClient(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleClient) {
        this.serviceRelationshipsTupleClient = serviceRelationshipsTupleClient;
    }


    /**
     * Gets the serviceRelationshipsTupleDistrbution value for this FundcenterCriteria.
     * 
     * @return serviceRelationshipsTupleDistrbution
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getServiceRelationshipsTupleDistrbution() {
        return serviceRelationshipsTupleDistrbution;
    }


    /**
     * Sets the serviceRelationshipsTupleDistrbution value for this FundcenterCriteria.
     * 
     * @param serviceRelationshipsTupleDistrbution
     */
    public void setServiceRelationshipsTupleDistrbution(beans.ws.mdm.sap.com.PicklistCriteria serviceRelationshipsTupleDistrbution) {
        this.serviceRelationshipsTupleDistrbution = serviceRelationshipsTupleDistrbution;
    }


    /**
     * Gets the serviceRelationshipsTupleGUID value for this FundcenterCriteria.
     * 
     * @return serviceRelationshipsTupleGUID
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleGUID() {
        return serviceRelationshipsTupleGUID;
    }


    /**
     * Sets the serviceRelationshipsTupleGUID value for this FundcenterCriteria.
     * 
     * @param serviceRelationshipsTupleGUID
     */
    public void setServiceRelationshipsTupleGUID(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleGUID) {
        this.serviceRelationshipsTupleGUID = serviceRelationshipsTupleGUID;
    }


    /**
     * Gets the serviceRelationshipsTupleMessage value for this FundcenterCriteria.
     * 
     * @return serviceRelationshipsTupleMessage
     */
    public beans.ws.mdm.sap.com.TextCriteria getServiceRelationshipsTupleMessage() {
        return serviceRelationshipsTupleMessage;
    }


    /**
     * Sets the serviceRelationshipsTupleMessage value for this FundcenterCriteria.
     * 
     * @param serviceRelationshipsTupleMessage
     */
    public void setServiceRelationshipsTupleMessage(beans.ws.mdm.sap.com.TextCriteria serviceRelationshipsTupleMessage) {
        this.serviceRelationshipsTupleMessage = serviceRelationshipsTupleMessage;
    }


    /**
     * Gets the operation value for this FundcenterCriteria.
     * 
     * @return operation
     */
    public beans.ws.mdm.sap.com.PicklistCriteria getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this FundcenterCriteria.
     * 
     * @param operation
     */
    public void setOperation(beans.ws.mdm.sap.com.PicklistCriteria operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundcenterCriteria)) return false;
        FundcenterCriteria other = (FundcenterCriteria) obj;
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
            ((this.applyNumber==null && other.getApplyNumber()==null) || 
             (this.applyNumber!=null &&
              this.applyNumber.equals(other.getApplyNumber()))) &&
            ((this.fIKRS==null && other.getFIKRS()==null) || 
             (this.fIKRS!=null &&
              this.fIKRS.equals(other.getFIKRS()))) &&
            ((this.fICTR==null && other.getFICTR()==null) || 
             (this.fICTR!=null &&
              this.fICTR.equals(other.getFICTR()))) &&
            ((this.bEZEICH==null && other.getBEZEICH()==null) || 
             (this.bEZEICH!=null &&
              this.bEZEICH.equals(other.getBEZEICH()))) &&
            ((this.bESCHR==null && other.getBESCHR()==null) || 
             (this.bESCHR!=null &&
              this.bESCHR.equals(other.getBESCHR()))) &&
            ((this.dATAB==null && other.getDATAB()==null) || 
             (this.dATAB!=null &&
              this.dATAB.equals(other.getDATAB()))) &&
            ((this.dATBIS==null && other.getDATBIS()==null) || 
             (this.dATBIS!=null &&
              this.dATBIS.equals(other.getDATBIS()))) &&
            ((this.lVOMA==null && other.getLVOMA()==null) || 
             (this.lVOMA!=null &&
              this.lVOMA.equals(other.getLVOMA()))) &&
            ((this.aPCOD==null && other.getAPCOD()==null) || 
             (this.aPCOD!=null &&
              this.aPCOD.equals(other.getAPCOD()))) &&
            ((this.applicant==null && other.getApplicant()==null) || 
             (this.applicant!=null &&
              this.applicant.equals(other.getApplicant()))) &&
            ((this.applyData==null && other.getApplyData()==null) || 
             (this.applyData!=null &&
              this.applyData.equals(other.getApplyData()))) &&
            ((this.applyTime==null && other.getApplyTime()==null) || 
             (this.applyTime!=null &&
              this.applyTime.equals(other.getApplyTime()))) &&
            ((this.createBy==null && other.getCreateBy()==null) || 
             (this.createBy!=null &&
              this.createBy.equals(other.getCreateBy()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.updateBy==null && other.getUpdateBy()==null) || 
             (this.updateBy!=null &&
              this.updateBy.equals(other.getUpdateBy()))) &&
            ((this.dATAC==null && other.getDATAC()==null) || 
             (this.dATAC!=null &&
              this.dATAC.equals(other.getDATAC()))) &&
            ((this.serviceRelationshipsTupleClient==null && other.getServiceRelationshipsTupleClient()==null) || 
             (this.serviceRelationshipsTupleClient!=null &&
              this.serviceRelationshipsTupleClient.equals(other.getServiceRelationshipsTupleClient()))) &&
            ((this.serviceRelationshipsTupleDistrbution==null && other.getServiceRelationshipsTupleDistrbution()==null) || 
             (this.serviceRelationshipsTupleDistrbution!=null &&
              this.serviceRelationshipsTupleDistrbution.equals(other.getServiceRelationshipsTupleDistrbution()))) &&
            ((this.serviceRelationshipsTupleGUID==null && other.getServiceRelationshipsTupleGUID()==null) || 
             (this.serviceRelationshipsTupleGUID!=null &&
              this.serviceRelationshipsTupleGUID.equals(other.getServiceRelationshipsTupleGUID()))) &&
            ((this.serviceRelationshipsTupleMessage==null && other.getServiceRelationshipsTupleMessage()==null) || 
             (this.serviceRelationshipsTupleMessage!=null &&
              this.serviceRelationshipsTupleMessage.equals(other.getServiceRelationshipsTupleMessage()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        if (getApplyNumber() != null) {
            _hashCode += getApplyNumber().hashCode();
        }
        if (getFIKRS() != null) {
            _hashCode += getFIKRS().hashCode();
        }
        if (getFICTR() != null) {
            _hashCode += getFICTR().hashCode();
        }
        if (getBEZEICH() != null) {
            _hashCode += getBEZEICH().hashCode();
        }
        if (getBESCHR() != null) {
            _hashCode += getBESCHR().hashCode();
        }
        if (getDATAB() != null) {
            _hashCode += getDATAB().hashCode();
        }
        if (getDATBIS() != null) {
            _hashCode += getDATBIS().hashCode();
        }
        if (getLVOMA() != null) {
            _hashCode += getLVOMA().hashCode();
        }
        if (getAPCOD() != null) {
            _hashCode += getAPCOD().hashCode();
        }
        if (getApplicant() != null) {
            _hashCode += getApplicant().hashCode();
        }
        if (getApplyData() != null) {
            _hashCode += getApplyData().hashCode();
        }
        if (getApplyTime() != null) {
            _hashCode += getApplyTime().hashCode();
        }
        if (getCreateBy() != null) {
            _hashCode += getCreateBy().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getUpdateBy() != null) {
            _hashCode += getUpdateBy().hashCode();
        }
        if (getDATAC() != null) {
            _hashCode += getDATAC().hashCode();
        }
        if (getServiceRelationshipsTupleClient() != null) {
            _hashCode += getServiceRelationshipsTupleClient().hashCode();
        }
        if (getServiceRelationshipsTupleDistrbution() != null) {
            _hashCode += getServiceRelationshipsTupleDistrbution().hashCode();
        }
        if (getServiceRelationshipsTupleGUID() != null) {
            _hashCode += getServiceRelationshipsTupleGUID().hashCode();
        }
        if (getServiceRelationshipsTupleMessage() != null) {
            _hashCode += getServiceRelationshipsTupleMessage().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FundcenterCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterCriteria"));
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
        elemField.setFieldName("applyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "applyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "fIKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FICTR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "fICTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BEZEICH");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "bEZEICH"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BESCHR");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "bESCHR"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "dATAB"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATBIS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "dATBIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LVOMA");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "lVOMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "aPCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "applicant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "applyData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "applyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "createBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "updateBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAC");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "dATAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleClient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "serviceRelationshipsTupleClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleDistrbution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "serviceRelationshipsTupleDistrbution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "serviceRelationshipsTupleGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRelationshipsTupleMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "serviceRelationshipsTupleMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria"));
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
