package LLD.TEMPLATE;

public class paymentMerchant extends PaymentFlow {
    @Override
    public void validateRequest(){
        System.out.println("validate Request to merchant");
    }

    @Override
    public void debitAmount(){
        System.out.println("merchant debit amount");
    }

    @Override
    public void calculateFees(){
        System.out.println("merchant calculate fees");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount merchant");
    }
}
