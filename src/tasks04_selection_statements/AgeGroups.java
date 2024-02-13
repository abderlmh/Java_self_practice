package tasks04_selection_statements;

public class AgeGroups {

    public static void main(String[] args) {
        
        int age = 75 ;
        
            if (age>0 && age<150) {
                if (age <= 20) {
                    System.out.println("Young Middle-Aged Teenager");
                } else if (age <= 55) {
                    System.out.println("Young Middle-Aged Adult");
                } else if (age > 55) {
                    System.out.println("Young Middle-Aged Senior");
                }
            }else {
                System.err.println("Invalid");
            }

    }
}