package poo_java_3.exercises.ex1;

public class Basic extends Customer {
    public void  withdraw() {
        CashWithdraw.withdraw();
    }

    public void balanceInquiry() {
        CashInquiry.inquiry();
    }

    public void payment() {
        ServicePayment.payment();
    }
}
