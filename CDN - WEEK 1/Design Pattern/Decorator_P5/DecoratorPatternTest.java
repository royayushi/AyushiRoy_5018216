package Decorator_P5;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Creating a base EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Adding SMS functionality to the EmailNotifier using SMSNotifierDecorator
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Adding Slack functionality to the EmailNotifier using SlackNotifierDecorator
        Notifier slackEmailNotifier = new SlackNotifierDecorator(emailNotifier);

        // Adding both SMS and Slack functionality to the EmailNotifier
        Notifier combinedNotifier = new SMSNotifierDecorator(new SlackNotifierDecorator(emailNotifier));

        // Sending notifications through different combinations
        emailNotifier.send("Hello via Email!");
        smsEmailNotifier.send("Hello via Email and SMS!");
        slackEmailNotifier.send("Hello via Email and Slack!");
        combinedNotifier.send("Hello via Email, SMS, and Slack!");
    }
}
