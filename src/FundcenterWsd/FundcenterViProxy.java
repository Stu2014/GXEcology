package FundcenterWsd;

public class FundcenterViProxy implements FundcenterWsd.FundcenterVi {
  private String _endpoint = null;
  private FundcenterWsd.FundcenterVi fundcenterVi = null;
  
  public FundcenterViProxy() {
    _initFundcenterViProxy();
  }
  
  public FundcenterViProxy(String endpoint) {
    _endpoint = endpoint;
    _initFundcenterViProxy();
  }
  
  private void _initFundcenterViProxy() {
    try {
      fundcenterVi = (new FundcenterWsd.FundcenterLocator()).getFundcenter();
      if (fundcenterVi != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fundcenterVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fundcenterVi)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fundcenterVi != null)
      ((javax.xml.rpc.Stub)fundcenterVi)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public FundcenterWsd.FundcenterVi getFundcenterVi() {
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi;
  }
  
  public fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(fundcenter.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.searchApprovalStatus(query, reposInfo);
  }
  
  public fundcenter.beans.ws.mdm.sap.com.ClientResultSet searchClient(fundcenter.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.searchClient(query, reposInfo);
  }
  
  public fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(fundcenter.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.searchDistributionStatus(query, reposInfo);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] createFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterCreate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.createFundcenter(fundcenter, reposInfo, configurationParameters);
  }
  
  public beans.ws.mdm.sap.com.ExecutionStatus[] updateFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterUpdate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.updateFundcenter(fundcenter, reposInfo, configurationParameters);
  }
  
  public fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet searchFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.searchFundcenter(query, reposInfo);
  }
  
  public fundcenter.beans.ws.mdm.sap.com.OperationResultSet searchOperation(fundcenter.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.searchOperation(query, reposInfo);
  }
  
  public fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException{
    if (fundcenterVi == null)
      _initFundcenterViProxy();
    return fundcenterVi.searchServiceRelationships(query, reposInfo);
  }
  
  
}