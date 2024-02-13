package tasks04_selection_statements;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int total = 100 ;

        if (total == 50){
            System.out.println(" 20 crew , 30 passenger ");
        } else if (total == 75 ) {
            System.out.println(" 25 crew , 50 passenger ");
        } else if (total == 100) {
            System.out.println(" 30 crew , 70 passenger");
        }else {
            System.err.println("IsNotValid !");
        }
    }
}
