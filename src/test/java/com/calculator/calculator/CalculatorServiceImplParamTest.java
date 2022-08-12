package com.calculator.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParamTest {

    private CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("calculatorParam")
    public void sumCalculatorParamTest(double a, double b){
        double result = calculatorService.sumCalculator(a,b);
        Assertions.assertEquals(a+b, result);
    }

    @ParameterizedTest
    @MethodSource("calculatorParam")
    public void minusCalculatorParamTest(double a, double b){
        double result = calculatorService.minusCalculator(a,b);
        Assertions.assertEquals(a-b, result);
    }

    @ParameterizedTest
    @MethodSource("calculatorParam")
    public void multiplyCalculatorParamTest(double a, double b){
        double result = calculatorService.multiplyCalculator(a,b);
        Assertions.assertEquals(a*b, result);
    }

    @ParameterizedTest
    @MethodSource("calculatorParam")
    public void divideCalculatorParamTest(double a, double b){
        double result = calculatorService.divideCalculator(a,b);
        Assertions.assertEquals(a/b, result);
    }
    private static Stream<Arguments> calculatorParam() {
        return Stream.of(
                Arguments.of(2.0, 3.0),
                Arguments.of(1.0, 5.0),
                Arguments.of(6.0, 3.0),
                Arguments.of(2.0, 3.0));
    }
}
