package weaver.interfaces.jiangyl.hrm;

import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;

/**
 * 同步SAP岗位数据到中间表（SAPHR160818.uf_exjobtitles）
 * 
 * @param dataxml
 * @return
 */
public class JobTitlesSapSynServiceImp extends BaseBean implements JobTitlesSapSynService {

	public String jobTitlesSapSyn(String dataxml) {
		Map<String,String> map = readXMLForSQ(dataxml);
		if(null == map) {
			return returnmessage("1");
		}
		StringBuffer sql = new StringBuffer();
		StringBuffer sql2 = new StringBuffer();
		String jobcode = (String) map.get("JOBCODE");
		if(null == jobcode || "".equals(jobcode)) {
			return returnmessage("2");
		}
		RecordSet rs = new RecordSet();
		rs.execute("select count(*) count from saphr160818.uf_exjobtitles where jobcode = '"+jobcode+"'");
		rs.next();
		String id = rs.getString("count");
		if(Integer.parseInt(id) > 0) {
			sql.append("update saphr160818.uf_exjobtitles set ");
		} else {
			sql.append("insert into saphr160818.uf_exjobtitles (");
		}
		for(Entry<String,String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			if(Integer.parseInt(id) > 0) {
				if(!"JOBCODE".equalsIgnoreCase(key) || !"ID".equalsIgnoreCase(key)) {
					sql.append(key+"='"+val+"' ,");
				}
			} else {
				sql.append(key+",");
				sql2.append("'"+val+"', ");
			}
		}
		String currentdate = "sysdate";
		String finalsql = "";
		String finalsql2 = "";
		if(Integer.parseInt(id) > 0) {
			finalsql = sql.toString();
			finalsql += " flag = 'U',crdate = "+currentdate+" where jobcode = '"+jobcode+"'";
		} else {
			finalsql = sql.toString();
			finalsql2 = sql2.toString();
			finalsql2 += "'I',"+currentdate+"";
			finalsql += "flag,MODDATE) values (" + finalsql2 + ")";
		}
		writeLog("执行SQL: "+ finalsql);
		boolean result = rs.execute(finalsql);
		if(result) {
			return returnmessage("0");
		}
		return returnmessage("2");
	}
	
    /**
     * 解析岗位XML
     * 
     * @param xml
     * @return
     */
    public static Map<String, String> readXMLForSQ(String xml) {
        Map<String, String> map = new HashMap<String, String>();
        //创建一个新的字符串  
        StringReader reader = new StringReader(xml);
        InputSource source = new InputSource(reader);
        SAXBuilder sax = new SAXBuilder();
        try {
            Document doc = sax.build(source);
            Element root = doc.getRootElement();
            String rootname = root.getName();
            if(!"ROOT".equalsIgnoreCase(rootname)){
            	return null;
            }
            List<?> node = root.getChildren();
            Element el = null;
            for (int i = 0; i < node.size(); i++) {
                el = (Element) node.get(i);
                String nodename = el.getName();
                String nodetext = el.getValue();
                if ("ID".equalsIgnoreCase(nodename)) {
                    map.put("ID", nodetext);
                }
                if ("SHORTNAME".equalsIgnoreCase(nodename)) {
                    map.put("SHORTNAME", nodetext);
                }
                if ("NAME".equalsIgnoreCase(nodename)) {
                    map.put("NAME", nodetext);
                }
                if ("COMPANYCODE".equalsIgnoreCase(nodename)) {
                    map.put("COMPANYCODE", nodetext);
                }
                if ("DEPTCODE".equalsIgnoreCase(nodename)) {
                    map.put("DEPTCODE", nodetext);
                }
                if ("JOBCODE".equalsIgnoreCase(nodename)) {
                    map.put("JOBCODE", nodetext);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return map;
    }
    
    /**
     * 返回信息
     * 
     * @param flag 0: 成功 1：失败
     * @return
     */
    public String returnmessage(String flag) {
    	String message = "";
    	message = addRootHeadElement(message,"ROOT");
    	if("0".equals(flag)) {
    		message = addElement(message,"MESSAGE","SUCCESS");
    		message = addElement(message,"DETAIL","处理成功！");
    	} else if("1".equals(flag)){
    		message = addElement(message,"MESSAGE","FAILED");
    		message = addElement(message,"DETAIL","解析XML数据格式错误！");
    	} else {
    		message = addElement(message,"MESSAGE","FAILED");
    		message = addElement(message,"DETAIL","操作数据表失败！");
    	}
    	message = addRootFooterElement(message,"ROOT");
    	return message;
    }
    
    /**
     * 增加ROOT头
     * 
     * @param xmlstring
     * @param elementNodeName
     * @return
     */
    public static String addRootHeadElement(String xmlstring, String elementNodeName) {
		return xmlstring + "<" + elementNodeName + ">";
	}
    
    /**
     * 增加ROOT尾
     * 
     * @param xmlstring
     * @param elementNodeName
     * @return
     */
    public static String addRootFooterElement(String xmlstring, String elementNodeName) {
		return xmlstring +  "</" + elementNodeName + ">";
	}
    
    /**
     * 增加元素
     * 
     * @param xmlstring
     * @param elementNodeName
     * @param text
     * @return
     */
    public static String addElement(String xmlstring,
                                     String elementNodeName,
                                     String text) {
    	return xmlstring + "<" + elementNodeName + ">" + text + "</" + elementNodeName + ">";
    }
}
