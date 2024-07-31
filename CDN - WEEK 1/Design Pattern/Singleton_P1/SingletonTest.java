package Singleton_P1;

public class SingletonTest {
    public static void main(String[] args) {
        // Getting the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verifying that both references point to the same instance
        if (logger1 == logger2) {
            System.out.println("Logger is a singleton. Both references point to the same instance.");
        } else {
            System.out.println("Logger is not a singleton. Different instances were created.");
        }

        // Using the Logger instance
        logger1.log("This is a log message.");
        logger2.log("This is another log message.");
    }
}

