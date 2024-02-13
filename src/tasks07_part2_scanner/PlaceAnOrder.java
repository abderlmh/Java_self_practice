package tasks07_part2_scanner;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        String productName;
        double price;
        int quantity;
        String firstName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name :");
        productName = input.nextLine();
        System.out.println("Enter the price : ");
        price = input.nextDouble();
        System.out.println("Enter the quantity :");
        quantity =input.nextInt();
        System.out.println("Enter your first name :");
        firstName = input.next();
        double total = price*quantity;
        System.out.println(firstName + " your order for " +quantity+" "+productName+" has been placed. your total is "+total );
        input.close();

    }
}
