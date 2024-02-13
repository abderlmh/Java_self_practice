package tasks06_methods;

public class OddAndEven {

    public static void main(String[] args) {


        System.out.println(isOdd(100));
        System.out.println(isEven(50));


    }


    public static boolean isOdd (int num){
          if (num % 3 == 0){
              return true;
          }else {
              return false;
          }

    }
    public static boolean isEven (int num){
        if (num % 2 == 0 ){
            return true;
        }else {
            return false;
        }

    }

}
