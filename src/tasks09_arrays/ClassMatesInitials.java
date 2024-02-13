package tasks09_arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Olivia Thornton","Caleb Rodriguez","Zoe Harper","Mason Bennett","Ava Ramirez","Elijah Foster",

                                "Isabella Nguyen","Jackson Sinclair","Mia Santiago","Liam Donovan"};


        String[]initials = new String[classmates.length];

        for (int i = 0; i < classmates.length; i++) {

           initials[i] = classmates[i].charAt(0) +" "+  classmates[i].charAt(classmates[i].indexOf(" ")+1);

            System.out.println(initials[i]);

        }


    }
}
