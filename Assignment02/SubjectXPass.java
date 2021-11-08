// import java.util.Scanner;

import java.util.*;

public class SubjectXPass {
    private static boolean passedHurdle;

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        // boolean booleanpassedHurdle = true;

        System.out.println("\nInput the numbers of students: ");
        int numberOfStudents = keyboard.nextInt( );
        while (numberOfStudents > 0){
            // processStudentResult
            numberOfStudents = numberOfStudents -1;
        }

        System.out.println("\nPlease enter 4 assignments marks and 2 lab marks: ");
        int assign1 = keyboard.nextInt();
        int assign2 = keyboard.nextInt();
        int assign3 = keyboard.nextInt();
        int assign4 = keyboard.nextInt();
        int lab1 = keyboard.nextInt();
        int lab2 = keyboard.nextInt();
        double pracAverage = (assign1 + assign2 + assign3 + assign4 + lab1 + lab2) / 6.0;

        if (pracAverage >= 50) {
            System.out.println("Passed assignment/lab hurdle!");
        } else {
            passedHurdle = false;
            System.out.println("Failed assignment/labhurdle!");
        }

        System.out.println("Please enter 2 exam marks: ");

        int exam1 = keyboard.nextInt();
        int exam2 = keyboard.nextInt();

        if ((exam1 >= 40) && (exam2 >= 40)) {
            System.out.println("Passed exam hurdle!");
        } else {
            passedHurdle = false;
            System.out.println("Failed exam hurdle!");
        }


        double examAverage = (exam1 + exam2) / 2.0;
        double finalMark = 0.3 * pracAverage + 0.7 * examAverage;
        System.out.println("Final mark is " + finalMark + "%");

        if ((finalMark >= 50) && (passedHurdle == true)) {
            System.out.println("Passed overall.");
        } else {
            System.out.println("Failed overall.");
        }

    }
    
}