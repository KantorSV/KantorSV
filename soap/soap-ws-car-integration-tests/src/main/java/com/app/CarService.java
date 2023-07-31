
package com.app;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CarService", targetNamespace = "http://app.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CarService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "remove", targetNamespace = "http://app.com/", className = "com.app.Remove")
    @ResponseWrapper(localName = "removeResponse", targetNamespace = "http://app.com/", className = "com.app.RemoveResponse")
    @Action(input = "http://app.com/CarService/removeRequest", output = "http://app.com/CarService/removeResponse")
    public void remove(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.app.Car
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "get", targetNamespace = "http://app.com/", className = "com.app.Get")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "http://app.com/", className = "com.app.GetResponse")
    @Action(input = "http://app.com/CarService/getRequest", output = "http://app.com/CarService/getResponse")
    public Car get(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "count", targetNamespace = "http://app.com/", className = "com.app.Count")
    @ResponseWrapper(localName = "countResponse", targetNamespace = "http://app.com/", className = "com.app.CountResponse")
    @Action(input = "http://app.com/CarService/countRequest", output = "http://app.com/CarService/countResponse")
    public int count();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "create", targetNamespace = "http://app.com/", className = "com.app.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://app.com/", className = "com.app.CreateResponse")
    @Action(input = "http://app.com/CarService/createRequest", output = "http://app.com/CarService/createResponse")
    public void create(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "removeAll", targetNamespace = "http://app.com/", className = "com.app.RemoveAll")
    @ResponseWrapper(localName = "removeAllResponse", targetNamespace = "http://app.com/", className = "com.app.RemoveAllResponse")
    @Action(input = "http://app.com/CarService/removeAllRequest", output = "http://app.com/CarService/removeAllResponse")
    public void removeAll();

    /**
     * 
     * @return
     *     returns java.util.List<com.app.Car>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://app.com/", className = "com.app.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://app.com/", className = "com.app.GetAllResponse")
    @Action(input = "http://app.com/CarService/getAllRequest", output = "http://app.com/CarService/getAllResponse")
    public List<Car> getAll();

}