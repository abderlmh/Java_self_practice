package m13_operators_part3;

public class Task3_AND_OR_Operators {

    public static void main(String[] args) {


        double age = 18;

        boolean haslearningPermit = true;
        boolean hasDriverLicence = false;

        boolean result = (age >= 18 && hasDriverLicence) || (age >= 15.6 && haslearningPermit);


        System.out.println("resident have a driver license :" + result );
    }
}
