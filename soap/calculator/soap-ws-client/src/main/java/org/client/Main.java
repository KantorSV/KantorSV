package org.client;

import com.app.MyCalculator;
import com.app.MyCalculatorService;

public class Main {

    public static void main(String[] args) {
        MyCalculatorService myCalculatorService = new MyCalculatorService();
        MyCalculator myCalculator = myCalculatorService.getMyCalculatorPort();

        int res = myCalculator.add(10,22);
        System.out.println("res="+res);

    }

}
