package m17_loops_part2;

public class Task2FinraPattern {

    public static void main(String[] args) {

        int num = 1;

        do {
            if (num % 3== 0){
                System.out.print("FIN ");
            } else if (num % 5 == 0) {
                System.out.print("RA ");
            }else if (num % 3 == 0 && num % 5 == 0){
                System.out.print("FINRA ");
            }else System.out.print(num+" ");

            num++;
        }while (num<=30);
    }
}
