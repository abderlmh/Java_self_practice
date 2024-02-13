package tasks07_part2_scanner;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = input.nextInt();
        System.out.println("Enter your gender :");
        String gender = input.next();
        input.nextLine();
        System.out.println("Enter your full name :");
        String fullName = input.nextLine();
        System.out.println("Enter you phone number :");
        long phoneNumber = input.nextLong();
        System.out.println("Enter your zip code : ");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name :");
        String schoolName = input.nextLine();
        System.out.println("Enter your city :");
        String city = input.nextLine();
        System.out.println("Enter your state name :");
        String state = input.next();
        System.out.println("Enter your building number :");
        int buildingNumber = input.nextInt();
        System.out.println("Enter street name :");
        String streetName = input.next();
        System.out.println("Full Name: "+fullName+"\nAge: "+age+"\n"+"Gender :"+gender+"\nPhone number: "+phoneNumber+"\nAddress:\n\t"+buildingNumber+
                " "+streetName+"\n\t"+city+", "+state+" "+zipCode);
        input.close();


    }
}
