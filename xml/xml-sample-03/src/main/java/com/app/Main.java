package com.app;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        String filePath = Main.class.getResource("/Class.xml").getFile();
        File xmlFile = new File(filePath);
        MyXmlReader myXmlReader = new MyXmlReaderImpl();
        MyClass myClass = myXmlReader.parseXml(xmlFile);
        System.out.println(myClass);
        System.out.println("_____________________________");


    }
}
