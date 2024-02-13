package m28_string_class_part2;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word :");
        String firstWord = input.nextLine();
        System.out.println("Enter the second word :");
        String secondWord = input.nextLine();
        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0) ){
            System.out.println("output : "+ firstWord +secondWord.substring(1) );
        }
        else System.out.println("Output : " +firstWord+secondWord );
    }
}
