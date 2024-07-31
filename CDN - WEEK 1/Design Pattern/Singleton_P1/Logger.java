package Singleton_P1;

public class Logger {
    // Step 1: Private static instance of the Logger class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        // Creating instance if it does not exist
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

