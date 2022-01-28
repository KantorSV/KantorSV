package com.app;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = Main.class.getResource("/group.xml").getFile();
        File xmlFile = new File(filePath);

        MyXmlReader myXmlReader = new MyXmlReaderImpl();
        MyGroup myGroup = myXmlReader.parseXml(xmlFile);
        System.out.println(myGroup);


       /* System.out.println("-------------------------");
        List<Students> studentsList = myGroup.getStudents();;
       for (int i = 0;i < studentsList.size();i++) {
            Students students = studentsList.get(i);
            System.out.println(students);
        }*/
    }



}
