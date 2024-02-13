package m28_string_class_part2;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word : ");
        String firstWord = input.nextLine();
        System.out.println("Enter Second number : ");
        String secondWord = input.nextLine();
        input.close();
        firstWord = firstWord.substring(1);
        secondWord = secondWord.substring(1);
        System.out.println(firstWord+secondWord);


    }
}
