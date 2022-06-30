package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String sumCalculator(@RequestParam(required = false, name = "num1") double number1, @RequestParam(required = false, name = "num2") double number2) {
        return number1 + "+" + number2 + "=" + calculatorService.sumCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam(required = false, name = "num1") double number1, @RequestParam(required = false, name = "num2") double number2) {
        return number1 + "-" + number2 + "=" + calculatorService.minusCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam(required = false, name = "num1") double number1, @RequestParam(required = false, name = "num2") double number2) {
        return number1 + "*" + number2 + "=" + calculatorService.multiplyCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam(required = false, name = "num1") double number1, @RequestParam(required = false, name = "num2") double number2) {
        if (number1 == 0 || number2 == 0) {
            return "На ноль делить нельзя";
        } else {
            return number1 + ":" + number2 + "=" + calculatorService.divideCalculator(number1, number2);
        }
    }
}
