package com.calculator.calculator;


import org.springframework.stereotype.Service;


@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcomeCalculator() {
        return "Добро пожаловать в калькулятор.";
    }

    public double sumCalculator(Double number1, Double number2) {
        return number1 + number2;
    }

    public double minusCalculator(Double number1, Double number2) {
        return number1 - number2;
    }

    public double multiplyCalculator(Double number1, Double number2) {
        return number1 * number2;
    }

    public double divideCalculator(Double number1, Double number2) {
        if (number2 == 0) {
            throw new CannotBeDividedByZeroException();
        }
        return number1 / number2;
    }

}
