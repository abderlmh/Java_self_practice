package tasks08_string_class;

import java.util.Scanner;

public class firstAndLastNameFormat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name = ");
        String firstName = input.next();
        System.out.println("Enter your lastName = ");
        String lastName = input.next();
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);

    }
}
