package com.app;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:8083/person", new PersonService());
        System.out.println("SERVER STARTED");
    }

}
