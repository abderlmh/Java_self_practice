package tasks13_oop_inheritance.phone;

public class Phone {

    private String brand , model ,size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()){
            System.out.println("The brand must not be null or empty , or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()){
            System.out.println("The model must not be null or empty , or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.out.println("The price must be greater than zero");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()){
            System.out.println("The brand must not be null or empty , or blank");
            System.exit(1);
        }
        this.color = color;
    }

    public void call(String phoneNumber){
        System.out.println(getBrand()+" calling the number [" + phoneNumber + "]");
    }

    public void text (String phoneNumber){
        System.out.println(getBrand()+" calling the number [" + phoneNumber + "]");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
