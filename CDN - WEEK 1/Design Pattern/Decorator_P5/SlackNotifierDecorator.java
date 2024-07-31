package Decorator_P5;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Sending the original notification
        sendSlack(message);  // Adding Slack functionality
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}


