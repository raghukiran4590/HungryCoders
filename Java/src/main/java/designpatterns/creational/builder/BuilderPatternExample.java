package src.main.java.designpatterns.creational.builder;

public class BuilderPatternExample {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "64GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println("Computer HDD : "+computer.getHdd());
        System.out.println("Computer RAM : "+computer.getRam());
        System.out.println("Computer has Graphics Card ? "+computer.isGraphicsCard());
        System.out.println("Computer has Bluetooth ? "+computer.isBluetoothTechnology());
    }
}
