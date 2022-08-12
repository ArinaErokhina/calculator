package com.calculator.calculator;

import org.springframework.stereotype.Component;


public interface CalculatorService {
    String welcomeCalculator();
    double sumCalculator(Double number1, Double number2);

    double minusCalculator(Double number1, Double number2);

    double multiplyCalculator(Double number1, Double number2);

    double divideCalculator(Double number1, Double number2);
}
