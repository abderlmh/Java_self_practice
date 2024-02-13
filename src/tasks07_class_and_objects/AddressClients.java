package tasks07_class_and_objects;


public class AddressClients {

    public static void main(String[] args) {

        Address user1 = new Address();
        user1.buildingNumber = 7925;
        user1.street = "Jones Branch Dr";
        user1.city = "McLean";
        user1.state = "VA";
        user1.zipCode = "22012";

        user1.address();

        System.out.println("---------------------------------");

        Address user2 = new Address();
        user2.buildingNumber = 910;
        user2.street = "N Sheridan Ave";
        user2.city = "Chicago";
        user2.state = "Illinois";
        user2.zipCode = "60640";

        user2.address();
    }
}
