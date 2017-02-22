package weaver.interfaces.gx.jyl.cnxm;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ClientLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentItemCategoryLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemCriteria;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemID;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemQuery;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemResultSet;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.CommitmentltemUpdate;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.FinanciaTransactionLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_ficotr.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import JSGX_MDM_FICOTRWsd.JSGX_MDM_FICOTRViProxy;
import beans.ws.mdm.sap.com.ExecutionStatus;
import beans.ws.mdm.sap.com.UpdateConfigurationParameters;

/**
 * 承诺项目修改主数据接口
 */
public class CNXMModifyAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethods = new PublicMethod();

    private CNXMPublicMethod publicmethod = new CNXMPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("承诺项目退回操作，不执行接口.");
            return SUCCESS;
        }
        //财务管理范围-值
        String cwglfw_value = "";
        //财务管理范围-字段
        String cwglfw_column = "cwglfw";
        //承诺项目编码-值
        String cnxmbm_value = "";
        //承诺项目编码-字段
        String cnxmbm_column = "cnxmbm";
        //承诺项目名称-值
        String cnxmmc_value = "";
        //承诺项目名称-字段
        String cnxmmc_column = "cnxmmc";
        //承诺项目说明-值
        String cnxmms_value = "";
        //承诺项目说明-字段
        String cnxmms_column = "cnxmms";
        //财务业务-值
        String cwyw_value = "";
        //财务业务-字段
        String cwyw_column = "cwyw";
        //承诺项目类别-值
        String cnxmlb_value = "";
        //承诺项目类别-字段
        String cnxmlb_column = "cnxmlb";
        //上层承诺项目-值
        String sccnxm_value = "";
        //上层承诺项目-字段
        String sccnxm_column = "sccnxm";
        //明细承诺项目标示（可记账）-值
        String mxcnxmbz_value = "";
        //明细承诺项目标示（可记账）-字段
        String mxcnxmbz_column = "mxcnxmbz";
        //统计承诺项目-值
        String tjcnxm_value = "";
        //统计承诺项目-字段
        String tjcnxm_column = "tjcnxm";
        //审批状态代码-值
        String spzt_value = "";
        //审批状态代码-字段
        String spzt_column = "spzt";
        //申请人-值
        String sqr_value = "";
        //申请人-字段
        String sqr_column = "sqr";
        //操作标识-值
        String czbs_value = "";
        //操作标识-字段
        String czbs_column = "czbs";
        //人事范围-值
        String gsdm_value = "";
        //人事范围-字段
        String gsdm_column = "gsdm";
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(cwglfw_column)) {
                cwglfw_value = value;
            }
            if (name.equals(cnxmbm_column)) {
                cnxmbm_value = value;
            }
            if (name.equals(cnxmmc_column)) {
                cnxmmc_value = value;
            }
            if (name.equals(cnxmms_column)) {
                cnxmms_value = value;
            }
            if (name.equals(cwyw_column)) {
                cwyw_value = value;
            }
            if (name.equals(cnxmlb_column)) {
                cnxmlb_value = value;
            }
            if (name.equals(sccnxm_column)) {
                sccnxm_value = value;
            }
            if (name.equals(mxcnxmbz_column)) {
                mxcnxmbz_value = value;
            }
            if (name.equals(tjcnxm_column)) {
                tjcnxm_value = value;
            }
            if (name.equals(spzt_column)) {
                spzt_value = value;
            }
            if (name.equals(sqr_column)) {
                sqr_value = value;
            }
            if (name.equals(czbs_column)) {
                czbs_value = value;
            }
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
        }
        writeLog("财务管理范围："+cwglfw_value);
        writeLog("承诺项目编码："+cnxmbm_value);
        writeLog("承诺项目名称："+cnxmmc_value);
        writeLog("承诺项目描述："+cnxmms_value);
        writeLog("财务业务："+cwyw_value);
        writeLog("承诺项目类别："+cnxmlb_value);
        writeLog("上层承诺项目："+sccnxm_value);
        writeLog("明细承诺项目标示（可记账）："+mxcnxmbz_value);
        writeLog("统计承诺项目："+tjcnxm_value);
        writeLog("审批状态代码："+spzt_value);
        writeLog("申请人："+sqr_value);
        writeLog("操作标识："+czbs_value);
        writeLog("人事范围："+gsdm_value);
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        UpdateConfigurationParameters CreateConfigurationParameters = new UpdateConfigurationParameters();
        CommitmentltemUpdate[] CommitmentltemCreates = new CommitmentltemUpdate[1];
        CommitmentltemUpdate CommitmentltemCreate = new CommitmentltemUpdate();
        CommitmentltemQuery CommitmentltemQuery = new CommitmentltemQuery();
        CommitmentltemCriteria CommitmentltemCriteria = new CommitmentltemCriteria();
        CommitmentltemCriteria.setFIPOS(publicmethod.setTextCriteria(cnxmbm_value));
        CommitmentltemQuery.setCriteria(CommitmentltemCriteria);
        CommitmentltemResultSet CommitmentltemResultSet = null;
        try {
            CommitmentltemResultSet = f.searchCommitmentltem(CommitmentltemQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        CommitmentltemID CommitmentltemID = new CommitmentltemID();
        CommitmentltemID.setInternalID(CommitmentltemResultSet.getCommitmentltem()[0].getRecordIdentification().getInternalID());
        CommitmentltemCreate.setRecordIdentification(CommitmentltemID);
        CommitmentltemCreate.setFIPOS(cnxmbm_value);
        CommitmentltemCreate.setFIKRS(cwglfw_value);
        CommitmentltemCreate.setBEZEICH(cnxmmc_value);
        CommitmentltemCreate.setBESCHR(cnxmms_value);
        FinanciaTransactionLookup FinanciaTransactionLookup = publicmethod.lookFinanciaTransactionLookup(cwyw_value, f);
        if(null == FinanciaTransactionLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询财务业务："+cwyw_value+ " 失败.");
            return SUCCESS;
        }
        CommitmentltemCreate.setFIVOR(FinanciaTransactionLookup);
        CommitmentItemCategoryLookup CommitmentItemCategoryLookup = publicmethod.lookCommitmentItemCategoryLookup(cnxmlb_value, f);
        if(null == CommitmentItemCategoryLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询承诺项目类别："+cnxmlb_value+ " 失败.");
            return SUCCESS;
        }
        CommitmentltemCreate.setKNZAEPO(CommitmentItemCategoryLookup);
        CommitmentltemLookup CommitmentltemLookup = publicmethod.lookCommitmentltemLookup(sccnxm_value, f);
        if(null == CommitmentltemLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询上层承诺项目："+sccnxm_value+ " 失败.");
            return SUCCESS;
        }
        CommitmentltemCreate.setFICPOS(CommitmentltemLookup);
        if("0".equals(mxcnxmbz_value)) {
            CommitmentltemCreate.setCOMCAT(true);
        }
        if("1".equals(mxcnxmbz_value)) {
            CommitmentltemCreate.setCOMCAT(false);
        }
        if("0".equals(tjcnxm_value)) {
            CommitmentltemCreate.setSTATS(true);
        }
        if("1".equals(tjcnxm_value)) {
            CommitmentltemCreate.setSTATS(false);
        }
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode(spzt_value, f);
        if(null == ApprovalStatusLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询审批状态："+spzt_value+ " 失败.");
            return SUCCESS;
        }
        CommitmentltemCreate.setAPCOD(ApprovalStatusLookup);
        if(!"".equals(sqr_value)) {
            try {
                sqr_value = new ResourceComInfo().getLastname(sqr_value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        CommitmentltemCreate.setApplicant(sqr_value);
        OperationLookup OperationLookup = publicmethod.getOperation(czbs_value, f);
        if(null == OperationLookup) {
            PublicMethods.setFailedMessage(request, "failed", "查询操作标识："+czbs_value+ " 失败.");
            return SUCCESS;
        }
        CommitmentltemCreate.setOperation(OperationLookup);
        //获取分发系统 开始
        List<FFXTMode> ffxtList = PublicMethods.getFFXT(gsdm_value, "承诺项目");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
        for(int i = 0; i < ffxtList.size(); i++) {
            String ffxtdm = ffxtList.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm,f);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护分发系统代码值。");
                return SUCCESS;
            } else {
                serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
            }
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0",f);
            if(null == distributionStatusLookup) {
                PublicMethods.setFailedMessage(request, "failed", "可能MDM没有维护分发系统代码状态值。");
                return SUCCESS;
            } else {
                distributionStatusLookup.setDisplayValue("0");
            }
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            ServiceRelationshipsTupleTuple[] ServiceRelationshipsTupleTuples = CommitmentltemResultSet.getCommitmentltem()[0].getServiceRelationshipsTuple();
            for(ServiceRelationshipsTupleTuple service : ServiceRelationshipsTupleTuples) {
                String clientsystem = "";
                ClientLookup client = service.getCLIENT_SYSTEM();
                if(null != client) {
                    clientsystem = client.getDisplayValue();
                    if(clientsystem.equals(ffxtdm)) {
                        serviceRelationshipsTupleTuple.setTupleValueId(service.getTupleValueId());
                    }
                }
            }
            
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        CommitmentltemCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        CommitmentltemCreates[0] = CommitmentltemCreate;
        ExecutionStatus[]  ExecutionStatus = null;
        try {
            ExecutionStatus = f.updateCommitmentltem(CommitmentltemCreates, publicmethod.setReposInfo(), CreateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
            PublicMethods.setFailedMessage(request, "failed", "创建承诺项目主数据失败："+e.getLocalizedMessage());
            return SUCCESS;
        }
        if(null != ExecutionStatus && ExecutionStatus.length > 0) {
            String status = ExecutionStatus[0].getStatus();
            if(!"OK".equals(status)) {
                String message = ExecutionStatus[0].getFault()[0].getText();
                PublicMethods.setFailedMessage(request, "failed", "创建承诺项目主数据失败：" + message);
                return SUCCESS;
            } else {
                String message = ExecutionStatus[0].getDescription();
                publicmethod.updateCNXMReturnMsg(status, message, requestid);
            }
        } else {
            PublicMethods.setFailedMessage(request, "failed", "创建承诺项目主数据失败");
            return SUCCESS;
        }
        return SUCCESS;
    }
    
    public static void main(String[] args) {
        CNXMPublicMethod publicmethod = new CNXMPublicMethod();
        JSGX_MDM_FICOTRViProxy f = new JSGX_MDM_FICOTRViProxy();
        UpdateConfigurationParameters CreateConfigurationParameters = new UpdateConfigurationParameters();
        CommitmentltemUpdate[] CommitmentltemCreates = new CommitmentltemUpdate[1];
        CommitmentltemUpdate CommitmentltemCreate = new CommitmentltemUpdate();
        CommitmentltemQuery CommitmentltemQuery = new CommitmentltemQuery();
        CommitmentltemCriteria CommitmentltemCriteria = new CommitmentltemCriteria();
        CommitmentltemCriteria.setFIPOS(publicmethod.setTextCriteria("1234567890"));
        CommitmentltemQuery.setCriteria(CommitmentltemCriteria);
        CommitmentltemResultSet CommitmentltemResultSet = null;
        try {
            CommitmentltemResultSet = f.searchCommitmentltem(CommitmentltemQuery, publicmethod.setReposInfo());
        } catch (RemoteException e1) {
            e1.printStackTrace();
        }
        CommitmentltemID CommitmentltemID = new CommitmentltemID();
        CommitmentltemID.setInternalID(CommitmentltemResultSet.getCommitmentltem()[0].getRecordIdentification().getInternalID());
        CommitmentltemCreate.setRecordIdentification(CommitmentltemID);
        CommitmentltemCreate.setFIPOS("1234567890");
        CommitmentltemCreate.setFIKRS("JSGX");
        CommitmentltemCreate.setBEZEICH("1234567890-修改");
        CommitmentltemCreate.setBESCHR("1234567890-修改");
        FinanciaTransactionLookup FinanciaTransactionLookup = publicmethod.lookFinanciaTransactionLookup("30", f);
        CommitmentltemCreate.setFIVOR(FinanciaTransactionLookup);
        CommitmentItemCategoryLookup CommitmentItemCategoryLookup = publicmethod.lookCommitmentItemCategoryLookup("3", f);
        CommitmentltemCreate.setKNZAEPO(CommitmentItemCategoryLookup);
        CommitmentltemLookup CommitmentltemLookup = publicmethod.lookCommitmentltemLookup("222222", f);
        CommitmentltemCreate.setFICPOS(CommitmentltemLookup);
        if("0".equals("0")) {
            CommitmentltemCreate.setCOMCAT(true);
        }
        if("1".equals("0")) {
            CommitmentltemCreate.setCOMCAT(false);
        }
        if("0".equals("0")) {
            CommitmentltemCreate.setSTATS(true);
        }
        if("1".equals("0")) {
            CommitmentltemCreate.setSTATS(false);
        }
        ApprovalStatusLookup ApprovalStatusLookup = publicmethod.getAPCODCode("0", f);
        CommitmentltemCreate.setAPCOD(ApprovalStatusLookup);
        CommitmentltemCreate.setApplicant("自动转换");
        OperationLookup OperationLookup = publicmethod.getOperation("12", f);
        CommitmentltemCreate.setOperation(OperationLookup);
        //获取分发系统 开始
        List<FFXTMode> ffxtList = new ArrayList<FFXTMode>();
        FFXTMode f1 = new FFXTMode();
        f1.setFfxtdm("ECC_NY");
        FFXTMode f2 = new FFXTMode();
        f2.setFfxtdm("MIS");
        FFXTMode f3 = new FFXTMode();
        f3.setFfxtdm("ECC_DC");
        FFXTMode f4 = new FFXTMode();
        f4.setFfxtdm("ECC_MY");
        FFXTMode f5 = new FFXTMode();
        f5.setFfxtdm("ECC_JR");
        FFXTMode f6 = new FFXTMode();
        f6.setFfxtdm("ECC_JT");
        ffxtList.add(f1);
        ffxtList.add(f2);
        ffxtList.add(f3);
        ffxtList.add(f4);
        ffxtList.add(f5);
        ffxtList.add(f6);
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[ffxtList.size()];
        for(int i = 0; i < ffxtList.size(); i++) {
            String ffxtdm = ffxtList.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = publicmethod.getFFXTDM(ffxtdm,f);
            serviceRelationshipsTupleTuple.setDisplayValue(ffxtdm);
            DistributionStatusLookup distributionStatusLookup = publicmethod.getFFZT("0",f);
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        CommitmentltemCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        CommitmentltemCreates[0] = CommitmentltemCreate;
        ExecutionStatus[]  ExecutionStatus = null;
        try {
            ExecutionStatus = f.updateCommitmentltem(CommitmentltemCreates, publicmethod.setReposInfo(), CreateConfigurationParameters);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if(null != ExecutionStatus && ExecutionStatus.length > 0) {
            String status = ExecutionStatus[0].getStatus();
            if(!"OK".equals(status)) {
            } else {
            }
        } else {
        }
    }
}
