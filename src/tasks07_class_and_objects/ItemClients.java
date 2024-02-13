package tasks07_class_and_objects;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Phone";
        item1.unitPrice = 1000;
        item1.quantity = 5;
        item1.calcCost = item1.quantity*item1.unitPrice;
        System.out.println(item1);

        System.out.println("-------------------------------------");



    }
}
