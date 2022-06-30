package com.calculator.calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор.";
    }

    public String sumCalculator(double number1, double number2) {
        double sum = 0;
        sum = number1 + number2;
        return number1 + "+" + number2 + "=" + sum;
    }

    public String minusCalculator(double number1, double number2) {
        double minus = 0;
        minus = number1 - number2;
        return number1 + "-" + number2 + "=" + minus;
    }

    public String multiplyCalculator(double number1, double number2) {
        double multiply = 0;
        multiply = number1 * number2;
        return number1 + "*" + number2 + "=" + multiply;
    }

    public String divideCalculator(double number1, double number2) {
        double divide = 0;
        if (number1 == 0 || number2 == 0) {
            return "На 0 делить нельзя";
        } else {
            divide = number1 / number2;
            return number1 + ":" + number2 + "=" + divide;
        }
    }

}
