package tasks12_oop_encapsulation;

public class Candy {

    private String brand ;
    private int quantity;
    private int price;
    private boolean hasPeanuts = true;

    public Candy(String brand, int quantity, int price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        isHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <=0){
            System.err.println("The quantity of candy cannot be set to zero or a negative value.");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0){
            System.err.println("The price of candy cannot be set to a negative value.");
            System.exit(1);
        } else if (price == 0) {
            System.out.println("Free");
        }

        this.price = price;
    }

    public void isHasPeanuts(boolean hasPeanuts) {
        if (!hasPeanuts){
            System.err.println("doesnt have peanuts");
        }
        this.hasPeanuts=hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
