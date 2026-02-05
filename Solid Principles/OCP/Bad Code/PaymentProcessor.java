public class PaymentProcessor {
    public void processPayment(String paymentMethod,double amount){
        if(paymentMethod.equals("CreditCard")){
            //business logic
            System.out.println("Making payment via Credit Card :" + amount);
        }
        else if(paymentMethod.equals("Debit Card")){
            //business logic
            System.out.println("Making payment via Debit Card :" + amount);
        }
        else if(paymentMethod.equals("Paypal")){
            //business logic
            System.out.println("Making payment via PayPal :" + amount);
        }
        else{
            throw new IllegalArgumentException("Unsupported payment method " +paymentMethod);
        }
    }
}