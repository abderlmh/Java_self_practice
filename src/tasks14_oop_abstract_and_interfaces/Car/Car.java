package tasks14_oop_abstract_and_interfaces.Car;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make ,String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        if (make == null || make.isEmpty()){
            System.err.println("Make can not be null or empty");
            System.exit(1);
        }
        return make;
    }

    public String getModel() {
        if (model == null || model.isEmpty()){
            System.err.println("Model can not be null or empty");
        }
        return model;
    }

    public int getYear() {
        if (year<=1886){
            System.err.println("year must not be less than 1886");
            System.exit(1);
        }
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            System.err.println("price must not be negative.");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()){
            System.err.println("Color can not be null or empty");
        }
        this.color = color;
    }

     public abstract void start();
     public abstract void drive();

     public void stop(){
         System.out.println(getMake()+ " Is stopping");
     }

    @Override
    public String toString() {
        return  getMake() + "{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price + " $"+
                ", color='" + color + '\'' +
                '}';
    }
}
