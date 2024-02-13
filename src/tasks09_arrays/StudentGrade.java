package tasks09_arrays;

import java.util.Arrays;

public class StudentGrade {

    public static void main(String[] args) {

        String[] studentNames = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};

        char[] grades = new char[studentNames.length];

        for (int i = 0; i < studentNames.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';

            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            }

        }

        System.out.println("grades = " + Arrays.toString(grades));

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]+"\'s score is "+scores[i]+", and grade is "+grades[i] );
        }



    }
}
