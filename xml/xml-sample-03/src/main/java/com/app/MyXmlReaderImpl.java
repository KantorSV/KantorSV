package com.app;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class MyXmlReaderImpl implements MyXmlReader{


    @Override
    public MyClass parseXml(File fileXml) {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = saxParserFactory.newSAXParser();
            MyDefaultHandler myDefaultHandler = new MyDefaultHandler();
            parser.parse(fileXml, myDefaultHandler);
            return myDefaultHandler.getMyClass();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
