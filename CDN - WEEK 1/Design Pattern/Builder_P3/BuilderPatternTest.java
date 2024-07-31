package Builder_P3;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Creating a high-end computer using the builder
        Computer highEndComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1024)
                .setGraphicsCard(true)
                .setWiFi(true)
                .build();

        // Creating a budget computer using the builder
        Computer budgetComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(8)
                .setStorage(256)
                .setGraphicsCard(false)
                .setWiFi(true)
                .build();

        // Printing the configurations
        System.out.println("High-End Computer Configuration: " + highEndComputer);
        System.out.println("Budget Computer Configuration: " + budgetComputer);
    }
}

