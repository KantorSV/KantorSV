package com.app02;

import com.app01.Students;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Students> studentsList = initStudents(5);
        MyXmlWriter myXmlWriter = new MyXmlWriterImpl();
        String xml = myXmlWriter.createXml(studentsList);
        System.out.println(xml);

    }

    private static List<Students> initStudents(int n) {

        List<Students> studentsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Students students = new Students();
            students.setId(i);
            students.setName("" + i);
            students.setAge(i);
            students.setIq(i);
            studentsList.add(students);
        }
        return studentsList;
    }
}
