package org;

import com.app.MyCalculator;
import com.app.MyCalculatorService;

public class Main {


    public static void main(String[] args) {

        MyCalculatorService myCalculatorService = new MyCalculatorService();
        MyCalculator myCalculator = myCalculatorService.getMyCalculatorPort();

        int sum = myCalculator.add(10,10);
        System.out.println("sum = " + sum + " \"+\"");

        int divide = myCalculator.divide(10,10);
        System.out.println("divide = " + divide + " \"/\"");

        int subtract = myCalculator.subtract(10,10);
        System.out.println("subtract = " + subtract + " \"-\"");

        int product = myCalculator.product(10,10);
        System.out.println("product = " + product + " \"*\"");
    }
}
