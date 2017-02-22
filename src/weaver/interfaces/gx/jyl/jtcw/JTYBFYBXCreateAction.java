package weaver.interfaces.gx.jyl.jtcw;

import java.rmi.RemoteException;
import java.util.Map;

import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ;
import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ_RETURN;
import net.jsgx.www.E1D.service.SI_1072_ALL2ERP_KJPZ_OUTProxy;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 集团财务-一般费用报销
 */
public class JTYBFYBXCreateAction extends BaseBean implements Action {

    private CWPublicMethod publicmethod = new CWPublicMethod();

    public String execute(RequestInfo request) {
        String requestid = request.getRequestid();
        String src = request.getRequestManager().getSrc();
        if (!"submit".equals(src)) {
            new weaver.general.BaseBean().writeLog("集团财务-一般费用报销退回操作，不执行接口.");
            return SUCCESS;
        }
        // 凭证抬头文本-值
        String pzttwb_value = "";
        // 凭证抬头文本-字段
        String pzttwb_column = "bxsy";
        // 凭证类型-值
        String pzlx_value = "";
        // 凭证类型-字段
        String pzlx_column = "pzlx";
        // 参考凭证编号-值
        String ckpzbh_value = "";
        // 参考凭证编号-字段
        String ckpzbh_column = "sqbh";
        // 公司代码-值
        String gsdm_value = "";
        // 公司代码-字段
        String gsdm_column = "gsdm";
        // 凭证日期-值
        String pzrq_value = "";
        // 凭证日期-字段
        String pzrq_column = "pzrq";
        // 过账日期-值
        String gzrq_value = "";
        // 过账日期-字段
        String gzrq_column = "gzrq";
        // SYSID-值
        String sysid_value = "";
        // SYSID-字段
        String sysid_column = "sysid";
        // 员工编号-值
        String ygbh_value = "";
        // 员工编号-字段
        String ygbh_column = "ygbh";
        // 应收款-其他-值
        String qtyszk_value = "";
        // 应收款-其他-字段
        String qtyszk_column = "qtyszk";
        // 成本中心-值
        String cbzx_value = "";
        // 成本中心-字段
        String cbzx_column = "cbzx";
        // 摘要-值
        String zy_value = "";
        // 摘要-字段
        String zy_column = "zy";
        // 报销方式-值
        String bxfs_value = "";
        // 报销方式-字段
        String bxfs_column = "bxfs";
        // 申请人-字段
        String jbr_column = "jbr";
        String jbr_value = "jbr";
        // 货币吗
        String hbm_column = "hbm";
        String hbm_value = "";
        // 报销金额
        String bxje_column = "bxje";
        String bxje_value = "";
        // 实报金额
        String sbje_column = "sbje";
        String sbje_value = "";
        // 实报金额
        String cph_column = "cph";
        String cph_value = "";
        // 归属项目
        String gsxm_value = "";
        String gsxm_column = "gsxm";
        // 费用审批类别
        String fylx_value = "";
        String fylx_column = "fylx";

        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(pzttwb_column)) {
                pzttwb_value = value;
            }
            if (name.equals(pzlx_column)) {
                pzlx_value = value;
            }
            if (name.equals(ckpzbh_column)) {
                ckpzbh_value = value;
            }
            if (name.equals(gsdm_column)) {
                gsdm_value = value;
            }
            if (name.equals(pzrq_column)) {
                pzrq_value = value.replaceAll("-", "");
            }
            if (name.equals(gzrq_column)) {
                gzrq_value = value.replaceAll("-", "");
            }
            if (name.equals(sysid_column)) {
                sysid_value = value;
            }
            if (name.equals(ygbh_column)) {
                ygbh_value = value;
            }
            if (name.equals(qtyszk_column)) {
                qtyszk_value = value;
            }
            if (name.equals(cbzx_column)) {
                cbzx_value = value;
            }
            if (name.equals(zy_column)) {
                zy_value = value;
            }
            if (name.equals(bxfs_column)) {
                bxfs_value = value;
            }
            if (name.equals(hbm_column)) {
                hbm_value = value;
            }
            if (name.equals(bxje_column)) {
                bxje_value = value;
            }
            if (name.equals(cph_column)) {
                cph_value = value;
            }
            if (name.equals(gsxm_column)) {
                gsxm_value = value;
            }
            if (name.equals(fylx_column)) {
                fylx_value = value;
            }
            if (name.equals(jbr_column)) {
                try {
                    jbr_value = new ResourceComInfo().getLastname(value);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            if (name.equals(sbje_column)) {
                sbje_value = value;
            }
        }
        writeLog("凭证抬头文本:" + pzttwb_value);
        writeLog("凭证类型:" + pzlx_value);
        writeLog("参考凭证编号:" + ckpzbh_value);
        writeLog("公司代码:" + gsdm_value);
        writeLog("凭证日期:" + pzrq_value);
        writeLog("过账日期:" + gzrq_value);
        writeLog("SYSID:" + sysid_value);
        writeLog("员工编号:" + ygbh_value);
        writeLog("应收款-其他:" + qtyszk_value);
        writeLog("成本中心:" + cbzx_value);
        writeLog("摘要:" + zy_value);
        writeLog("报销方式:" + bxfs_value);
        writeLog("创建人:" + jbr_value);
        writeLog("货币码:" + hbm_value);
        writeLog("报销金额:" + bxje_value);
        writeLog("实报金额:" + sbje_value);
        writeLog("车牌号:" + cph_value);
        writeLog("归属项目:" + gsxm_value);
        writeLog("费用审批类别:" + fylx_value);

        String tablename = getPropValue("GXBX", "JT_YBFYBX");
        String splx = getPropValue("GXBX", "JT_YBFYBX_FYSPLX");

        // 此场景条件：报销方式为“直接报销”
        if ("2".equals(bxfs_value)) {
            // 创建根节点ROOT
            String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            xmlstring = addRootHeadElement(xmlstring, "INPUT");
            xmlstring = addRootHeadElement(xmlstring, "HEADER");
            xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
            xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
            xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
            xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
            xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
            xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
            xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            xmlstring = addElement(xmlstring, "KURSF", "");
            xmlstring = addElement(xmlstring, "XREF2_HD", "OA系统");
            xmlstring = addRootFooterElement(xmlstring, "HEADER");
            xmlstring = addRootHeadElement(xmlstring, "LINES");
            RecordSet rs = new RecordSet();
            String sql = "select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl from "
                    + tablename + " a," + tablename
                    + "_dt1 b where a.id = b.mainid and a.requestid = '"
                    + requestid + "'";
            rs.execute(sql);
            while (rs.next()) {
                String yskm_value = Util.null2o(rs.getString("yskm"));
                String bxjes_value = Util.null2o(rs.getString("bxje"));
                String se_value = Util.null2o(rs.getString("se"));
                String jxskm_value = Util.null2o(rs.getString("jxskm"));
                String sfzp_value = Util.null2o(rs.getString("sfzp"));
                String sl_value = Util.null2o(rs.getString("sl"));
                xmlstring = addRootHeadElement(xmlstring, "LINE");
                xmlstring = addElement(xmlstring, "SHKZG", "S");
                xmlstring = addElement(xmlstring, "HKONT", yskm_value);
                xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
                xmlstring = addElement(xmlstring, "MWSKZ", "");
                double tol = Util.getDoubleValue(bxjes_value)
                        - Util.getDoubleValue(se_value);
                xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
                xmlstring = addElement(xmlstring, "DMBTR", "");
                xmlstring = addElement(xmlstring, "SGTXT", zy_value);
                xmlstring = addElement(xmlstring, "XNEGP", "");
                xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
                xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
                if (splx.equals(fylx_value)) {
                    xmlstring = addElement(xmlstring, "AUFNR", cph_value);
                } else {
                    xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
                }
                xmlstring = addElement(xmlstring, "POSID", "");
                xmlstring = addRootFooterElement(xmlstring, "LINE");
                if ("0".equals(sfzp_value)) {
                    xmlstring = addRootHeadElement(xmlstring, "LINE");
                    xmlstring = addElement(xmlstring, "SHKZG", "S");
                    xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
                    xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
                    xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
                    xmlstring = addElement(xmlstring, "WRBTR", se_value);
                    xmlstring = addElement(xmlstring, "DMBTR", "");
                    xmlstring = addElement(xmlstring, "SGTXT", zy_value);
                    xmlstring = addElement(xmlstring, "XNEGP", "");
                    xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
                    xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
                    if (splx.equals(fylx_value)) {
                        xmlstring = addElement(xmlstring, "AUFNR", cph_value);
                    } else {
                        xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
                    }
                    xmlstring = addElement(xmlstring, "POSID", "");
                    xmlstring = addElement(xmlstring, "BUDG_CODE", "");
                    xmlstring = addRootFooterElement(xmlstring, "LINE");
                }
            }

            xmlstring = addRootHeadElement(xmlstring, "LINE");
            xmlstring = addElement(xmlstring, "SHKZG", "H");
            xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
            xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
            xmlstring = addElement(xmlstring, "MWSKZ", "");
            xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
            xmlstring = addElement(xmlstring, "DMBTR", "");
            xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            xmlstring = addElement(xmlstring, "XNEGP", "");
            xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
            xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            if (splx.equals(fylx_value)) {
                xmlstring = addElement(xmlstring, "AUFNR", cph_value);
            } else {
                xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
            }
            xmlstring = addElement(xmlstring, "POSID", "");
            xmlstring = addElement(xmlstring, "BUDG_CODE", "");
            xmlstring = addRootFooterElement(xmlstring, "LINE");
            xmlstring = addRootFooterElement(xmlstring, "LINES");
            xmlstring = addRootFooterElement(xmlstring, "INPUT");

            writeLog("集团财务-一般费用报销传入xml参数：" + xmlstring);

            // SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new
            // SI_1057_OA2ERP_KJPZ_OUTProxy();
            // DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new
            // DT_1057_OA2ERP_KJPZ();
            // DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            // DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            // DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            // try {
            // DT_1057_OA2ERP_KJPZ_RETURN =
            // proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            // String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            // writeLog("集团财务-一般费用报销创建返回消息：" + returnmessage);
            // Map<String, String> map =
            // publicmethod.readXMLForCLFBXSQ(returnmessage);
            // if (null != map && !map.isEmpty()) {
            // String RET_ACCNO = (String) map.get("RET_ACCNO");
            // String ZSTATU = (String) map.get("ZSTATU");
            // String ZDESC = (String) map.get("ZDESC");
            // if ("S".equalsIgnoreCase(ZSTATU)) {
            // publicmethod.updateJTYBFBXCJ(requestid, RET_ACCNO, ZSTATU,
            // ZDESC);
            // } else {
            // publicmethod.setFailMessage(request, "failed",
            // "集团财务-一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU +
            // " ZDESC：" + ZDESC);
            // return SUCCESS;
            // }
            // }
            // } catch (RemoteException e) {
            // publicmethod.setFailMessage(request, "failed",
            // "集团财务-一般费用报销创建接口异常：" + e);
            // return SUCCESS;
            // }

            SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
            DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
            DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
            DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
            try {
                DT_1072_ALL2ERP_KJPZ_RETURN = proxy
                        .SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
                String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
                writeLog("集团财务-一般费用报销创建返回消息：" + returnmessage);
                Map<String, String> map = publicmethod
                        .readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("MTYPE");
                    String MESSAGE = (String) map.get("MESSAGE");
                    String pzacdocno = (String) map.get("pzacdocno");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateJTYBFBXCJ(requestid, RET_ACCNO,
                                ZSTATU, MESSAGE, pzacdocno);
                    } else {
                        publicmethod.setFailMessage(request, "failed",
                                "集团财务-一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO
                                        + " ZSTATU：" + ZSTATU + " ZDESC："
                                        + MESSAGE);
                        return SUCCESS;
                    }
                }
            } catch (RemoteException e) {
                publicmethod.setFailMessage(request, "failed",
                        "集团财务-一般费用报销创建接口异常：" + e);
                return SUCCESS;
            }
        }
        if ("0".equals(bxfs_value) && "0".equals(sbje_value)) {
            // 创建根节点ROOT
            String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            xmlstring = addRootHeadElement(xmlstring, "INPUT");
            xmlstring = addRootHeadElement(xmlstring, "HEADER");
            xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
            xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
            xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
            xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
            xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
            xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
            xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            xmlstring = addElement(xmlstring, "KURSF", "");
            xmlstring = addElement(xmlstring, "XREF2_HD", "OA系统");
            xmlstring = addRootFooterElement(xmlstring, "HEADER");
            xmlstring = addRootHeadElement(xmlstring, "LINES");
            RecordSet rs = new RecordSet();
            String sql = "select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl from "
                    + tablename + " a," + tablename
                    + "_dt1 b where a.id = b.mainid and a.requestid = '"
                    + requestid + "'";
            rs.execute(sql);
            while (rs.next()) {
                String yskm_value = Util.null2o(rs.getString("yskm"));
                String bxjes_value = Util.null2o(rs.getString("bxje"));
                String se_value = Util.null2o(rs.getString("se"));
                String jxskm_value = Util.null2o(rs.getString("jxskm"));
                String sfzp_value = Util.null2o(rs.getString("sfzp"));
                String sl_value = Util.null2o(rs.getString("sl"));
                xmlstring = addRootHeadElement(xmlstring, "LINE");
                xmlstring = addElement(xmlstring, "SHKZG", "S");
                xmlstring = addElement(xmlstring, "HKONT", yskm_value);
                xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
                xmlstring = addElement(xmlstring, "MWSKZ", "");
                double tol = Util.getDoubleValue(bxjes_value)
                        - Util.getDoubleValue(se_value);
                xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
                xmlstring = addElement(xmlstring, "DMBTR", "");
                xmlstring = addElement(xmlstring, "SGTXT", zy_value);
                xmlstring = addElement(xmlstring, "XNEGP", "");
                xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
                xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
                if (splx.equals(fylx_value)) {
                    xmlstring = addElement(xmlstring, "AUFNR", cph_value);
                } else {
                    xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
                }
                xmlstring = addElement(xmlstring, "POSID", "");
                xmlstring = addElement(xmlstring, "BUDG_CODE", "");
                xmlstring = addRootFooterElement(xmlstring, "LINE");
                if ("0".equals(sfzp_value)) {
                    xmlstring = addRootHeadElement(xmlstring, "LINE");
                    xmlstring = addElement(xmlstring, "SHKZG", "S");
                    xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
                    xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
                    xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
                    xmlstring = addElement(xmlstring, "WRBTR", se_value);
                    xmlstring = addElement(xmlstring, "DMBTR", "");
                    xmlstring = addElement(xmlstring, "SGTXT", zy_value);
                    xmlstring = addElement(xmlstring, "XNEGP", "");
                    xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
                    xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
                    if (splx.equals(fylx_value)) {
                        xmlstring = addElement(xmlstring, "AUFNR", cph_value);
                    } else {
                        xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
                    }
                    xmlstring = addElement(xmlstring, "POSID", "");
                    xmlstring = addElement(xmlstring, "BUDG_CODE", "");
                    xmlstring = addRootFooterElement(xmlstring, "LINE");
                }
            }

            xmlstring = addRootHeadElement(xmlstring, "LINE");
            xmlstring = addElement(xmlstring, "SHKZG", "H");
            xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
            xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
            xmlstring = addElement(xmlstring, "MWSKZ", "");
            xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
            xmlstring = addElement(xmlstring, "DMBTR", "");
            xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            xmlstring = addElement(xmlstring, "XNEGP", "");
            xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
            xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            if (splx.equals(fylx_value)) {
                xmlstring = addElement(xmlstring, "AUFNR", cph_value);
            } else {
                xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
            }
            xmlstring = addElement(xmlstring, "POSID", "");
            xmlstring = addElement(xmlstring, "BUDG_CODE", "");
            xmlstring = addRootFooterElement(xmlstring, "LINE");
            xmlstring = addRootFooterElement(xmlstring, "LINES");
            xmlstring = addRootFooterElement(xmlstring, "INPUT");

            writeLog("集团财务-一般费用报销传入xml参数：" + xmlstring);

            // SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new
            // SI_1057_OA2ERP_KJPZ_OUTProxy();
            // DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new
            // DT_1057_OA2ERP_KJPZ();
            // DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            // DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            // DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            // try {
            // DT_1057_OA2ERP_KJPZ_RETURN =
            // proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            // String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            // writeLog("集团财务-一般费用报销创建返回消息：" + returnmessage);
            // Map<String, String> map =
            // publicmethod.readXMLForCLFBXSQ(returnmessage);
            // if (null != map && !map.isEmpty()) {
            // String RET_ACCNO = (String) map.get("RET_ACCNO");
            // String ZSTATU = (String) map.get("ZSTATU");
            // String ZDESC = (String) map.get("ZDESC");
            // if ("S".equalsIgnoreCase(ZSTATU)) {
            // publicmethod.updateJTYBFBXCJ(requestid, RET_ACCNO, ZSTATU,
            // ZDESC);
            // } else {
            // publicmethod.setFailMessage(request, "failed",
            // "集团财务-一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU +
            // " ZDESC：" + ZDESC);
            // return SUCCESS;
            // }
            // }
            // } catch (RemoteException e) {
            // publicmethod.setFailMessage(request, "failed",
            // "集团财务-一般费用报销创建接口异常：" + e);
            // return SUCCESS;
            // }

            SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
            DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
            DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
            DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
            try {
                DT_1072_ALL2ERP_KJPZ_RETURN = proxy
                        .SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
                String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
                writeLog("集团财务-一般费用报销创建返回消息：" + returnmessage);
                Map<String, String> map = publicmethod
                        .readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("MTYPE");
                    String MESSAGE = (String) map.get("MESSAGE");
                    String pzacdocno = (String) map.get("pzacdocno");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateJTYBFBXCJ(requestid, RET_ACCNO,
                                ZSTATU, MESSAGE, pzacdocno);
                    } else {
                        publicmethod.setFailMessage(request, "failed",
                                "集团财务-一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO
                                        + " ZSTATU：" + ZSTATU + " ZDESC："
                                        + MESSAGE);
                        return SUCCESS;
                    }
                }
            } catch (RemoteException e) {
                publicmethod.setFailMessage(request, "failed",
                        "集团财务-一般费用报销创建接口异常：" + e);
                return SUCCESS;
            }
        }
        if ("0".equals(bxfs_value) && Double.parseDouble(sbje_value) > 0) {
            // 创建根节点ROOT
            String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
            xmlstring = addRootHeadElement(xmlstring, "INPUT");
            xmlstring = addRootHeadElement(xmlstring, "HEADER");
            xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
            xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
            xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
            xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
            xmlstring = addElement(xmlstring, "HEADER_TXT", pzttwb_value);
            xmlstring = addElement(xmlstring, "REF_DOC_NO", ckpzbh_value);
            xmlstring = addElement(xmlstring, "WAERS", hbm_value);
            xmlstring = addElement(xmlstring, "KURSF", "");
            xmlstring = addElement(xmlstring, "XREF2_HD", "OA系统");
            xmlstring = addRootFooterElement(xmlstring, "HEADER");
            xmlstring = addRootHeadElement(xmlstring, "LINES");
            RecordSet rs = new RecordSet();
            String sql = "select b.yskm,b.jxskm,b.bxje,b.se,sfzp,b.sl from "
                    + tablename + " a," + tablename
                    + "_dt1 b where a.id = b.mainid and a.requestid = '"
                    + requestid + "'";
            rs.execute(sql);
            while (rs.next()) {
                String yskm_value = Util.null2o(rs.getString("yskm"));
                String bxjes_value = Util.null2o(rs.getString("bxje"));
                String se_value = Util.null2o(rs.getString("se"));
                String jxskm_value = Util.null2o(rs.getString("jxskm"));
                String sfzp_value = Util.null2o(rs.getString("sfzp"));
                String sl_value = Util.null2o(rs.getString("sl"));
                xmlstring = addRootHeadElement(xmlstring, "LINE");
                xmlstring = addElement(xmlstring, "SHKZG", "S");
                xmlstring = addElement(xmlstring, "HKONT", yskm_value);
                xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
                xmlstring = addElement(xmlstring, "MWSKZ", "");
                double tol = Util.getDoubleValue(bxjes_value)
                        - Util.getDoubleValue(se_value);
                xmlstring = addElement(xmlstring, "WRBTR", String.valueOf(tol));
                xmlstring = addElement(xmlstring, "DMBTR", "");
                xmlstring = addElement(xmlstring, "SGTXT", zy_value);
                xmlstring = addElement(xmlstring, "XNEGP", "");
                xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
                xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
                if (splx.equals(fylx_value)) {
                    xmlstring = addElement(xmlstring, "AUFNR", cph_value);
                } else {
                    xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
                }
                xmlstring = addElement(xmlstring, "POSID", "");
                xmlstring = addElement(xmlstring, "BUDG_CODE", "");
                xmlstring = addRootFooterElement(xmlstring, "LINE");
                if ("0".equals(sfzp_value)) {
                    xmlstring = addRootHeadElement(xmlstring, "LINE");
                    xmlstring = addElement(xmlstring, "SHKZG", "S");
                    xmlstring = addElement(xmlstring, "HKONT", jxskm_value);
                    xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
                    xmlstring = addElement(xmlstring, "MWSKZ", sl_value);
                    xmlstring = addElement(xmlstring, "WRBTR", se_value);
                    xmlstring = addElement(xmlstring, "DMBTR", "");
                    xmlstring = addElement(xmlstring, "SGTXT", zy_value);
                    xmlstring = addElement(xmlstring, "XNEGP", "");
                    xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
                    xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
                    if (splx.equals(fylx_value)) {
                        xmlstring = addElement(xmlstring, "AUFNR", cph_value);
                    } else {
                        xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
                    }
                    xmlstring = addElement(xmlstring, "POSID", "");
                    xmlstring = addElement(xmlstring, "BUDG_CODE", "");
                    xmlstring = addRootFooterElement(xmlstring, "LINE");
                }
            }

            xmlstring = addRootHeadElement(xmlstring, "LINE");
            xmlstring = addElement(xmlstring, "SHKZG", "H");
            xmlstring = addElement(xmlstring, "HKONT", qtyszk_value);
            xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
            xmlstring = addElement(xmlstring, "MWSKZ", "");
            xmlstring = addElement(xmlstring, "WRBTR", bxje_value);
            xmlstring = addElement(xmlstring, "DMBTR", "");
            xmlstring = addElement(xmlstring, "SGTXT", zy_value);
            xmlstring = addElement(xmlstring, "XNEGP", "");
            xmlstring = addElement(xmlstring, "ZUONR", ckpzbh_value);
            xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
            if (splx.equals(fylx_value)) {
                xmlstring = addElement(xmlstring, "AUFNR", cph_value);
            } else {
                xmlstring = addElement(xmlstring, "AUFNR", gsxm_value);
            }
            xmlstring = addElement(xmlstring, "POSID", "");
            xmlstring = addElement(xmlstring, "BUDG_CODE", "");
            xmlstring = addRootFooterElement(xmlstring, "LINE");
            xmlstring = addRootFooterElement(xmlstring, "LINES");
            xmlstring = addRootFooterElement(xmlstring, "INPUT");

            writeLog("集团财务-一般费用报销传入xml参数：" + xmlstring);

            // SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new
            // SI_1057_OA2ERP_KJPZ_OUTProxy();
            // DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new
            // DT_1057_OA2ERP_KJPZ();
            // DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
            // DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
            // DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
            // try {
            // DT_1057_OA2ERP_KJPZ_RETURN =
            // proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
            // String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
            // writeLog("集团财务-一般费用报销创建返回消息：" + returnmessage);
            // Map<String, String> map =
            // publicmethod.readXMLForCLFBXSQ(returnmessage);
            // if (null != map && !map.isEmpty()) {
            // String RET_ACCNO = (String) map.get("RET_ACCNO");
            // String ZSTATU = (String) map.get("ZSTATU");
            // String ZDESC = (String) map.get("ZDESC");
            // if ("S".equalsIgnoreCase(ZSTATU)) {
            // publicmethod.updateJTYBFBXCJ(requestid, RET_ACCNO, ZSTATU,
            // ZDESC);
            // } else {
            // publicmethod.setFailMessage(request, "failed",
            // "集团财务-一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU +
            // " ZDESC：" + ZDESC);
            // return SUCCESS;
            // }
            // }
            // } catch (RemoteException e) {
            // publicmethod.setFailMessage(request, "failed",
            // "集团财务-一般费用报销创建接口异常：" + e);
            // return SUCCESS;
            // }

            SI_1072_ALL2ERP_KJPZ_OUTProxy proxy = new SI_1072_ALL2ERP_KJPZ_OUTProxy();
            DT_1072_ALL2ERP_KJPZ DT_1072_ALL2ERP_KJPZ = new DT_1072_ALL2ERP_KJPZ();
            DT_1072_ALL2ERP_KJPZ.setOUTPUT(xmlstring);
            DT_1072_ALL2ERP_KJPZ.setSYSTEM(sysid_value);
            DT_1072_ALL2ERP_KJPZ_RETURN DT_1072_ALL2ERP_KJPZ_RETURN = null;
            try {
                DT_1072_ALL2ERP_KJPZ_RETURN = proxy
                        .SI_1072_ALL2ERP_KJPZ_OUT(DT_1072_ALL2ERP_KJPZ);
                String returnmessage = DT_1072_ALL2ERP_KJPZ_RETURN.getINPUT();
                writeLog("集团财务-一般费用报销创建返回消息：" + returnmessage);
                Map<String, String> map = publicmethod
                        .readXMLForCLFBXSQ(returnmessage);
                if (null != map && !map.isEmpty()) {
                    String RET_ACCNO = (String) map.get("RET_ACCNO");
                    String ZSTATU = (String) map.get("MTYPE");
                    String MESSAGE = (String) map.get("MESSAGE");
                    String pzacdocno = (String) map.get("pzacdocno");
                    if ("S".equalsIgnoreCase(ZSTATU)) {
                        publicmethod.updateJTYBFBXCJ(requestid, RET_ACCNO,
                                ZSTATU, MESSAGE, pzacdocno);
                    } else {
                        publicmethod.setFailMessage(request, "failed",
                                "集团财务-一般费用报销创建失败：RET_ACCNO：" + RET_ACCNO
                                        + " ZSTATU：" + ZSTATU + " ZDESC："
                                        + MESSAGE);
                        return SUCCESS;
                    }
                }
            } catch (RemoteException e) {
                publicmethod.setFailMessage(request, "failed",
                        "集团财务-一般费用报销创建接口异常：" + e);
                return SUCCESS;
            }
        }

        return SUCCESS;
    }

    /**
     * 增加ROOT头
     *
     * @param xmlstring
     * @param elementNodeName
     * @return
     */
    public static String addRootHeadElement(String xmlstring,
                                            String elementNodeName) {
        return xmlstring + "<" + elementNodeName + ">";
    }

    /**
     * 增加ROOT尾
     *
     * @param xmlstring
     * @param elementNodeName
     * @return
     */
    public static String addRootFooterElement(String xmlstring,
                                              String elementNodeName) {
        return xmlstring + "</" + elementNodeName + ">";
    }

    /**
     * 增加元素
     *
     * @param xmlstring
     * @param elementNodeName
     * @param text
     * @return
     */
    public static String addElement(String xmlstring, String elementNodeName,
                                    String text) {
        return xmlstring + "<" + elementNodeName + ">" + text + "</"
                + elementNodeName + ">";
    }
}
