package Adapter_P4;

public class PayTMAdapter implements PaymentProcessor {
    private PayTMGateway payTMGateway;

    public PayTMAdapter(PayTMGateway payTMGateway) {
        this.payTMGateway = payTMGateway;
    }

    @Override
    public void processPayment(double amount) {
        payTMGateway.makePayment(amount);
    }
}
