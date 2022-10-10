package com.testing.aula1.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    @DisplayName("Valida a soma")
    public void sum_returnInt_whenValidInput() {
        // setup
        Calculator calculator = new Calculator();

        int firstNumber = 1;
        int secondNumber = 2;
        int sumExpected = 3;

        // run
        int response = calculator.sum(firstNumber, secondNumber);

        //validate
        assertEquals(sumExpected, response);
    }

    @Test
    public void divide_returnDouble_whenTwoPositiveNumbers() {

        //setup
        Calculator calculator = new Calculator();

        double firstNumber = 30;
        double secondNumber = 3;

        double expected = 10;

        //run
        double response = calculator.divide(firstNumber, secondNumber);

        // validate
        assertEquals(expected, response);
    }
}
