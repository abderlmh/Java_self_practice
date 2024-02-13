package m28_string_class_part2;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        Scanner inputWord = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = inputWord.nextLine();
        if (word.charAt(0)=='x'){
           word = word.replaceFirst  ("x","a");
            System.out.println(" Output : " + word);
            return;
        }
        System.out.println("Output : " + word );


    }
}
