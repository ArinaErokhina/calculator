package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String welcomeCalculator() {
        return calculatorService.welcomeCalculator();
    }

    @GetMapping(path = "/plus")
    public String sumCalculator(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else {
            return number1 + "+" + number2 + "=" + calculatorService.sumCalculator(number1, number2);
        }
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else {
            return number1 + "-" + number2 + "=" + calculatorService.minusCalculator(number1, number2);
        }
    }

    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else {
            return number1 + "*" + number2 + "=" + calculatorService.multiplyCalculator(number1, number2);
        }
    }

    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam("num1") Double number1, @RequestParam("num2") Double number2) {
        if (number1 == null || number2 == null) {
            return "Введите число";
        } else {
            return number1 + ":" + number2 + "=" + calculatorService.divideCalculator(number1, number2);
        }
    }
}
