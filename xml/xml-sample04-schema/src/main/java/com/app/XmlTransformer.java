package com.app;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;

public class XmlTransformer {

    public void createXml(Cars cars){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.marshal(cars, new FileOutputStream("cars.xml"));
        } catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }


    public Cars createCars(String xml){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Cars.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Cars) unmarshaller.unmarshal(new File(xml));
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }

    }

}
