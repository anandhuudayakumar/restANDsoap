package model.common.serviceinterface;

import commonj.sdo.DataObject;

import java.math.BigDecimal;

import java.sql.Timestamp;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;

import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import model.common.OpportunitiesVOSDO;

import oracle.jbo.common.service.types.FindControl;
import oracle.jbo.common.service.types.FindCriteria;
import oracle.jbo.common.service.types.ObjAttrHints;
import oracle.jbo.common.service.types.ProcessControl;
import oracle.jbo.common.service.types.ProcessData;
import oracle.jbo.common.service.types.ServiceViewInfo;
import oracle.jbo.service.errors.ServiceException;

import oracle.webservices.annotations.PortableWebService;
import oracle.webservices.annotations.SDODatabinding;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 25 14:32:40 IST 2019
// ---------------------------------------------------------------------
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.WRAPPED, style = SOAPBinding.Style.DOCUMENT)
@PortableWebService(targetNamespace = "/model/common/", name = "AppModuleService",
                    wsdlLocation = "model/common/serviceinterface/AppModuleService.wsdl")
@SDODatabinding(schemaLocation = "model/common/serviceinterface/AppModuleService.xsd")
public interface AppModuleService {


    public static final String NAME = "{/model/common/}AppModuleService";

    @WebMethod(action = "/model/common/createOpportunitiesVO1", operationName = "createOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "createOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "createOpportunitiesVO1Response")
    @WebResult(name = "result")
    OpportunitiesVOSDO createOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "opportunitiesVO1")
                                              OpportunitiesVOSDO opportunitiesVO1) throws ServiceException;

    @WebMethod(action = "/model/common/updateOpportunitiesVO1", operationName = "updateOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "updateOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "updateOpportunitiesVO1Response")
    @WebResult(name = "result")
    OpportunitiesVOSDO updateOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "opportunitiesVO1")
                                              OpportunitiesVOSDO opportunitiesVO1) throws ServiceException;

    @WebMethod(action = "/model/common/deleteOpportunitiesVO1", operationName = "deleteOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "deleteOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "deleteOpportunitiesVO1Response")
    void deleteOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "opportunitiesVO1")
                                OpportunitiesVOSDO opportunitiesVO1) throws ServiceException;

    @WebMethod(action = "/model/common/findOpportunitiesVO1", operationName = "findOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "findOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "findOpportunitiesVO1Response")
    @WebResult(name = "result")
    List<OpportunitiesVOSDO> findOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "findCriteria")
                                                  FindCriteria findCriteria,
                                                  @WebParam(mode = WebParam.Mode.IN, name = "findControl")
                                                  FindControl findControl) throws ServiceException;

    @WebMethod(action = "/model/common/getDfltObjAttrHints", operationName = "getDfltObjAttrHints")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "getDfltObjAttrHints")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "getDfltObjAttrHintsResponse")
    @WebResult(name = "result")
    ObjAttrHints getDfltObjAttrHints(@WebParam(mode = WebParam.Mode.IN, name = "viewName") String viewName,
                                     @WebParam(mode = WebParam.Mode.IN, name = "localeName")
                                     String localeName) throws ServiceException;

    @WebMethod(action = "/model/common/getServiceLastUpdateTime", operationName = "getServiceLastUpdateTime")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "getServiceLastUpdateTime")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "getServiceLastUpdateTimeResponse")
    @WebResult(name = "result")
    Timestamp getServiceLastUpdateTime() throws ServiceException;

    @WebMethod(action = "/model/common/getEntityList", operationName = "getEntityList")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "getEntityList")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "getEntityListResponse")
    @WebResult(name = "result")
    List<ServiceViewInfo> getEntityList() throws ServiceException;

    @WebMethod(action = "/model/common/invokeObjectFunction", operationName = "invokeObjectFunction")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "invokeObjectFunction")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "invokeObjectFunctionResponse")
    @WebResult(name = "result")
    Object invokeObjectFunction(@WebParam(mode = WebParam.Mode.IN, name = "row") DataObject row,
                                @WebParam(mode = WebParam.Mode.IN, name = "viewName") String viewName,
                                @WebParam(mode = WebParam.Mode.IN, name = "scriptName") String scriptName,
                                @WebParam(mode = WebParam.Mode.IN, name = "params")
                                List<Object> params) throws ServiceException;

    @WebMethod(action = "/model/common/findOpportunitiesVO1Name", operationName = "findOpportunitiesVO1Name")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "findOpportunitiesVO1Name")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "findOpportunitiesVO1NameResponse")
    @WebResult(name = "result")
    List<OpportunitiesVOSDO> findOpportunitiesVO1Name(@WebParam(mode = WebParam.Mode.IN, name = "findCriteria")
                                                      FindCriteria findCriteria,
                                                      @WebParam(mode = WebParam.Mode.IN, name = "bindOppName")
                                                      String bindOppName,
                                                      @WebParam(mode = WebParam.Mode.IN, name = "findControl")
                                                      FindControl findControl) throws ServiceException;

    @WebMethod(action = "/model/common/getOpportunitiesVO1", operationName = "getOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "getOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "getOpportunitiesVO1Response")
    @WebResult(name = "result")
    OpportunitiesVOSDO getOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "oppId")
                                           BigDecimal oppId) throws ServiceException;

    @WebMethod(action = "/model/common/mergeOpportunitiesVO1", operationName = "mergeOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "mergeOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "mergeOpportunitiesVO1Response")
    @WebResult(name = "result")
    OpportunitiesVOSDO mergeOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "opportunitiesVO1")
                                             OpportunitiesVOSDO opportunitiesVO1) throws ServiceException;

    @WebMethod(action = "/model/common/processOpportunitiesVO1", operationName = "processOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "processOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "processOpportunitiesVO1Response")
    @WebResult(name = "result")
    List<OpportunitiesVOSDO> processOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "changeOperation")
                                                     String changeOperation,
                                                     @WebParam(mode = WebParam.Mode.IN, name = "opportunitiesVO1")
                                                     List<OpportunitiesVOSDO> opportunitiesVO1,
                                                     @WebParam(mode = WebParam.Mode.IN, name = "processControl")
                                                     ProcessControl processControl) throws ServiceException;

    @WebMethod(action = "/model/common/processCSOpportunitiesVO1", operationName = "processCSOpportunitiesVO1")
    @RequestWrapper(targetNamespace = "/model/common/types/", localName = "processCSOpportunitiesVO1")
    @ResponseWrapper(targetNamespace = "/model/common/types/", localName = "processCSOpportunitiesVO1Response")
    @WebResult(name = "result")
    ProcessData processCSOpportunitiesVO1(@WebParam(mode = WebParam.Mode.IN, name = "processData")
                                          ProcessData processData,
                                          @WebParam(mode = WebParam.Mode.IN, name = "processControl")
                                          ProcessControl processControl) throws ServiceException;
}

