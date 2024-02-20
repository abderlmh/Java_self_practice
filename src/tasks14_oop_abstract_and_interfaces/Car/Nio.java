package tasks14_oop_abstract_and_interfaces.Car;

public class Nio extends Car implements AutoPilot{
    public Nio(String model, int year, double price, String color) {
        super("Nio", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " is driving");
    }

    @Override
    public void AutoPark() {
        System.out.println(getMake() + " it has Auto park ");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " it has self drive option");
    }
}
