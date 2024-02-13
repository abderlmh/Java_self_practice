package m26_user_input_scanner;
import java.util.Scanner;
public class FamilyMembers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with ?");
        int people = input.nextInt();
        input.close();

        if (people<3){
            System.out.println("Live with less than three people "  );
        } else if (people > 3 && people <=6) {
            System.out.println("live with 3 - 6 people");
        }else {
            System.out.println("live with more than 6 people");
        }

    }

}

