package tasks14_oop_abstract_and_interfaces.Car;

public class CydeoCar extends Car implements AutoPilot,Flyable{
    public CydeoCar(String model, int year, double price, String color) {
        super("CydeoCar", model, year, price, color);
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
        System.out.println(getMake() + " it has Auto Park");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " it has self drive option " );
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " it can fly only if group4 are the pilots");
    }
}
