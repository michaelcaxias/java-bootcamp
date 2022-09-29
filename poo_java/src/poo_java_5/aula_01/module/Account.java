package poo_java_5.aula_01.module;

import poo_java_5.aula_01.exception.InvalidNumberException;

public abstract class Account {
    private int number;
    private double balance;

    private Customer customer;

    public Account(int number, Customer customer) {
        this.number = number;
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("O valor é inválido. Insira um número maior que 0.");
        }
        balance += value;
    }

    public boolean withdraw(double value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("O valor é inválido. Insira um número maior que 0.");
        }
        balance -= value;
        return false;
     }

    @Override
    public String toString() {
        return "number=" + number +
                ", balance=" + balance +
                ", customer=" + customer;
    }
}
