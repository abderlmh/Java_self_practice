package m17_loops_part2;

public class Task3NestedLoop {

    public static void main(String[] args) {

        int number = 8 ;
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j < i   ; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
