package com.app;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

public class MyDefaultHandler extends DefaultHandler {

    private MyClass myClass;
    private String lastTagName;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("START PARSING");
        myClass = new MyClass();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("START" + qName);
        lastTagName = qName;
        if ("Students".equals(qName)) {
            Students students = new Students();

            String id = attributes.getValue("id");
            int Id = Integer.parseInt(id);
            System.out.println("id = " + Id);
            students.setId(Id);

        }
        else if ("Class".equals(qName)) {
            String name = attributes.getValue("name");
            myClass.setName(name);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if ("name".equals(lastTagName)) {
            if (!value.trim().equals("")) {
                System.out.println("value" + value);
                Students students = new Students();
                students.setName(value);
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("END" + qName);
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("FINISH PARSING");
    }

    public MyClass getMyClass() {
        return myClass;
    }
}
