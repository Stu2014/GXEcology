package weaver.interfaces.jiangyl.hrm;

public interface HrmSapSynService {

	/**
	 * 同步SAP人员数据到中间表（SAPHR160818.uf_experson）
	 * 
	 * @param dataxml
	 * @return
	 */
	public String hrmSapSyn(String dataxml);
}
