package weaver.interfaces.gx.jyl.gys;

import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.Vendors;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsCriteria;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsQuery;
import jsgx_mdm_business_partner.beans.ws.mdm.sap.com.VendorsResultSet;
import JSGX_MDM_BUSINESS_PARTNERWsd.JSGX_MDM_BUSINESS_PARTNERViProxy;

public class Test {

	public static void main(String[] args) {
		//检查是否有在途的编号
		String gysmc = "地产供应商测试";
		String sh = "";
		String djh = "91320300711555109G";
		String zzjgdm = "";
		GYSPublicMethod GYSPublicMethod = new GYSPublicMethod();
		JSGX_MDM_BUSINESS_PARTNERViProxy f = new JSGX_MDM_BUSINESS_PARTNERViProxy();
		VendorsQuery vendorsQuery = new VendorsQuery();
		VendorsResultSet vendorsResultSet = null;
		if(!"".equals(gysmc)) {
			VendorsCriteria vendorsCriteria = new VendorsCriteria();
			vendorsCriteria.setFULL_NAME(GYSPublicMethod.setTextCriteria(gysmc));
			vendorsQuery.setCriteria(vendorsCriteria);
			try {
			    vendorsResultSet = f.searchVendors(vendorsQuery, GYSPublicMethod.setReposInfo());
			    if(null != vendorsResultSet) {
			    	Vendors[] vendors = vendorsResultSet.getVendors();
			    	if(vendors != null) {
				    	if(vendors.length > 0) {
				    		System.out.println("{\"flag\":\"2\"}");
						} else {
							System.out.println("{\"flag\":\"0\"}");
						}
			    	} else {
			    		System.out.println("{\"flag\":\"0\"}");
			    	}
			    }
			} catch (java.rmi.RemoteException e) {
			    e.printStackTrace();
			}
		}
	}
}
