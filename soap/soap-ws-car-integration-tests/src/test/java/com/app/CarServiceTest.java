package com.app;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CarServiceTest {

    @Test
    public void test() {

        CarServiceService carServiceService = new CarServiceService();
        CarService carService = carServiceService.getCarServicePort();

        carService.removeAll();

        int count = carService.count();
        assertTrue(count == 0);

        carService.create("BMW", 2025, 200500);
        count = carService.count();
        assertTrue(count == 1);

        Car car = carService.get(0);
        assertTrue("BMW".equals(car.getName()));
        assertTrue(2025 == car.getAge());
        assertTrue(200500 == car.getPrice());

        carService.create("AUDI", 2037, 128000);
        count = carService.count();
        assertTrue(count == 2);

        car = carService.get(1);
        assertTrue("AUDI".equals(car.getName()));
        assertTrue(2037 == car.getAge());
        assertTrue(128000 == car.getPrice());

        List<Car> carList = carService.getAll();
        assertTrue(carList.size() == 2);

        car = carList.get(0);
        assertTrue("BMW".equals(car.getName()));
        assertTrue(2025 == car.getAge());
        assertTrue(200500 == car.getPrice());

        car = carList.get(1);
        assertTrue("AUDI".equals(car.getName()));
        assertTrue(2037 == car.getAge());
        assertTrue(128000 == car.getPrice());

        carService.remove(0);
        count = carService.count();
        assertTrue(count == 1);
    }

}
