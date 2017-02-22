/**
 * Fundcenter_FundcenterBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FundcenterWsd;

public class Fundcenter_FundcenterBindingStub extends org.apache.axis.client.Stub implements FundcenterWsd.FundcenterVi {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchApprovalStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusQuery"), fundcenter.beans.ws.mdm.sap.com.ApprovalStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusResultSet"));
        oper.setReturnClass(fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchClient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientQuery"), fundcenter.beans.ws.mdm.sap.com.ClientQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientResultSet"));
        oper.setReturnClass(fundcenter.beans.ws.mdm.sap.com.ClientResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchDistributionStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusQuery"), fundcenter.beans.ws.mdm.sap.com.DistributionStatusQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusResultSet"));
        oper.setReturnClass(fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFundcenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "fundcenter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ArrayOfFundcenterCreate"), fundcenter.beans.ws.mdm.sap.com.FundcenterCreate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterCreate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters"), beans.ws.mdm.sap.com.CreateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateFundcenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "Fundcenter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ArrayOfFundcenterUpdate"), fundcenter.beans.ws.mdm.sap.com.FundcenterUpdate[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterUpdate"));
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "configurationParameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters"), beans.ws.mdm.sap.com.UpdateConfigurationParameters.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus"));
        oper.setReturnClass(beans.ws.mdm.sap.com.ExecutionStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchFundcenter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterQuery"), fundcenter.beans.ws.mdm.sap.com.FundcenterQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterResultSet"));
        oper.setReturnClass(fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationQuery"), fundcenter.beans.ws.mdm.sap.com.OperationQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationResultSet"));
        oper.setReturnClass(fundcenter.beans.ws.mdm.sap.com.OperationResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchServiceRelationships");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsQuery"), fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:FundcenterVi", "reposInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation"), beans.core.mdm.sap.com.RepositoryInformation.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsResultSet"));
        oper.setReturnClass(fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:FundcenterVi", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public Fundcenter_FundcenterBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public Fundcenter_FundcenterBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public Fundcenter_FundcenterBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.core.base", "AbstractDataObject");
            cachedSerQNames.add(qName);
            cls = base.core.mdm.sap.com.AbstractDataObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.core.base", "AbstractMdmDataObject");
            cachedSerQNames.add(qName);
            cls = base.core.mdm.sap.com.AbstractMdmDataObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.core.beans", "RepositoryInformation");
            cachedSerQNames.add(qName);
            cls = beans.core.mdm.sap.com.RepositoryInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatus");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusCreate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusCriteria");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusID");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusLookup");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusQuery");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusResultSet");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ApprovalStatusUpdate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ApprovalStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ArrayOfFundcenterCreate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterCreate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterCreate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterCreate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ArrayOfFundcenterUpdate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterUpdate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterUpdate");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterUpdate");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "Client");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.Client.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientCreate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientCriteria");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientDisplayFields");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientID");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientLookup");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientQuery");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientResultSet");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ClientUpdate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ClientUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatus");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusCreate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusCriteria");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusID");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusLookup");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusQuery");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusResultSet");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "DistributionStatusUpdate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.DistributionStatusUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "Fundcenter");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.Fundcenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterCreate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterCriteria");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterID");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterQuery");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterResultSet");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "FundcenterUpdate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.FundcenterUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "Operation");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.Operation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationCreate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationCriteria");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationDisplayFields");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationDisplayFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationID");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationLookup");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationQuery");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationResultSet");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "OperationUpdate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.OperationUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationships");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationships.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsCreate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsCriteria");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsID");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsID.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsQuery");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsResultSet");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsTupleTuple");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsTupleTuple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsUniqueConstraint1");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsUniqueConstraint2");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsUniqueConstraint2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans.fundcenter", "ServiceRelationshipsUpdate");
            cachedSerQNames.add(qName);
            cls = fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ArrayOfExecutionStatus");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ExecutionStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus");
            qName2 = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BasicRecordIdentification");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.BasicRecordIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.BooleanConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "BooleanCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.BooleanCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "CreateConfigurationParameters");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.CreateConfigurationParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.DateTimeConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "DateTimeCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.DateTimeCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ExecutionStatus");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ExecutionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "Fault");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.Fault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "FieldDefinition");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.FieldDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMapping");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.KeyMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeyMappingConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.KeyMappingConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "KeywordConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.KeywordConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "MultilingualText");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.MultilingualText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.PicklistConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "PicklistCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.PicklistCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "RecordIdentifierConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.RecordIdentifierConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ResultDefinition");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ResultDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "ResultSetBase");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.ResultSetBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortDefinition");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.SortDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "SortField");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.SortField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextConstraint");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.TextConstraint.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "TextCriteria");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.TextCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:com.sap.mdm.ws.beans", "UpdateConfigurationParameters");
            cachedSerQNames.add(qName);
            cls = beans.ws.mdm.sap.com.UpdateConfigurationParameters.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet searchApprovalStatus(fundcenter.beans.ws.mdm.sap.com.ApprovalStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "searchApprovalStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, fundcenter.beans.ws.mdm.sap.com.ApprovalStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fundcenter.beans.ws.mdm.sap.com.ClientResultSet searchClient(fundcenter.beans.ws.mdm.sap.com.ClientQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "searchClient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fundcenter.beans.ws.mdm.sap.com.ClientResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (fundcenter.beans.ws.mdm.sap.com.ClientResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, fundcenter.beans.ws.mdm.sap.com.ClientResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet searchDistributionStatus(fundcenter.beans.ws.mdm.sap.com.DistributionStatusQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "searchDistributionStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, fundcenter.beans.ws.mdm.sap.com.DistributionStatusResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] createFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterCreate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.CreateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "createFundcenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fundcenter, reposInfo, configurationParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, beans.ws.mdm.sap.com.ExecutionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public beans.ws.mdm.sap.com.ExecutionStatus[] updateFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterUpdate[] fundcenter, beans.core.mdm.sap.com.RepositoryInformation reposInfo, beans.ws.mdm.sap.com.UpdateConfigurationParameters configurationParameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "updateFundcenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fundcenter, reposInfo, configurationParameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (beans.ws.mdm.sap.com.ExecutionStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, beans.ws.mdm.sap.com.ExecutionStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet searchFundcenter(fundcenter.beans.ws.mdm.sap.com.FundcenterQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "searchFundcenter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, fundcenter.beans.ws.mdm.sap.com.FundcenterResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fundcenter.beans.ws.mdm.sap.com.OperationResultSet searchOperation(fundcenter.beans.ws.mdm.sap.com.OperationQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "searchOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fundcenter.beans.ws.mdm.sap.com.OperationResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (fundcenter.beans.ws.mdm.sap.com.OperationResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, fundcenter.beans.ws.mdm.sap.com.OperationResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet searchServiceRelationships(fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsQuery query, beans.core.mdm.sap.com.RepositoryInformation reposInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FundcenterVi", "searchServiceRelationships"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {query, reposInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet) org.apache.axis.utils.JavaUtils.convert(_resp, fundcenter.beans.ws.mdm.sap.com.ServiceRelationshipsResultSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
