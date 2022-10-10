package com.testing.aula1.calculadora;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            return 0;
        }

        return firstNumber / secondNumber;
    }
}
