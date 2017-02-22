package weaver.interfaces.gx.jyl.jtcw;

import java.rmi.RemoteException;
import java.util.Map;

import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ;
import net.jsgx.www.E1D.service.DT_1049_ALL2ERP_ZJZFSQ_RETURN;
import net.jsgx.www.E1D.service.SI_1049_ALL2ERP_ZJZFSQ_OUTProxy;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.hrm.resource.ResourceComInfo;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 集团财务-差旅费用报销-资金支付
 */
public class JTCLFBXZJZFCreateAction extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		if (!"submit".equals(src)) {
			new weaver.general.BaseBean().writeLog("集团财务-差旅费用报销-资金支付-创建退回操作，不执行接口.");
			return SUCCESS;
		}
		// 单据类型-值
		String djlx_value = "";
		// 单据类型-字段
		String djlx_column = "djlx";
		// 公司代码-值
		String gsdm_value = "";
		// 公司代码-字段
		String gsdm_column = "gsdm";
		// 财年-值
		String cn_value = "";
		// 财年-字段
		String cn_column = "cn";
		// 会计期间-值
		String kjqj_value = "";
		// 会计期间-字段
		String kjqj_column = "kjqj";
		// 成本中心-值
		String cbzx_value = "";
		// 成本中心-字段
		String cbzx_column = "fycdbm";
		// 资金占用凭证编号-值
		String zjzypzbh_value = "";
		// 资金占用凭证编号-字段
		String zjzypzbh_column = "fzjpzh";
		// 原始申请单号-值
		String yssqh_value = "";
		// 原始申请单号-字段
		String yssqh_column = "sqbh";
		// 付款类型-值
		String fklx_value = "";
		// 付款类型-字段
		String fklx_column = "fklx";
		// 申请日期-值
		String sqrq_value = "";
		// 申请日期-字段
		String sqrq_column = "sqrq";
		// 经办人-值
		String jbr_value = "";
		// 经办人-字段
		String jbr_column = "jbr";
		// 申请金额-值
		String sqje_value = "";
		// 申请金额-字段
		String sqje_column = "sbje";
		// 货币码-值
		String hbm_value = "";
		// 货币码-字段
		String hbm_column = "hbm";
		// 付款日期-值
		String fkrq_value = "";
		// 付款日期-字段
		String fkrq_column = "jhfkrq";
		// 员工编号-值
		String ygbh_value = "";
		// 员工编号-字段
		String ygbh_column = "ygbh";
		// 资金预算码-值
		String zjysm_value = "";
		// 资金预算码-字段
		String zjysm_column = "zjysm";
		// 摘要-值
		String zy_value = "";
		// 摘要-字段
		String zy_column = "zy";
		// 摘要-值
		String xtzd_value = "";
		// 摘要-字段
		String xtzd_column = "sysid";
		// 报销方式-值
		String bxfs_value = "";
		// 报销方式-字段
		String bxfs_column = "sfcjk";

		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(djlx_column)) {
				djlx_value = value;
			}
			if (name.equals(gsdm_column)) {
				gsdm_value = value;
			}
			if (name.equals(cn_column)) {
				cn_value = value;
			}
			if (name.equals(kjqj_column)) {
				kjqj_value = value;
			}
			if (name.equals(cbzx_column)) {
				cbzx_value = value;
			}
			if (name.equals(zjzypzbh_column)) {
				zjzypzbh_value = value;
			}
			if (name.equals(yssqh_column)) {
				yssqh_value = value;
			}
			if (name.equals(ygbh_column)) {
				ygbh_value = value;
			}
			if (name.equals(fklx_column)) {
				fklx_value = value;
			}
			if (name.equals(sqrq_column)) {
				sqrq_value = value;
				if (!"".equals(sqrq_value)) {
					sqrq_value = sqrq_value.replaceAll("-", "");
				}
			}
			if (name.equals(jbr_column)) {
				try {
					jbr_value = new ResourceComInfo().getLastname(value);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (name.equals(sqje_column)) {
				sqje_value = value;
			}
			if (name.equals(hbm_column)) {
				hbm_value = value;
			}
			if (name.equals(fkrq_column)) {
				fkrq_value = value;
				if (!"".equals(fkrq_value)) {
					fkrq_value = fkrq_value.replaceAll("-", "");
				}
			}
			if (name.equals(zjysm_column)) {
				zjysm_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(xtzd_column)) {
				xtzd_value = value;
			}
			if (name.equals(bxfs_column)) {
				bxfs_value = value;
			}
		}
		writeLog("单据类型：" + djlx_value);
		writeLog("公司代码：" + gsdm_value);
		writeLog("财年：" + cn_value);
		writeLog("会计期间：" + kjqj_value);
		writeLog("成本中心：" + cbzx_value);
		writeLog("资金占用凭证编号：" + zjzypzbh_value);
		writeLog("原始申请单号：" + yssqh_value);
		writeLog("付款类型：" + fklx_value);
		writeLog("员工编码：" + ygbh_value);
		writeLog("申请日期：" + sqrq_value);
		writeLog("经办人：" + jbr_value);
		writeLog("申请金额：" + sqje_value);
		writeLog("货币码：" + hbm_value);
		writeLog("付款日期：" + fkrq_value);
		writeLog("资金预算码：" + zjysm_value);
		writeLog("摘要：" + zy_value);
		writeLog("系统字段：" + xtzd_value);
		writeLog("报销方式：" + bxfs_value);
		
		if(("1".equals(bxfs_value) || ("0".equals(bxfs_value) && Double.parseDouble(sqje_value) >= 0))) {
			// 创建根节点ROOT
			String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
			xmlstring = addRootHeadElement(xmlstring, "ROOT");
			xmlstring = addRootHeadElement(xmlstring, "HEAD");
			xmlstring = addElement(xmlstring, "ZDJLX", djlx_value);
			xmlstring = addElement(xmlstring, "BUKRS", gsdm_value);
			xmlstring = addElement(xmlstring, "GJAHR", cn_value);
			xmlstring = addElement(xmlstring, "MONAT", kjqj_value);
			xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
			xmlstring = addElement(xmlstring, "ZJPZH_ZY", zjzypzbh_value);
			xmlstring = addElement(xmlstring, "APPLYNO_EX", yssqh_value);
			xmlstring = addElement(xmlstring, "ZFKLX", fklx_value);
			xmlstring = addElement(xmlstring, "LIFNR", ygbh_value);
			xmlstring = addElement(xmlstring, "BRPDT", sqrq_value);
			xmlstring = addElement(xmlstring, "ZJBR", jbr_value);
			xmlstring = addElement(xmlstring, "SQJE_HSB", sqje_value);
			xmlstring = addElement(xmlstring, "WAERS", hbm_value);
			xmlstring = addElement(xmlstring, "PAY_DATE", fkrq_value);
			xmlstring = addElement(xmlstring, "RECE_ACC_NAME", ygbh_value);
			xmlstring = addElement(xmlstring, "BUDG_CODE", zjysm_value);
			xmlstring = addElement(xmlstring, "ABSTRACT", zy_value);

			xmlstring = addRootFooterElement(xmlstring, "HEAD");
			xmlstring = addRootFooterElement(xmlstring, "ROOT");

			writeLog("集团财务-差旅费用报销-资金支付傳入xml参数：" + xmlstring);
			SI_1049_ALL2ERP_ZJZFSQ_OUTProxy proxy = new SI_1049_ALL2ERP_ZJZFSQ_OUTProxy();
			DT_1049_ALL2ERP_ZJZFSQ DT_1049_ALL2ERP_ZJZFSQ = new DT_1049_ALL2ERP_ZJZFSQ();
			DT_1049_ALL2ERP_ZJZFSQ.setOUTPUT(xmlstring);
			DT_1049_ALL2ERP_ZJZFSQ.setSYSTEM(xtzd_value);
			DT_1049_ALL2ERP_ZJZFSQ_RETURN DT_1049_ALL2ERP_ZJZFSQ_RETURN = null;
			try {
				DT_1049_ALL2ERP_ZJZFSQ_RETURN = proxy
						.SI_1049_ALL2ERP_ZJZFSQ_OUT(DT_1049_ALL2ERP_ZJZFSQ);
				String returnmessage = DT_1049_ALL2ERP_ZJZFSQ_RETURN.getINPUT();
				writeLog("集团财务-差旅费用报销-资金支付返回消息：" + returnmessage);
				Map<String, String> map = publicmethod.readXMLForSQ(returnmessage);
				if (null != map && !map.isEmpty()) {
					String type = (String) map.get("TYPE");
					String no = (String) map.get("APPLYNO");
					String code = (String) map.get("CODE");
					String message = (String) map.get("MESSAGE");
					if ("S".equalsIgnoreCase(type)) {
						publicmethod.updateJTCLFXBXZJZFD(requestid, type, code, message,
								no);
					} else {
						publicmethod.setFailMessage(request, "failed",
								"集团财务-差旅费用报销-资金支付失败：TYPE：" + type + " code：" + code
										+ " applyno：" + no + " message：" + message);
						return SUCCESS;
					}
				}
			} catch (RemoteException e) {
				publicmethod.setFailMessage(request, "failed", "集团财务-差旅费用报销-资金支付接口异常："
						+ e);
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
