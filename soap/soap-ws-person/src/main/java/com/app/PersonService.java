package com.app;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;


@WebService
public class PersonService {

    private List<Person> personList = new ArrayList();

    @WebMethod
    public void create(@WebParam(name = "name") String name, @WebParam(name = "age") int age){
        System.out.println("Create person name="+name+"; age="+age);
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        personList.add(person);
    }

    @WebMethod
    public Person get(int index){
        return personList.get(index);
    }

    @WebMethod
    public List<Person> getAll(){
        return personList;
    }

    @WebMethod
    public int count(){
        return personList.size();
    }


    @WebMethod
    public void remove(int index){
        personList.remove(index);
    }

    @WebMethod
    public void removeAll(){
        personList.clear();
    }

}
