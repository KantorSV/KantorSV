package com.app02;

import com.app01.Students;

import java.util.List;

public class MyXmlWriterImpl implements MyXmlWriter{


    @Override
    public String createXml(List<Students> studentsList) {


        StringBuilder sb = new StringBuilder();
        sb.append("<Group name = \"A\" year = \"2004\" count \"5\">\n");
        for (int i = 0;i < studentsList.size();i++) {
            Students students = studentsList.get(i);

            int id = students.getId();
            String openTag = String.format("\t<student id = \"%s\">\n", id);
            sb.append(openTag);

            String name = students.getName();
            String Name = String.format("\t\t<name>%s</name>\n", name);
            sb.append(Name);

            int age = students.getAge();
            String Age = String.format("\t\t<age>%s</age>\n", age);
            sb.append(Age);

            int iq = students.getIq();
            String Iq = String.format("\t\t<iq>%s</iq>\n", iq);
            sb.append(Iq);

            sb.append("\t</student>\n");
        }
        sb.append("</Group>");

        return sb.toString();
    }

}
