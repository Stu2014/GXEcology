/**
 * Fundcenter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FundcenterWsd;

public interface Fundcenter extends javax.xml.rpc.Service {
    public java.lang.String getFundcenterAddress();

    public FundcenterWsd.FundcenterVi getFundcenter() throws javax.xml.rpc.ServiceException;

    public FundcenterWsd.FundcenterVi getFundcenter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
