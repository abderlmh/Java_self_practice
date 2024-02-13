package m17_loops_part2;

public class Task1WhileLoop {

    public static void main(String[] args) {

        int num = 0;
        int sum = 0;

        while (num<=10){
            sum+=num;
            num+=2;
        }
        System.out.print("Sum of even numbers : " + sum);
    }
}
