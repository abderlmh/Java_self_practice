package m26_user_input_scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        double area , perimeter ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius :");
        int radius = input.nextInt();
        area = 3.14 * radius * radius;
        perimeter = 2 * 3.14 * radius;
        System.out.println(" The area of the Circle is " + area);
        System.out.println("The perimeter of the Circle is " + perimeter);

    }
}
