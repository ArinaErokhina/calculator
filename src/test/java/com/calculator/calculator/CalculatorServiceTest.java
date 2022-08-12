package com.calculator.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorServiceTest {
    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void sumCalculatorTest(){
        Assertions.assertEquals(10.0, calculatorService.sumCalculator(5.0,5.0));
        Assertions.assertEquals(5, calculatorService.sumCalculator(2.5,2.5));
    }

    @Test
    public void minusCalculatorTest(){
        Assertions.assertEquals(6.0, calculatorService.minusCalculator(12.0,6.0));
        Assertions.assertEquals(5.0, calculatorService.minusCalculator(10.0,5.0));
    }

    @Test
    public void multiplyCalculatorTest(){
        Assertions.assertEquals(14.0, calculatorService.multiplyCalculator(7.0, 2.0));
        Assertions.assertEquals(9, calculatorService.multiplyCalculator(3.0,3.0));
    }

    @Test
    public void divideCalculatorTest(){
        Assertions.assertEquals(2, calculatorService.divideCalculator(8.0,4.0));
        Assertions.assertThrows(CannotBeDividedByZeroException.class,() -> calculatorService.divideCalculator(2.0, 0.0));
    }



}
