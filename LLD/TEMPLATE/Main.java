package LLD.TEMPLATE;

public class Main {
    public static void main(String[] args){
        PaymentFlow paymentFlowObj = new PaymentFriend();
        paymentFlowObj.sendMoney();
        PaymentFlow paymentFlowObjM = new paymentMerchant();
        paymentFlowObjM.sendMoney();
    }
}
