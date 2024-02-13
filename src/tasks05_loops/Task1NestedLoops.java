package m17_loops_part2;

public class Task1NestedLoops {

    public static void main(String[] args) {

        for (int i = 1; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {

                System.out.print(i + " * " + j +" = " + (j*i) + "\t");

            }

            System.out.println();
        }
    }
}
