package tasks14_oop_abstract_and_interfaces.Device;

public abstract class Device {

    private final String brand;
    private final String model;
    private double price;
    private String color;
    private String size;
    private boolean Is_has_Battery;
    private boolean Is_has_Power_Button;

    public Device(String brand, String model, double price, String color, String size, boolean is_has_Battery, boolean is_has_Power_Button) {
        this.brand = brand;
        this.model = model;
        setPrice(price);
        setColor(color);
        this.size = size;
        Is_has_Battery = is_has_Battery;
        Is_has_Power_Button = is_has_Power_Button;
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty()){
            System.out.println("brand must not be null or empty");
            System.exit(1);
        }
        return brand;
    }

    public String getModel() {
        if (model == null || brand.isEmpty()){
            System.out.println("Model must not be null or empty");
            System.exit(1);
        }
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("price must be positive");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()){
            System.out.println("color must not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isIs_has_Battery() {
        return Is_has_Battery;
    }

    public void setIs_has_Battery(boolean is_has_Battery) {
        Is_has_Battery = is_has_Battery;
    }

    public boolean isIs_has_Power_Button() {
        return Is_has_Power_Button;
    }

    public void setIs_has_Power_Button(boolean is_has_Power_Button) {
        Is_has_Power_Button = is_has_Power_Button;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +"$"+
                ", color='" + color + '\'' +
                ", size=" + size +
                ", Is_has_Battery=" + Is_has_Battery +
                ", Is_has_Power_Button=" + Is_has_Power_Button +
                '}';
    }
}
