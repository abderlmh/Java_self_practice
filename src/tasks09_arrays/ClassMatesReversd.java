package tasks09_arrays;

import java.util.Arrays;

public class ClassMatesReversd {

    public static void main(String[] args) {

        String [] classmates ={"Oliver Thompson","Mia Rodriguez","Ethan Anderson","Sophia Patel","Liam Wilson" ,"Ava Brown","Noah Davis",
                                "Isabella Murphy","Lucas Garcia","Olivia Smith"};

        String [] reverse = new String[classmates.length] ;

        for (int i = classmates.length - 1 , j = 0; i >= 0 ; i--,j++) {
            reverse[j]=classmates[i];
        }
        System.out.println(Arrays.toString(reverse));

    }
}
