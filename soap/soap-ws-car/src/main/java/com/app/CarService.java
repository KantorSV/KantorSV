package com.app;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CarService {

    private List<Car> carList = new ArrayList<>();

    @WebMethod
    public void create(String name, int age, int price) {

        System.out.println("name = " + name +"\nage = " + age + "\nprice = " + price);
        Car car = new Car();
        car.setName(name);
        car.setAge(age);
        car.setPrice(price);
        carList.add(car);
    }

    @WebMethod
    public Car get(int index) { return carList.get(index); }

    @WebMethod
    public List<Car> getAll() {return carList; }

    @WebMethod
    public int count() {return carList.size(); }

    @WebMethod
    public void remove(int index) {carList.remove(index); }

    @WebMethod
    public void removeAll() {carList.clear(); }

}
