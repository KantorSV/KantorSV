package com.app;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {

        Endpoint.publish("http://127.0.0.1:8085/car", new CarService());
        System.out.println("SERVER STARTED");

    }
}
