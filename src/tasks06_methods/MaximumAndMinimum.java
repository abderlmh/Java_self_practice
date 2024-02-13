package tasks06_methods;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        double n = maxDouble(10.5,30.2);
        System.out.println(n);

        int n2 = minInt(100,200);
        System.out.println(n2);

    }

    public static int maxInt (int num1 , int num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static double maxDouble (double num1 , double num2){
        if (num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static int minInt (int num1 , int num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static double minDouble ( double num1 , double num2){
        if (num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}

