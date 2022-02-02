package com.app02;

import com.app01.MyXmlReader;
import com.app01.Training;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

      //  System.out.println("Book: \"Tom Soer\"");

        List<Training> trainingList = initTrainings(20);
        MyXmlWriter myXmlWriter = new MyXmlWriterImpl();
        String xml = myXmlWriter.createXml(trainingList);
        System.out.println(xml);
    }



    private static List<Training> initTrainings(int n){
        List<Training> trainingList = new ArrayList<>();
        for(int i=0;i<n;i++){
            Training training = new Training();
            training.setName("Name"+i);
            training.setId(i);
            training.setType("Type"+i);
            trainingList.add(training);
        }
        return trainingList;
    }

}
