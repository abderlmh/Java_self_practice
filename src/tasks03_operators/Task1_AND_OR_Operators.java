package m13_operators_part3;

public class Task1_AND_OR_Operators {

    public static void main(String[] args) {

        int b = 2;
        boolean result = (++b == 2 || b == 2 ) && --b == 2;
        //               ( 3 == 2 || 3 == 2 ) && 2==2
        //                (false  || false )  && true
        //                       false        && true
        //                                false
        System.out.println(result);
        System.out.println(b);

    }



}
