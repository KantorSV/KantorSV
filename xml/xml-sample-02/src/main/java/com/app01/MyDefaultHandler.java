package com.app01;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

public class MyDefaultHandler extends DefaultHandler {

    private MyGroup myGroup;
    private String lastTagName;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("START PARSING");
        myGroup = new MyGroup();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("start" + qName);
        lastTagName = qName;
        if("student".equals(qName)) {
            Students students = new Students();

            String Id = attributes.getValue("id");
            int id = Integer.parseInt(Id);
            System.out.println("id" + id);
            students.setId(id);

            myGroup.getStudents().add(students);
        }
        else if ("Group".equals(qName)) {
            String name = attributes.getValue("name");
            myGroup.setName(name);

            String year = attributes.getValue("year");
            int Year = Integer.parseInt(year);
            myGroup.setYear(Year);

            String count = attributes.getValue("count");
            int Count = Integer.parseInt(count);
            myGroup.setCount(Count);

        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if ("name".equals(lastTagName)) {
            if (!value.trim().equals("")) {
                System.out.println("value" + value);
                int size = myGroup.getStudents().size();
                // System.out.println("size="+size);
                Students students = myGroup.getStudents().get(size - 1);
                students.setName(value);
            }
        } else if ("age".equals(lastTagName)) {
            if (!value.trim().equals("")) {
                int age = Integer.parseInt(value);
                int size = myGroup.getStudents().size();
                Students students = myGroup.getStudents().get(size - 1);
                students.setAge(age);
            }
        } else if ("iq".equals(lastTagName)) {
            if (!value.trim().equals("")) {
                int iq = Integer.parseInt(value);
                int size = myGroup.getStudents().size();
                Students students = myGroup.getStudents().get(size - 1);
                students.setIq(iq);
            }
        }
    }

    @Override
    public void endElement (String uri, String localName, String qName) throws SAXException {
        System.out.println("end" + qName);
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("FINISH PARSING");
    }

    public List<Students> getStudentsList() {
        return myGroup.getStudents();
    }

    public MyGroup getMyGroup() {
        return myGroup;
    }
}
