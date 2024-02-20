package tasks14_oop_abstract_and_interfaces.Device;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, String size, boolean is_has_Battery, boolean is_has_Power_Button) {
        super(brand, model, price, color, size, is_has_Battery, is_has_Power_Button);
    }
}
