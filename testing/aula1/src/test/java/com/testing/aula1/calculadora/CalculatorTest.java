package com.testing.aula1.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    @DisplayName("Valida a soma")
    public void sum_returnDouble_whenValidInput() {
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
}
