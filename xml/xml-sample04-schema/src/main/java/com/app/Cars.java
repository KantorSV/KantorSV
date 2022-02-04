package com.app;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Cars {


    private List<Car> cars;
    private String city;

    @XmlAttribute
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlElement(name = "car")
    public List<Car> getCars() {
        return cars;
    }


    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "cars=" + cars +
                ", city='" + city + '\'' +
                '}';
    }
}
