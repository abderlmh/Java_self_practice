package tasks14_oop_abstract_and_interfaces.Car;

public class Tesla extends Car implements AutoPilot{
    public Tesla(String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
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
        System.out.println(getMake() + " it has self drive option ");
    }
}
