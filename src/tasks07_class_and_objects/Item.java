package tasks07_class_and_objects;

public class Item {

    public String itemName ;
    public double unitPrice;
    public int quantity ;
    public double calcCost ;

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", calcCost=" + calcCost +
                '}';
    }
}
