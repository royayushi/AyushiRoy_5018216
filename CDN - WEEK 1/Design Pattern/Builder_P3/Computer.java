package Builder_P3;

public class Computer {
    private final String CPU;
    private final int RAM;
    private final int Storage;
    private final boolean graphicsCard;
    private final boolean wifi;

    // Creating private constructor to be used by the Builder class
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifi = builder.wifi;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + "GB, Storage=" + Storage + "GB, Graphics Card=" + graphicsCard + ", WiFi=" + wifi + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private int RAM;
        private int Storage;
        private boolean graphicsCard;
        private boolean wifi;

        // Setter methods for Builder
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int Storage) {
            this.Storage = Storage;
            return this;
        }

        public Builder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWiFi(boolean wifi) {
            this.wifi = wifi;
            return this;
        }

        // Build method to create an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
