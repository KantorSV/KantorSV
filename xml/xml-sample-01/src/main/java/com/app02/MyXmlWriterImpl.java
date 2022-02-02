package com.app02;

import com.app01.Training;

import java.util.List;


/*<training id="1" type="A">

<name>Monday</name>
</training>*/

public class MyXmlWriterImpl implements  MyXmlWriter {

    @Override
    public String createXml(List<Training> trainingList) {
        StringBuilder sb = new StringBuilder();
        sb.append("<trainings>");
        for(int i=0;i<trainingList.size();i++){
            Training training = trainingList.get(i);
            int id = training.getId();
            String type = training.getType();

            String openTag = String.format("<training id=\"%s\" type=\"%s\">", id, type);
            sb.append(openTag);

            String name = training.getName();
            //sb.append("<name>"+name+"</name>");
            sb.append("<name>");
            sb.append(name);
            sb.append("</name>");

            sb.append("</training>");
        }

        sb.append("</trainings>");
        return sb.toString();
    }
}
