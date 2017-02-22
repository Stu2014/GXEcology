/**
 * FundcenterLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FundcenterWsd;

public class FundcenterLocator extends org.apache.axis.client.Service implements FundcenterWsd.Fundcenter {

    public FundcenterLocator() {
    }


    public FundcenterLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FundcenterLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Fundcenter
    private java.lang.String Fundcenter_address = "http://10.254.49.95:50000/sapws/sap.com/Fundcenter_ENTAPP_com.sap.mdm.ws.gen.ejbs_FundcenterVi/Fundcenter/Fundcenter?style=document";

    public java.lang.String getFundcenterAddress() {
        return Fundcenter_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FundcenterWSDDServiceName = "Fundcenter";

    public java.lang.String getFundcenterWSDDServiceName() {
        return FundcenterWSDDServiceName;
    }

    public void setFundcenterWSDDServiceName(java.lang.String name) {
        FundcenterWSDDServiceName = name;
    }

    public FundcenterWsd.FundcenterVi getFundcenter() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Fundcenter_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFundcenter(endpoint);
    }

    public FundcenterWsd.FundcenterVi getFundcenter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            FundcenterWsd.Fundcenter_FundcenterBindingStub _stub = new FundcenterWsd.Fundcenter_FundcenterBindingStub(portAddress, this);
            _stub.setPortName(getFundcenterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFundcenterEndpointAddress(java.lang.String address) {
        Fundcenter_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (FundcenterWsd.FundcenterVi.class.isAssignableFrom(serviceEndpointInterface)) {
                FundcenterWsd.Fundcenter_FundcenterBindingStub _stub = new FundcenterWsd.Fundcenter_FundcenterBindingStub(new java.net.URL(Fundcenter_address), this);
                _stub.setPortName(getFundcenterWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Fundcenter".equals(inputPortName)) {
            return getFundcenter();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:FundcenterWsd", "Fundcenter");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:FundcenterWsd", "Fundcenter"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Fundcenter".equals(portName)) {
            setFundcenterEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
