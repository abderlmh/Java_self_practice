package tasks07_part2_scanner;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cents :");
        int cent = input.nextInt();
        int dollars = cent / 100 ;
        int cents = cent-dollars*100;
        System.out.println(cents+"  Is equal to " + dollars +" and "+cents+" cents " );
    }
}
