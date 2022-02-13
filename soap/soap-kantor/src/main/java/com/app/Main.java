package com.app;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        MyCalculator myCalculator = new MyCalculator();
        Endpoint.publish("http://127.0.0.1:8085/Kantor", myCalculator);
        System.out.println("SERVER START");
    }


}
