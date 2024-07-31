package strategy_P8;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Setting CreditCardPayment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(100.0);

        // Setting PayPalPayment strategy
        PaymentStrategy payTMPayment = new PayTMPayment("john.doe@example.com");
        paymentContext.setPaymentStrategy(payTMPayment);
        paymentContext.executePayment(200.0);
    }
}
