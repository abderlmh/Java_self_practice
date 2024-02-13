package tasks08_string_class;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Split or No Split ");
        String split = input.nextLine();
        System.out.println("Enter the number of people : ");
        int numberOfPeople = input.nextInt();
        System.out.println("Enter the check amount : ");
        double checkAmount = input.nextDouble();
        input.nextLine();
        System.out.println("How was the service quality ?");
        String servesQuality = input.nextLine();
        double tipPercent = tipPercent(servesQuality);
        double totalTip = checkAmount * tipPercent;
        double totalToPay = totalTip + checkAmount;
        double totalPerPerson = totalToPay/numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;

        if (split.equalsIgnoreCase("yes")) {
            System.out.println("Number of people entered = " + numberOfPeople);
            System.out.println("total to pay = " + totalToPay);
            System.out.println("total tip = " + totalTip);
            System.out.println("total per person = " + totalPerPerson);
            System.out.println("tip per person = " + tipPerPerson);
        }else {
            System.out.println("total to pay = " + totalToPay);
        }
        input.close();

        }

    public static double tipPercent(String servesQuality) {
        switch (servesQuality) {
            case "Poor" :
                return 0.05;
            case "Fair":
                return 0.1;

            case "Good" :
                return 0.15;

            case "Great" :
                return 0.20;

            case "Excellent" :
                return 0.25;

            default: return 0;

        }
    }

    }












