package weaver.interfaces.gx.jyl.kh;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ApprovalStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BankAccountsTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.BanksLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CountriesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerAccountGroupsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomerTypeLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.CustomersCreate;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.DistributionStatusLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.LanguagesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.OperationLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.RegionsLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TitlesLookup;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.TradePartnersLookup;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.mdm.base.FFXTMode;
import weaver.interfaces.gx.jyl.mdm.base.PublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;
import beans.ws.mdm.sap.com.CreateConfigurationParameters;
import beans.ws.mdm.sap.com.ExecutionStatus;

/**
 * 客户创建
 */
public class KHCreateAction extends BaseBean implements Action {
    
    private PublicMethod PublicMethod = new PublicMethod();
    
    private KHPublicMethod KHPublicMethods = new KHPublicMethod();
    
    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)){
            new weaver.general.BaseBean().writeLog("客户退回操作，不执行接口.");
            return SUCCESS;
        }
        //公司代码-值
        String gsdm_value = "";
        //公司代码-字段
        String gsdm_column = "gsdm";
        //申请单号-值
        String sqdh_value = "";
        //申请单号-字段
        String sqdh_column = "sqdh";
        //账户组-值
        String zhz_value = "";
        //账户组-字段
        String zhz_column = "zhz";
        //称谓-值
        String anred_value = "";
        //称谓-字段
        String anred_column = "cw";
        //客户简称-值
        String name_value = "";
        //客户简称-字段
        String name_column = "khjc";
        //客户全称-值
        String khqc_value = "";
        //客户全称-字段
        String khqc_column = "khmc";
        //客户类型-值
        String khlx_value = "";
        //客户类型-字段
        String khlx_column = "khlx";
        //税号\统一社会信用代码-值
        String stceg_value = "";
        //税号\统一社会信用代码-字段
        String stceg_column = "sh";
        //工商登记证号-值
        String stcd1_value = "";
        //工商登记证号-字段
        String stcd1_column = "gsdjzh";
        //全国组织机构代码-值
        String stcd5_value = "";
        //全国组织机构代码-字段
        String stcd5_column = "qgzzjgdm";
        //关键词1-值
        String sort1_value = "";
        //关键词1-字段
        String sort1_column = "gjc1";
        //关键词2-值
        String sort2_value = "";
        //关键词2-字段
        String sort2_column = "gjc2";
        //语种-值
        String spras_value = "";
        //语种-字段
        String spras_column = "yz";
        //国家-值
        String land1_value = "";
        //国家-字段
        String land1_column = "gj";
        //地区-值
        String regio_value = "";
        //地区-字段
        String regio_column = "dq";
        //地区城市-值
        String ort01_value = "";
        //地区城市-字段
        String ort01_column = "dqcs";
        //街道/门牌号-值
        String street_value = "";
        //街道/门牌号-字段
        String street_column = "jdmph";
        //邮政编码-值
        String pstlz_value = "";
        //邮政编码-字段
        String pstlz_column = "yzbm";
        //电话号码-值
        String telnumber_value = "";
        //电话号码-字段
        String telnumber_column = "dhhm";
        //电话分机号-值
        String telextens_value = "";
        //电话分机号-字段
        String telextens_column = "dhfjh";
        //传真号-值
        String faxnumber_value = "";
        //传真号-字段
        String faxnumber_column = "czh";
        //传真分机号-值
        String faxextens_value = "";
        //传真分机号-字段
        String faxextens_column = "czfjh";
        //电子邮件地址-值
        String smtpaddr_value = "";
        //电子邮件地址-字段
        String smtpaddr_column = "dzyjdz";
        //贸易伙伴-值
        String vbnud_value = "";
        //贸易伙伴-字段
        String vbnud_column = "myhb";
        //供应商编号-值
        String lifnr_value = "";
        //供应商编号-字段
        String lifnr_column = "gysbh";
        //纳税人资格-值
        String stkzu_value = "";
        //纳税人资格-字段
        String stkzu_column = "nsrzg";
        //申请人-值
        String applicant_value = "";
        //申请人-字段
        String applicant_column = "sqr";
        //申请日期-值
        String applydate_value = "";
        //申请日期-字段
        String applydate_column = "sqrq";
        //申请时间-值
        String applytime_value = "";
        //申请时间-字段
        String applytime_column = "sqsj";
        //操作标识-值
        String operation_value = "";
        //操作标识-字段
        String operation_column = "czbs";
        //银行国家-值
        String banks_value = "";
        //银行国家-字段
        String banks_column = "yhgj";
        //银行码-值
        String bankl_value = "";
        //银行码-字段
        String bankl_column = "yhdm";
        //账户持有人-值
        String koinh_value = "";
        //账户持有人-字段
        String koinh_column = "zhcyr";
        //银行账号-值
        String bankn_value = "";
        //银行账号-字段
        String bankn_column = "yhzh";
        
        
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(sqdh_column)) {
                sqdh_value = value;
            }
            if (name.equals(zhz_column)) {
                zhz_value = value;
            }
            if (name.equals(anred_column)) {
                anred_value = value;
            }
            if (name.equals(name_column)) {
                name_value = value;
            }
            if (name.equals(khqc_column)) {
                khqc_value = value;
            }
            if (name.equals(khlx_column)) {
                khlx_value = value;
            }
            if (name.equals(stceg_column)) {
                stceg_value = value;
            }
            if (name.equals(stcd1_column)) {
                stcd1_value = value;
            }
            if (name.equals(stcd5_column)) {
                stcd5_value = value;
            }
            if (name.equals(sort1_column)) {
                sort1_value = value;
            }
            if (name.equals(sort2_column)) {
                sort2_value = value;
            }
            if (name.equals(spras_column)) {
                spras_value = value;
            }
            if (name.equals(land1_column)) {
                land1_value = value;
            }
            if (name.equals(regio_column)) {
                regio_value = value;
            }
            if (name.equals(ort01_column)) {
                ort01_value = value;
            }
            if (name.equals(street_column)) {
                street_value = value;
            }
            if (name.equals(pstlz_column)) {
                pstlz_value = value;
            }
            if (name.equals(telnumber_column)) {
                telnumber_value = value;
            }
            if (name.equals(telextens_column)) {
                telextens_value = value;
            }
            if (name.equals(faxnumber_column)) {
                faxnumber_value = value;
            }
            if (name.equals(faxextens_column)) {
                faxextens_value = value;
            }
            if (name.equals(smtpaddr_column)) {
                smtpaddr_value = value;
            }
            if (name.equals(vbnud_column)) {
                vbnud_value = value;
            }
            if (name.equals(lifnr_column)) {
                lifnr_value = value;
            }
            if (name.equals(stkzu_column)) {
                stkzu_value = value;
            }
            if (name.equals(applicant_column)) {
                applicant_value = value;
            }
            if (name.equals(applydate_column)) {
                applydate_value = value;
            }
            if (name.equals(applytime_column)) {
                applytime_value = value;
            }
            if (name.equals(operation_column)) {
                operation_value = value;
            }
        }
        
        JSGX_MDM_BUSINESS_PARTNERViProxy proxy = new JSGX_MDM_BUSINESS_PARTNERViProxy();
        DetailTable[] detailtable = request.getDetailTableInfo().getDetailTable();// 获取所有明细表
        DetailTable dt = detailtable[0];// 指定明细表 0表示明细表1
        Row[] s = dt.getRow();// 当前明细表的所有数据,按行存储
        BankAccountsTuple[] bankAccountsTuples = new BankAccountsTuple[s.length];
        for (int j = 0; j < s.length; j++) {
            Row r = s[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (banks_column.equals(name)) {
                    banks_value = value;
                }
                if (bankl_column.equals(name)) {
                    bankl_value = value;
                }
                if (koinh_column.equals(name)) {
                    koinh_value = value;
                }
                if (bankn_column.equals(name)) {
                    bankn_value = value;
                }
            }
            BankAccountsTuple bankAccountsTuple = new BankAccountsTuple();
            CountriesLookup countriesLookup = KHPublicMethods.lookCountriesLookup(banks_value, proxy);
            if(null == countriesLookup) {
                PublicMethod.setFailedMessage(request, "failed", "查找银行国家："+banks_value+" 失败");
                return SUCCESS;
            }
            bankAccountsTuple.setBANKS(countriesLookup);
            BanksLookup banksLookup = KHPublicMethods.lookBanksLookup(bankl_value, proxy);
            if(null == banksLookup) {
                PublicMethod.setFailedMessage(request, "failed", "查找银行码："+bankl_value+" 失败");
                return SUCCESS;
            }
            bankAccountsTuple.setBANKL(banksLookup);
            bankAccountsTuple.setKOINH(koinh_value);
            bankAccountsTuple.setBANKN(bankn_value);
            bankAccountsTuples[j] = bankAccountsTuple;
        }
        writeLog("公司代码：" + gsdm_value);
        writeLog("申请单号：" + sqdh_value);
        writeLog("账户组：" + zhz_value);
        writeLog("称谓：" + anred_value);
        writeLog("客户简称：" + name_value);
        writeLog("客户全称：" + khqc_value);
        writeLog("客户类型：" + khlx_value);
        writeLog("税号\\统一社会信用代码-值：" + stceg_value);
        writeLog("工商登记证号：" + stcd1_value);
        writeLog("全国组织机构代码：" + stcd5_value);
        writeLog("关键词1：" + sort1_value);
        writeLog("关键词2：" + sort2_value);
        writeLog("语种：" + spras_value);
        writeLog("国家：" + land1_value);
        writeLog("地区：" + regio_value);
        writeLog("地区城市：" + ort01_value);
        writeLog("街道/门牌号：" + street_value);
        writeLog("邮政编码：" + pstlz_value);
        writeLog("电话号码：" + telnumber_value);
        writeLog("电话分机号：" + telextens_value);
        writeLog("传真号：" + faxnumber_value);
        writeLog("传真分机号：" + faxextens_value);
        writeLog("电子邮件地址：" + smtpaddr_value);
        writeLog("贸易伙伴：" + vbnud_value);
        writeLog("供应商编号：" + lifnr_value);
        writeLog("纳税人资格：" + stkzu_value);
        writeLog("银行国家：" + banks_value);
        writeLog("银行码：" + bankl_value);
        writeLog("账户持有人：" + koinh_value);
        writeLog("银行账号：" + bankn_value);
        writeLog("审批状态：0");
        writeLog("申请人：" + applicant_value);
        writeLog("申请日期：" + applydate_value);
        writeLog("申请时间：" + applytime_value);
        writeLog("操作标识：" + operation_value);
        
        CustomersCreate[] customersCreates = new CustomersCreate[1];
        CustomersCreate customersCreate = new CustomersCreate();
        customersCreate.setApplyNumber(sqdh_value);
        CustomerAccountGroupsLookup customerAccountGroupsLookup = KHPublicMethods.lookCustomerAccountGroupsLookup(zhz_value, proxy);
        if(null == customerAccountGroupsLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找账户组失败.");
            return SUCCESS;
        }
        customersCreate.setKTOKD(customerAccountGroupsLookup);
        TitlesLookup titlesLookup = KHPublicMethods.lookTitlesLookup(anred_value, proxy);
        if(null == titlesLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找称谓失败.");
            return SUCCESS;
        }
        customersCreate.setANRED(titlesLookup);
        customersCreate.setNAME1(name_value);
        customersCreate.setFULL_NAME(khqc_value);
        CustomerTypeLookup customerTypeLookup = KHPublicMethods.lookCustomerTypeLookup(khlx_value, proxy);
        if(null == customerTypeLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找客户类型失败.");
            return SUCCESS;
        }
        customersCreate.setKUKLA(customerTypeLookup);
        customersCreate.setSTCEG(stceg_value);
        customersCreate.setSTCD1(stcd1_value);
        customersCreate.setSTCD5(stcd5_value);
        customersCreate.setSORT1(sort1_value);
        customersCreate.setSORT2(sort2_value);
        LanguagesLookup languagesLookup = KHPublicMethods.lookLanguagesLookup(spras_value, proxy);
        if(null == languagesLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找语种失败.");
            return SUCCESS;
        }
        customersCreate.setSPRAS(languagesLookup);
        CountriesLookup countriesLookup = KHPublicMethods.lookCountriesLookup(land1_value, proxy);
        if(null == countriesLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找国家失败.");
            return SUCCESS;
        }
        customersCreate.setLAND1(countriesLookup);
        RegionsLookup regionsLookup = KHPublicMethods.lookRegionsLookup(regio_value, proxy);
        if(null == regionsLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找地区失败.");
            return SUCCESS;
        }
        customersCreate.setREGIO(regionsLookup);
        customersCreate.setORT01(ort01_value);
        customersCreate.setSTREET(street_value);
        customersCreate.setPSTLZ(pstlz_value);
        customersCreate.setTEL_NUMBER(telnumber_value);
        customersCreate.setTEL_EXTENS(telextens_value);
        customersCreate.setFAX_NUMBER(faxnumber_value);
        customersCreate.setFAX_EXTENS(faxextens_value);
        customersCreate.setSMTP_ADDR(smtpaddr_value);
        TradePartnersLookup tradePartnersLookup = KHPublicMethods.lookTradePartnersLookup(vbnud_value, proxy);
        if(null != tradePartnersLookup) {
            customersCreate.setVBUND(tradePartnersLookup);
        }
        customersCreate.setSPERM(false);
        customersCreate.setLIFNR(lifnr_value);
        if("0".equals(stkzu_value)){
            customersCreate.setSTKZU(true);
        } else {
            customersCreate.setSTKZU(false);
        }
        customersCreate.setBankDetails(bankAccountsTuples);
        ApprovalStatusLookup approvalStatusLookup = KHPublicMethods.getAPCODCode("0", proxy);
        if(null == approvalStatusLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查找审批状态：0 失败");
            return SUCCESS;
        }
        approvalStatusLookup.setDisplayValue("0");
        customersCreate.setAPCOD(approvalStatusLookup);
        String applicant_chinese_value = "";
        try {
            applicant_chinese_value = new ResourceComInfo().getLastname(applicant_value);
        } catch (Exception e2) {
            e2.printStackTrace();
            writeLog("查询申请人："+applicant_value+"失败。不存在该人员编号。");
        }
        customersCreate.setApplicant(applicant_chinese_value);
        Calendar cal = Calendar.getInstance();
        applydate_value = KHPublicMethods.toyyyyMMdd(applydate_value);
        try {
            cal.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applydate_value+"000000"));
            cal.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        customersCreate.setApplyDate(cal);
        Calendar cal1 = Calendar.getInstance();
        applytime_value = KHPublicMethods.toyyyyMMdd(applydate_value,applytime_value+":00");
        try {
            cal1.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(applytime_value));
            cal1.add(Calendar.HOUR_OF_DAY, +8);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        customersCreate.setApplyTime(cal1);
        List<FFXTMode> list = PublicMethod.getFFXT(gsdm_value, "客户");
        ServiceRelationshipsTupleTuple[] serviceRelationshipsTupleTuples = new ServiceRelationshipsTupleTuple[list.size()];
        for(int i = 0; i < list.size(); i++) {
            String ffxtdm = list.get(i).getFfxtdm();
            ServiceRelationshipsTupleTuple serviceRelationshipsTupleTuple = KHPublicMethods.getFFXTDM(ffxtdm, proxy);
            if(null == serviceRelationshipsTupleTuple) {
                PublicMethod.setFailedMessage(request, "failed", "查询分发系统代码内部码："+ffxtdm+" 失败");
                return SUCCESS;
            }
            DistributionStatusLookup distributionStatusLookup = KHPublicMethods.getFFZT("0", proxy);
            if(null == distributionStatusLookup) {
                PublicMethod.setFailedMessage(request, "failed", "查询分发状态代码：0 失败");
                return SUCCESS;
            }
            distributionStatusLookup.setDisplayValue("0");
            serviceRelationshipsTupleTuple.setDISTUS(distributionStatusLookup);
            serviceRelationshipsTupleTuples[i] = serviceRelationshipsTupleTuple;
        }
        customersCreate.setServiceRelationshipsTuple(serviceRelationshipsTupleTuples);
        OperationLookup operationLookup = KHPublicMethods.lookOperation(operation_value, proxy);
        if(null == operationLookup) {
            PublicMethod.setFailedMessage(request, "failed", "查询操作标识："+operation_value+" 失败");
            return SUCCESS;
        }
        customersCreate.setOperation(operationLookup);
        customersCreates[0] = customersCreate;
        CreateConfigurationParameters createConfigurationParameters = new CreateConfigurationParameters();
        ExecutionStatus[] executionStatus = null;
        try {
            executionStatus = proxy.createCustomers(customersCreates, KHPublicMethods.setReposInfo(), createConfigurationParameters);
            if(null != executionStatus && executionStatus.length > 0) {
               String status = executionStatus[0].getStatus();
               String description = executionStatus[0].getDescription();
               if(!"OK".equalsIgnoreCase(status)){
                   PublicMethod.setFailedMessage(request, "failed", "连接MDM接口失败:"+executionStatus[0].getFault()[0].getText());
               } else {
                   KHPublicMethods.updateReturnMsg(status, description, requestid);
               }
            } else {
                PublicMethod.setFailedMessage(request, "failed", "连接MDM接口失败");
            }
        } catch (RemoteException e) {
            e.printStackTrace();
            writeLog("连接MDM失败："+e.getLocalizedMessage());
            PublicMethod.setFailedMessage(request, "failed", "连接MDM接口失败:"+e.getLocalizedMessage());
        }
        return SUCCESS;
    }
}
