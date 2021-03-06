package com.app01;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class MyXmlReaderImpl implements MyXmlReader{

    @Override
    public MyGroup parseXml(File xmlFile) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = saxParserFactory.newSAXParser();
            MyDefaultHandler myDefaultHandler = new MyDefaultHandler();
            parser.parse(xmlFile, myDefaultHandler);
            return  myDefaultHandler.getMyGroup();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
