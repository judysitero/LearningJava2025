package com.pluralsight.Week5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addTwoPositiveNumbers_expectPositiveResult() {
        // arrange
        Calculator calculator = new Calculator();

        // act
        double result = calculator.add(4, 4);

        // assert
        assertEquals(8.0, result);
    }

    @Test
    void subtractTwoPositiveNumbers_expectNoError() {
        //arrange
        Calculator calculator = new Calculator();

        //act
        double result = calculator.subtract(3,1);

        //assert
        assertEquals(2, result);
    }

    @Test
    void multiplyTwoPositiveNumbers_expectNoError() {
        //arrange
        Calculator calculator = new Calculator();

        //act
        double result = calculator.multiply(3, 4);

        //assert
        assertEquals(12, result);
    }

    @Test
    void divideTwoPositiveNumbers_expectNoError() {
        //arrange
        Calculator calculator = new Calculator();

        //act
        double result = calculator.divide(3, 4);

        //assert
        assertEquals(0.75, result);
    }

    @Test
    void divideByZero_expectArithmeticException() {
        //arrange
        Calculator calculator = new Calculator();

        //act & assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }

}