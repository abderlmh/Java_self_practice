package tasks14_oop_abstract_and_interfaces.Device;

public class Samsung extends Phone implements Downloadable,AndroidApp{
    public Samsung(String brand, String model, double price, String color, String size, boolean is_has_Battery, boolean is_has_Power_Button) {
        super(brand, model, price, color, size, is_has_Battery, is_has_Power_Button);
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + " is downloading app from " + AppStoreName);
    }
}
