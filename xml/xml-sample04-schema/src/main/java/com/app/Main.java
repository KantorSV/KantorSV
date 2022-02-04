package com.app;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cars cars = initCars(3);
        XmlTransformer xmlTransformer = new XmlTransformer();
        xmlTransformer.createXml(cars);
        Cars resultCar = xmlTransformer.createCars("cars.xml");
        System.out.println(resultCar);
    }


    private static Cars initCars(int n){
        Cars cars = new Cars();
        cars.setCity("Kyiv");

        List<Car> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            Car car = new Car();
            car.setName("Name"+i);
            car.setColor("Color"+i);
            car.setPrice(i);
            list.add(car);
        }
        cars.setCars(list);
        return cars;
    }

}
