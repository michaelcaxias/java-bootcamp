package poo_java_5.aula_01.module;

import poo_java_5.aula_01.exception.InvalidNumberException;

public class CheckingAccount extends Account {
    public CheckingAccount(int number, Customer customer) {
        super(number, customer);
    }

    @Override
    public boolean withdraw(double value) throws InvalidNumberException {
        if (insufficientFunds(value)) {
            return false;
        }
        return super.withdraw(value);
    }

    private boolean insufficientFunds(double value) {
        return getBalance() < value;
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
}
