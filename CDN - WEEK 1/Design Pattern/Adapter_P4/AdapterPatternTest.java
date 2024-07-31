package Adapter_P4;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // Creating instances of the third-party payment gateways
        PayTMGateway payTMGateway = new PayTMGateway();
        GPayGateway GPayGateway = new GPayGateway();

        // Creating adapters for the payment gateways
        PaymentProcessor payTMAdapter = new PayTMAdapter(payTMGateway);
        PaymentProcessor GPayAdapter = new GPayAdapter(GPayGateway);

        // Processing payments using the adapters
        payTMAdapter.processPayment(100.0);
        GPayAdapter.processPayment(150.0);
    }
}

