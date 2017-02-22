/**
 * FundcenterVi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FundcenterWsd;

public interface FundcenterVi extends java.rmi.Remote {
    public fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(fundcenter.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public fundcenter.beans.ws.mdm.sap.com.ClientResultSet searchClient(fundcenter.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(fundcenter.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] createFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterCreate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public beans.ws.mdm.sap.com.ExecutionStatus[] updateFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterUpdate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException;
    public fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet searchFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public fundcenter.beans.ws.mdm.sap.com.OperationResultSet searchOperation(fundcenter.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
    public fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException;
}
