package tasks14_oop_abstract_and_interfaces.Device;

public class Phone extends Device{
    public Phone(String brand, String model, double price, String color, String size, boolean is_has_Battery, boolean is_has_Power_Button) {
        super(brand, model, price, color, size, is_has_Battery, is_has_Power_Button);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the button to turn on " + getBrand() +" "+ getModel() );
    }

    @Override
    public void turnOff() {
        System.out.println("Press the button to turn off " + getBrand() + getModel());
    }

    public void call(long phoneNum){
        System.out.println(getBrand() +" "+ getModel() +" is Calling : + " + phoneNum );
    }

    public void text (long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is texting : + " + phoneNum);
    }


}
