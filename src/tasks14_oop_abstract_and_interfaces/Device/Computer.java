package tasks14_oop_abstract_and_interfaces.Device;

public class Computer extends Device{
    public Computer(String brand, String model, double price, String color, String size, boolean is_has_Battery, boolean is_has_Power_Button) {
        super(brand, model, price, color, size, is_has_Battery, is_has_Power_Button);
    }

    @Override
    public void turnOn() {
        System.out.println("press the button to turn on " +getBrand()+ " " + getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the button to turn off " +getBrand() +" "+getModel());
    }


}
