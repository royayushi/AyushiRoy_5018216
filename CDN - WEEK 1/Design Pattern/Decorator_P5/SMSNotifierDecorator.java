package Decorator_P5;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Sending the original notification
        sendSMS(message);     // Adding SMS functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

