package poo_java_5.aula_01.data;

import poo_java_5.aula_01.exception.AccountNotFoundException;
import poo_java_5.aula_01.exception.InvalidNumberException;
import poo_java_5.aula_01.module.*;
import poo_java_5.aula_01.util.NumberGenerator;

import java.util.HashMap;
import java.util.Map;

public class ManageAccounts {
    private Map<Integer, Account> accounts;
    NumberGenerator numberGenerator;

    public ManageAccounts(Map<Integer, Account> accounts) {
        this.accounts = new HashMap<>();
        numberGenerator = NumberGenerator.getInstance();
    }

    public void newCheckingAccount(Customer customer) {
        int accountNumber = numberGenerator.getNext();
        accounts.put(accountNumber, new CheckingAccount(accountNumber, customer));
    }

    public void newSpecialAccount(Customer customer, double limit) {
        int accountNumber = numberGenerator.getNext();
        accounts.put(accountNumber, new SpecialAccount(accountNumber, customer, limit));
    }

    public void newSavingAccount(Customer customer) {
        int accountNumber = numberGenerator.getNext();
        accounts.put(accountNumber, new SavingsAccount(accountNumber, customer));
    }

    public void deposit(int accountNumber, double value) throws AccountNotFoundException, InvalidNumberException {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new AccountNotFoundException("Conta não existe.");
        }
        account.deposit(value);
    }
}
