package com.app01;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyDefaultHandler extends DefaultHandler {

    private List<Training> trainingList;
    private String lastTagName;


    @Override
    public void startDocument() throws SAXException {
        System.out.println("START PARSING");
        trainingList = new ArrayList<>();
    }


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("start "+qName);
        lastTagName = qName;

        if("training".equals(qName)) {
            Training training = new Training();


            String idValue = attributes.getValue("id");
            if (idValue != null) {
                int id = Integer.parseInt(idValue);
                System.out.println("id=" + id);
                training.setId(id);
            }
            String type = attributes.getValue("type");
            System.out.println("type=" + type);
            training.setType(type);

            trainingList.add(training);

        }
    }


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length);
        if("name".equals(lastTagName)) {
            if (!value.trim().equals("")) {
                System.out.println("value=" + value);
                int size = trainingList.size();
                Training training = trainingList.get(size-1);
                training.setName(value);
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("end "+qName);
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("FINISH PARSING");
    }

    public List<Training> getTrainingList() {
        return trainingList;
    }
}
