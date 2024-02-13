package tasks08_string_class;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.nextLine();
        int indexOfUnderScore = email.indexOf("_");
        int atIndex = email.indexOf("@");
        String firstName = email.substring(0,indexOfUnderScore);
        String lastName = email.substring(indexOfUnderScore+1,atIndex);
        if (indexOfUnderScore!=-1){
            System.out.println(lastName+"_"+firstName+email.substring(atIndex));
        }else {
            System.out.println(email);
        }




    }


}
