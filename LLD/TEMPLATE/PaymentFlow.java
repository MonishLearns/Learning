package LLD.TEMPLATE;

public abstract class PaymentFlow {
    // These are abstract methods and should be over ride by the classes inheriting these classes.
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // template method
    // since we have defined final, no child class can override this function.
    // here we also define the order in which steps have to be used.
    public final void sendMoney(){
        validateRequest();
        debitAmount();
        calculateFees();
        creditAmount();
    }
}
