package weaver.interfaces.gx.jyl.jtcw;

import java.rmi.RemoteException;
import java.util.Map;

import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ;
import net.jsgx.www.E1D.service.DT_1072_ALL2ERP_KJPZ_RETURN;
import net.jsgx.www.E1D.service.SI_1072_ALL2ERP_KJPZ_OUTProxy;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.gx.jyl.cw.base.CWPublicMethod;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

/**
 * 集团-还款申请-创建凭证
 */
public class JTHKSQCreateAction extends BaseBean implements Action {

	private CWPublicMethod publicmethod = new CWPublicMethod();

	public String execute(RequestInfo request) {
		String requestid = request.getRequestid();
		String src = request.getRequestManager().getSrc();
		if (!"submit".equals(src)) {
			new weaver.general.BaseBean().writeLog("一般费用报销退回操作，不执行接口.");
			return SUCCESS;
		}

		// 凭证抬头文本
		String hksm_value = "";
		String hksm_column = "hksm";
		// 凭证类型
		String pzlx_value = "";
		String pzlx_column = "pzlx";
		// 参考凭证编号
		String hkbh_value = "";
		String hkbh_column = "hkbh";
		// 公司代码
		String gsdm_value = "";
		String gsdm_column = "gsdm";
		// 凭证中凭证日期
		String pzrq_value = "";
		String pzrq_column = "pzrq";
		// 凭证中过账日期
		String gzrq_value = "";
		String gzrq_column = "gzrq";
		// 报销人员工号
		String ygbh_value = "";
		String ygbh_column = "yggys";
		// 现金-银行
		String xjyh_value = "";
		String xjyh_column = "xjyh";
		// 应收账款-其他
		String qtysk_value = "";
		String qtysk_column = "qtysk";
		// 还款金额
		String hkje_value = "";
		String hkje_column = "hkje";
		// 摘要
		String zy_value = "";
		String zy_column = "zy";
		// 成本中心
		String cbzx_value = "";
		String cbzx_column = "cbzx";
		// 系统字段
		String sysid_value = "";
		String sysid_column = "sysid";
		// 反记账
		String fjz_value = "";
		String fjz_column = "fjz";
		//资金预算码
		String zjysm_value = "";
		String zjysm_column = "zjysm";

		Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
		for (int i = 0; i < properties.length; i++) {
			String name = properties[i].getName();// 主字段名称
			String value = Util.null2String(properties[i].getValue());// 主字段对应的值
			if (name.equals(ygbh_column)) {
				ygbh_value = value;
			}
			if (name.equals(hksm_column)) {
				hksm_value = value;
			}
			if (name.equals(pzlx_column)) {
				pzlx_value = value;
			}
			if (name.equals(hkbh_column)) {
				hkbh_value = value;
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
			if (name.equals(xjyh_column)) {
				xjyh_value = value;
			}
			if (name.equals(qtysk_column)) {
				qtysk_value = value;
			}
			if (name.equals(sysid_column)) {
				sysid_value = value;
			}
			if (name.equals(sysid_column)) {
				sysid_value = value;
			}
			if (name.equals(hkje_column)) {
				hkje_value = value;
			}
			if (name.equals(zy_column)) {
				zy_value = value;
			}
			if (name.equals(cbzx_column)) {
				cbzx_value = value;
			}
			if (name.equals(fjz_column)) {
				fjz_value = value;
			}
			if (name.equals(zjysm_column)) {
				zjysm_value = value;
			}
		}
		writeLog("凭证抬头文本:" + hksm_value);
		writeLog("凭证类型:" + pzlx_value);
		writeLog("参考凭证编号:" + hkbh_value);
		writeLog("公司代码:" + gsdm_value);
		writeLog("凭证日期:" + pzrq_value);
		writeLog("过账日期:" + gzrq_value);
		writeLog("现金-银行:" + xjyh_value);
		writeLog("SYSID:" + sysid_value);
		writeLog("应收帐款-其他:" + qtysk_value);
		writeLog("员工编号:" + ygbh_value);
		writeLog("还款金额:" + hkje_value);
		writeLog("成本中心:" + cbzx_value);
		writeLog("摘要:" + zy_value);
		writeLog("反记账:" + fjz_value);
		writeLog("资金预算码:" + zjysm_value);

		String xmlstring = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlstring = addRootHeadElement(xmlstring, "INPUT");
		xmlstring = addRootHeadElement(xmlstring, "HEADER");
		xmlstring = addElement(xmlstring, "COMP_CODE", gsdm_value);
		xmlstring = addElement(xmlstring, "DOC_TYPE", pzlx_value);
		xmlstring = addElement(xmlstring, "DOC_DATE", pzrq_value);
		xmlstring = addElement(xmlstring, "PSTNG_DATE", gzrq_value);
		xmlstring = addElement(xmlstring, "HEADER_TXT", hksm_value);
		xmlstring = addElement(xmlstring, "REF_DOC_NO", hkbh_value);
		xmlstring = addElement(xmlstring, "WAERS", "");
		xmlstring = addElement(xmlstring, "KURSF", "");
		xmlstring = addElement(xmlstring, "XREF2_HD", "OA系统");
		xmlstring = addRootFooterElement(xmlstring, "HEADER");

		xmlstring = addRootHeadElement(xmlstring, "LINES");

		xmlstring = addRootHeadElement(xmlstring, "LINE");
		xmlstring = addElement(xmlstring, "SHKZG", "S");
		xmlstring = addElement(xmlstring, "HKONT", xjyh_value);
		xmlstring = addElement(xmlstring, "ZWLDW", "");
		xmlstring = addElement(xmlstring, "MWSKZ", "");
		xmlstring = addElement(xmlstring, "WRBTR", hkje_value);
		xmlstring = addElement(xmlstring, "DMBTR", "");
		xmlstring = addElement(xmlstring, "SGTXT", zy_value);
		xmlstring = addElement(xmlstring, "XNEGP", fjz_value);
		xmlstring = addElement(xmlstring, "ZUONR", hkbh_value);
		xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
		xmlstring = addElement(xmlstring, "AUFNR", "");
		xmlstring = addElement(xmlstring, "POSID", "");
		xmlstring = addElement(xmlstring, "BUDG_CODE", zjysm_value);
		xmlstring = addRootFooterElement(xmlstring, "LINE");

		xmlstring = addRootHeadElement(xmlstring, "LINE");
		xmlstring = addElement(xmlstring, "SHKZG", "H");
		xmlstring = addElement(xmlstring, "HKONT", qtysk_value);
		xmlstring = addElement(xmlstring, "ZWLDW", ygbh_value);
		xmlstring = addElement(xmlstring, "MWSKZ", "");
		xmlstring = addElement(xmlstring, "WRBTR", hkje_value);
		xmlstring = addElement(xmlstring, "DMBTR", "");
		xmlstring = addElement(xmlstring, "SGTXT", zy_value);
		xmlstring = addElement(xmlstring, "XNEGP", fjz_value);
		xmlstring = addElement(xmlstring, "ZUONR", hkbh_value);
		xmlstring = addElement(xmlstring, "KOSTL", cbzx_value);
		xmlstring = addElement(xmlstring, "AUFNR", "");
		xmlstring = addElement(xmlstring, "POSID", "");
		xmlstring = addElement(xmlstring, "BUDG_CODE", zjysm_value);
		xmlstring = addRootFooterElement(xmlstring, "LINE");

		xmlstring = addRootFooterElement(xmlstring, "LINES");

		xmlstring = addRootFooterElement(xmlstring, "INPUT");

		writeLog("集团-还款申请传入xml参数：" + xmlstring);

		// SI_1057_OA2ERP_KJPZ_OUTProxy proxy = new
		// SI_1057_OA2ERP_KJPZ_OUTProxy();
		// DT_1057_OA2ERP_KJPZ DT_1057_OA2ERP_KJPZ = new DT_1057_OA2ERP_KJPZ();
		// DT_1057_OA2ERP_KJPZ.setOUTPUT(xmlstring);
		// DT_1057_OA2ERP_KJPZ.setSYSID(sysid_value);
		// //TODO 反记账
		// DT_1057_OA2ERP_KJPZ_RETURN DT_1057_OA2ERP_KJPZ_RETURN = null;
		// try {
		// DT_1057_OA2ERP_KJPZ_RETURN =
		// proxy.SI_1057_OA2ERP_KJPZ_OUT(DT_1057_OA2ERP_KJPZ);
		// String returnmessage = DT_1057_OA2ERP_KJPZ_RETURN.getINPUT();
		// writeLog("集团-还款申请创建返回消息：" + returnmessage);
		// Map<String, String> map =
		// publicmethod.readXMLForCLFBXSQ(returnmessage);
		// if (null != map && !map.isEmpty()) {
		// String RET_ACCNO = (String) map.get("RET_ACCNO");
		// String ZSTATU = (String) map.get("ZSTATU");
		// String ZDESC = (String) map.get("ZDESC");
		// if ("S".equalsIgnoreCase(ZSTATU)) {
		// publicmethod.updateJTHKSQCJ(requestid, RET_ACCNO, ZSTATU, ZDESC);
		// } else {
		// publicmethod.setFailMessage(request, "failed",
		// "集团-还款申请创建失败：RET_ACCNO：" + RET_ACCNO + " ZSTATU：" + ZSTATU +
		// " ZDESC：" + ZDESC);
		// return SUCCESS;
		// }
		// }
		// } catch (RemoteException e) {
		// publicmethod.setFailMessage(request, "failed", "集团-还款申请创建接口异常：" + e);
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
			writeLog("集团-还款申请创建返回消息：" + returnmessage);
			Map<String, String> map = publicmethod.readXMLForCLFBXSQ(returnmessage);
			if (null != map && !map.isEmpty()) {
				String RET_ACCNO = (String) map.get("RET_ACCNO");
				String ZSTATU = (String) map.get("MTYPE");
				String MESSAGE = (String) map.get("MESSAGE");
				String pzacdocno = (String) map.get("pzacdocno");
				if ("S".equalsIgnoreCase(ZSTATU)) {
					publicmethod.updateJTHKSQCJ(requestid, RET_ACCNO, ZSTATU,MESSAGE,pzacdocno);
				} else {
					publicmethod.setFailMessage(request, "failed", "集团-还款申请创建失败：RET_ACCNO：" + RET_ACCNO + " MTYPE：" + ZSTATU + " MESSAGE：" + MESSAGE);
					return SUCCESS;
				}
			}
		} catch (RemoteException e) {
			publicmethod
					.setFailMessage(request, "failed", "集团-还款申请创建接口异常：" + e);
			return SUCCESS;
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

	public static void main(String[] args) {
		System.out.println("1");
	}


}
