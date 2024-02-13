package tasks12_oop_encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isBlank() || name.trim().isEmpty()){
            System.err.println("The name cannot be empty or blank.\n");
            System.exit(1);
        }
        if (!name.matches("^[a-zA-Z\\s]+$")){  // The expression "^[a-zA-Z\\s]+$" is a Java regular expression used
            // to match strings that contain only letters (both uppercase and lowercase) and spaces.
            System.err.println("Name must contain only letters and spaces.");
            System.exit(1);
        }

        this.name = name;
    }

    public double getUnitPrice() {

        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {

        if (unitPrice <= 0){
            System.err.println("The unitPrice cannot be negative.");
            System.exit(1);
        }

        this.unitPrice = unitPrice;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity <= 0) {

            System.err.println("The quantity cannot be negative.");
            System.exit(1);
        }

        this.quantity = quantity;
    }


    public double calcCost(){
        return unitPrice*quantity;
    }



    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost= "+calcCost()+
                '}';
    }
}
