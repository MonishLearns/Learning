package LLD.TEMPLATE;

public class PaymentFriend extends PaymentFlow {
    @Override
    public void validateRequest(){
        System.out.println("validate Request to friend");
    }

    @Override
    public void debitAmount(){
        System.out.println("friend debit amount");
    }

    @Override
    public void calculateFees(){
        System.out.println("friend calculate fees");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount friend");
    }
}
