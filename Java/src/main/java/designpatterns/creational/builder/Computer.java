package src.main.java.designpatterns.creational.builder;

public class Computer {

    private String hdd;
    private String ram;
    private boolean graphicsCard;
    private boolean bluetoothTechnology;

    private Computer(ComputerBuilder computerBuilder) {
            this.ram = computerBuilder.ram;
            this.hdd = computerBuilder.hdd;
            this.graphicsCard = computerBuilder.graphicsCard;
            this.bluetoothTechnology = computerBuilder.bluetoothTechnology;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(boolean graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public boolean isBluetoothTechnology() {
        return bluetoothTechnology;
    }

    public void setBluetoothTechnology(boolean bluetoothTechnology) {
        this.bluetoothTechnology = bluetoothTechnology;
    }

    public static class ComputerBuilder {
        private String hdd;
        private String ram;
        private boolean graphicsCard;
        private boolean bluetoothTechnology;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.graphicsCard = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.bluetoothTechnology = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
