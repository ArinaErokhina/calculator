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
        return calculatorService.sumCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam(required = false, name = "num1") double number1, @RequestParam(required = false, name = "num2") double number2) {
        return calculatorService.minusCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam(required = false, name = "num1") double number1, @RequestParam(required = false, name = "num2") double number2) {
        return calculatorService.multiplyCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam(required = false, name = "num1") double number1, @RequestParam(required = false, name = "num2") double number2) {
        return calculatorService.divideCalculator(number1, number2);
    }
}
