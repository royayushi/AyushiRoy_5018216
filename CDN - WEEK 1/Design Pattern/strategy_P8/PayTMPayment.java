package strategy_P8;

public class PayTMPayment implements PaymentStrategy {
    private String email;

    public PayTMPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayTM.");
        System.out.println("Email: " + email);
    }
}
