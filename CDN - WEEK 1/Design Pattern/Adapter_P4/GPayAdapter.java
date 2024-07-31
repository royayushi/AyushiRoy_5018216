package Adapter_P4;

public class GPayAdapter implements PaymentProcessor {
    private GPayGateway GPayGateway;

    public GPayAdapter(GPayGateway GPayGateway) {
        this.GPayGateway = GPayGateway;
    }

    @Override
    public void processPayment(double amount) {
        GPayGateway.charge(amount);
    }
}

