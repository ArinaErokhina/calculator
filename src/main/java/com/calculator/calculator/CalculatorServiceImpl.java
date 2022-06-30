package com.calculator.calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор.";
    }

    public double sumCalculator(double number1, double number2) {
        double sum = 0;
        sum = number1 + number2;
        return sum;
    }

    public double minusCalculator(double number1, double number2) {
        double minus = 0;
        minus = number1 - number2;
        return minus;
    }

    public double multiplyCalculator(double number1, double number2) {
        double multiply = 0;
        multiply = number1 * number2;
        return multiply;
    }

    public double divideCalculator(double number1, double number2) {
        double divide = 0;
        divide = number1 / number2;
        return divide;
    }

}
