package tasks07_part2_scanner;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        double km , miles ;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles : ");
        miles = input.nextInt();
        km = miles*1.60934;
        System.out.println(miles + " miles is equal to "+km+" Kilometers ");
        input.close();



    }




}
