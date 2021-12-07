package calculatorEngine;

public class MyCalculatorImpl implements MyCalculator{
    @Override
    public double add(double a, double b) { return a + b; }

    @Override
    public double subtract(double a, double b) { return a - b; }

    @Override
    public double product(double a, double b) { return a * b; }

    @Override
    public double divide(double a, double b) { return a / b; }
}
