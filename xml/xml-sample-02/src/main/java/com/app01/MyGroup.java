package com.app01;

import java.util.ArrayList;
import java.util.List;

public class MyGroup {

    private String name;
    private int year;
    private int count;
    private List<Students> students = new ArrayList<>();

    public MyGroup(String name, int year, int count, List<Students> students) {
        this.name = name;
        this.year = year;
        this.count = count;
        this.students = students;
    }

    public MyGroup(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "MyGroup{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", count=" + count +
                ", students \n" + printStudentsList() +
                '}';
    }

    private String printStudentsList(){
        String result = "";
        List<Students> studentsList = getStudents();;
        for (int i = 0;i < studentsList.size();i++) {
            Students students = studentsList.get(i);
            result=result+students+"\n";
        }
        return result;
    }
}
