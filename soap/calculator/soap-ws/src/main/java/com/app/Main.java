package com.app;

import javax.xml.ws.Endpoint;

public class Main {

    //http://127.0.0.1:8083/calculator?wsdl
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Endpoint.publish("http://127.0.0.1:8083/calculator", myCalculator);
        System.out.println("SERVER STARTED");
    }

}
