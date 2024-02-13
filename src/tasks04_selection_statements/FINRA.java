package tasks04_selection_statements;

public class FINRA {

    public static void main(String[] args) {

        int num = 15;

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FINRA");
        } else if (num % 5 == 0 ) {
            System.out.println("RA");
        } else if (num % 3 == 0) {
            System.out.println("FIN");
        }
    }
}
