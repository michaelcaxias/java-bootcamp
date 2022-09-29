package poo_java_5.aula_01.module;

import poo_java_5.aula_01.exception.InvalidNumberException;

public class SavingsAccount extends Account {
    private static double tax = 0.1; // unica taxa para todos os objetos
    public SavingsAccount(int number, Customer customer) {
        super(number, customer);
    }

    public static double getTax() {
        return tax;
    }

    public static void setTax(double value) {
        SavingsAccount.tax = value;
    }

    @Override
    public boolean withdraw(double value) throws InvalidNumberException {
        if (insufficientFunds(value)) {
            return false;
        }
        return super.withdraw(value + tax);
    }

    private boolean insufficientFunds(double value) {
        return getBalance() + tax < value;
    }

    public String toString() {
        return "Conta poupança: " + getBalance();
    }
}
