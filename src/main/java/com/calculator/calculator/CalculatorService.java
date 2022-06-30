package com.calculator.calculator;

public interface CalculatorService {
    String welcomeCalculator();

    public String sumCalculator(double number1, double number2);

    String minusCalculator(double number1, double number2);

    String multiplyCalculator(double number1, double number2);

    String divideCalculator(double number1, double number2);
}
