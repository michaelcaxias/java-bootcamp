package poo_java_3.exercises.ex1;

public class Basic extends Customer {
    public void  withdraw(String type) {
        System.out.printf("Sacando em %s%n", type);
    }

    public void balanceInquiry() {
        System.out.println("Consultando saldo...");
    }

    public void payment() {
        System.out.println("Pagando serviço..");
    }
}
