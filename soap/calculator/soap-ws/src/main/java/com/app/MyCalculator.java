package com.app;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyCalculator {

    @WebMethod
    public int add(int a, int b){
        System.out.println("add(); a="+a+"; b="+b);
        return a+b;
    }

}
