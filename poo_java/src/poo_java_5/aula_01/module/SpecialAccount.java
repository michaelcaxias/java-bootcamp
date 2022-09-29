package poo_java_5.aula_01.module;

import poo_java_5.aula_01.exception.InvalidNumberException;

public class SpecialAccount extends Account {
    private double limit;

    public SpecialAccount(int number, Customer customer, double limit) {
        super(number, customer);
        this.limit = limit;
    }

    @Override
    public boolean withdraw(double value) throws InvalidNumberException {
        if (insufficientFunds(value)) {
            return false;
        }
        return super.withdraw(value);
    }

    private boolean insufficientFunds(double value) {
        return getBalance() + limit < value;
    }

    @Override
    public String toString() {
        return "Conta Especial: " + super.toString();
    }
}
