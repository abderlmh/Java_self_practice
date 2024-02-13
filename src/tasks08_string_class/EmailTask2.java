package tasks08_string_class;

import java.util.Locale;
import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.nextLine();
        int indexOfUnderScore = email.indexOf("_");
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");
        String firstName = email.substring(0,indexOfUnderScore).substring(0,1).toUpperCase()+email.substring(1,indexOfUnderScore).toLowerCase();
        String lastName = email.substring(indexOfUnderScore+1,atIndex).substring(0,1).toUpperCase()+email.substring(indexOfUnderScore+2,atIndex).toLowerCase();
        String domain = email.substring(atIndex+1,dotIndex).substring(0,1).toUpperCase()+email.substring(atIndex+2,dotIndex).toLowerCase();
        System.out.println("First name : "+firstName);
        System.out.println("Last name : "+lastName);
        System.out.println("Domain : "+domain);
    }
}
