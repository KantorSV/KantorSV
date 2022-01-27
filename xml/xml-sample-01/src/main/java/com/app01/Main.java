package com.app01;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            String filePath = Main.class.getResource("/sample01.xml").getFile();
            //System.out.println("filePath="+filePath);
            File xmlFile = new File(filePath);
            //System.out.println("xmlFile="+xmlFile);

            MyXmlReader myXmlReader = new MyXmlReaderImpl();
            List<Training> trainingList = myXmlReader.parseXml(xmlFile);
        System.out.println("--------------------------------------------");
            for(int i=0;i<trainingList.size();i++){
                Training training = trainingList.get(i);
                System.out.println(training);
            }


    }


}
