package tasks06_methods;

public class MathUtility {

    public static void main(String[] args) {

         calculator(10,'+',20);
         calculator(2.5,'*',3.0);

         int resultInt = square(8);
         double resultDouble =  square(1.5);

        System.out.println("resultInt = " + resultInt);
        System.out.println("resultDouble = " + resultDouble);

        int resultIntCube = cube(3);
        double resultDoubleCube = cube(2.5);

        System.out.println("resultIntCube = " + resultIntCube);
        System.out.println("resultDoubleCube = " + resultDoubleCube);



    }


    public static void calculator(int num1, char operator, int num2) {

        switch (operator) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            default -> System.out.println(0);
        }


    }

    public static double calculator(double num1, char operator, double num2) {

        switch (operator) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
        }
        return 0;
    }

    public static int square (int num){
       return  num*num;
    }
    public static double square (double num){
       return  num*num;
    }

    public static int cube (int num){
        return square(num)*num;
    }

    public static double cube (double num){
        return square(num)*num;
    }


}

