package tasks04_selection_statements;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 40;
        double n2 = 50;
        char mathOperator = '/';

        switch (mathOperator){
            case '+'-> System.out.println("result = " +(n1+ n2));
            case '-'-> System.out.println("result = "+ (n1 - n2));
            case '*'-> System.out.println("result = "+ (n1 * n2));
            case '/'-> System.out.println("result = "+ (n1 / n2));
            default -> System.err.println("Invalid operator");
        }
    }
}
