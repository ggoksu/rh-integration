package org.example.s2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-000243-redhat-1
 * 2020-09-04T15:03:10.051+03:00
 * Generated source version: 3.1.11.fuse-000243-redhat-1
 * 
 */
@WebService(targetNamespace = "http://www.example.org/s2/", name = "s2")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface S2 {

    @WebMethod(operationName = "S2Operation", action = "http://www.example.org/s2/S2Operation")
    @WebResult(name = "FulfillmentResponse", targetNamespace = "http://www.example.org/s2/", partName = "parameters")
    public FulfillmentResponse s2Operation(
        @WebParam(partName = "parameters", name = "FulfillmentRequest", targetNamespace = "http://www.example.org/s2/")
        FulfillmentRequest parameters
    );
}
