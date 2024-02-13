package tasks10_arraylist;

import java.util.Arrays;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {



/*      String str ="JAVA java";
        String[] word = str.split(" ");
        boolean IsEqual = true;

        System.out.println(Arrays.toString(word));

        if (word[0].equalsIgnoreCase(word[1])) {
            System.out.println(IsEqual);
        }else {
            System.out.println(!IsEqual);
        }
*/
        String str ="JAVA java";
        int UpperCase = 0, LowerCAse = 0;


        for (char each : str.toCharArray()) {
            if(Character.isLetter(each)){
                if(Character.isUpperCase(each)){
                    UpperCase++;
                }else{
                    LowerCAse++;
                }
            }
        }

        System.out.println(UpperCase == LowerCAse);

    }


}

