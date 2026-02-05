// Payment interface (Realization)
interface Payment {
    void pay(double amount);
}

// Class implementing the Payment interface
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card.");
    }
}

// Main class
public class RealizationExample {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(100.0);  // Output: Paid $100.0 using credit card.
    }
}