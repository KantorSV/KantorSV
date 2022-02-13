package com.app;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MyCalculator {

    @WebMethod
    public int add(int a, int b) {

        System.out.println("a + b");
        return a+b;
    }

    @WebMethod
    public int subtract(int a, int b) {

        System.out.println("a - b");
        return a-b;
    }

    @WebMethod
    public int product(int a, int b) {

        System.out.println("a * b");
        return a*b;
    }

    @WebMethod
    public int divide(int a, int b) {

        System.out.println("a / b");
        return a/b;
    }

}
