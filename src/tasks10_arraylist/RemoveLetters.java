package tasks10_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;


public class RemoveLetters {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$','A','B','1','2','c','d','@','!','3','4'));

        list.removeIf(i->Character.isLetter(i));

        System.out.println(list);

    }
}
