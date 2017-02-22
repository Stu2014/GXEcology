package weaver.interfaces.gx.jyl.clfbx;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.Util;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Cell;
import weaver.soa.workflow.request.DetailTable;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.soa.workflow.request.Row;

/**
 * 差旅费报销通过
 */
public class CLFBXTGAction extends BaseBean implements Action {

	public String execute(RequestInfo request) {
		//是否冲销借款-值
        String sfcjk_value = "";
        //是否冲销借款-字段
        String sfcjk_column = "sfcjk";
		//冲销金额-值
        String cxje_value = "";
        //冲销金额-字段
        String cxje_column = "cxje";
		//还款金额-值
        String hkje_value = "";
        //还款金额-字段
        String hkje_column = "hkje";
		//借款单号-值
        String jkdh_value = "";
        //借款单号-字段
        String jkdh_column = "jkdh";
        
        RecordSet rs = new RecordSet();
        
        String src = request.getRequestManager().getSrc();
        if(!"submit".equals(src)) {
        	return SUCCESS;
        }
        
        Property[] properties = request.getMainTableInfo().getProperty();// 获取表单主字段信息
        for (int i = 0; i < properties.length; i++) {
            String name = properties[i].getName();// 主字段名称
            String value = Util.null2String(properties[i].getValue());// 主字段对应的值
            if (name.equals(sfcjk_column)) {
            	sfcjk_value = value;
            }
        }
        DetailTable[] detailtable = request.getDetailTableInfo().getDetailTable();// 获取所有明细表
        DetailTable dt = detailtable[3];// 指定明细表 0表示明细表1
        Row[] s1 = dt.getRow();// 当前明细表的所有数据,按行存储
        for (int j = 0; j < s1.length; j++) {
            Row r = s1[j];// 指定行
            Cell c[] = r.getCell();// 每行数据再按列存储
            for (int k = 0; k < c.length; k++) {
                Cell c1 = c[k];// 指定列
                String name = c1.getName();// 明细字段名称（对应明细表表单字段名称，如：mx_name）
                String value = c1.getValue();// 明细字段的值（对应明细表表单中的mx_name的值）
                if (cxje_column.equals(name)) {
                	cxje_value = value;
                }
                if (hkje_column.equals(name)) {
                	hkje_value = value;
                }
                if (hkje_column.equals(name)) {
                	hkje_value = value;
                }
                if (jkdh_column.equals(name)) {
                	jkdh_value = value;
                }
            }
        }
        writeLog("是否冲销借款："+ sfcjk_value);
        writeLog("冲销金额："+ cxje_value);
        writeLog("还款金额："+ hkje_value);
        writeLog("借款单号："+ jkdh_value);
        
        double dou = Util.getDoubleValue(cxje_value,0);
        double dou1 = Util.getDoubleValue(hkje_value,0);
        double total = dou + dou1;
        writeLog("审批通过将在途借款金额释放，同时将在途借款金额变为累计借款金额："+ total);
        if("0".equals(sfcjk_value)) {
        	String tablename = getPropValue("GXBX", "CW_FYJK");
        	String sql = "update "+tablename+" set hkztje=nvl(hkztje,0)-'"+total+"',ljhkje=nvl(ljhkje,0)+'"+total+"' where id='"+jkdh_value+"'  ";
        	writeLog("审批通过时 : " + sql);
        	rs.execute(sql);
        }
		return SUCCESS;
	}
	
}
