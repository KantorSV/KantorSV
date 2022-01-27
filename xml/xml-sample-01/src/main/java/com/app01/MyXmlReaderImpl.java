package com.app01;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.List;

public class MyXmlReaderImpl implements MyXmlReader {


    @Override
    public List<Training> parseXml(File xmlFile) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = saxParserFactory.newSAXParser();
            MyDefaultHandler myDefaultHandler = new MyDefaultHandler();
            parser.parse(xmlFile, myDefaultHandler);
            return  myDefaultHandler.getTrainingList();
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
}
