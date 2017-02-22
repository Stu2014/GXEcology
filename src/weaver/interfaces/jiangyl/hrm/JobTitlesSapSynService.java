package weaver.interfaces.jiangyl.hrm;

public interface JobTitlesSapSynService {

	/**
	 * 同步SAP岗位数据到中间表（SAPHR160818.uf_exjobtitles）
	 * 
	 * @param dataxml
	 * @return
	 */
	public String jobTitlesSapSyn(String dataxml);
}
