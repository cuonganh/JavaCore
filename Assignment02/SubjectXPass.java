

import java.util.Scanner;

public class SubjectXPass {

    static Scanner keyboard = new Scanner(System.in);

    public static void CalculateAndCheckPointsOfStudents() {

        boolean passedHurdle = true;

        System.out.println("Please enter 4 assignments mark and 2 labs mark: ");
        System.out.print("Assignment 1: ");
        int assignment1 = keyboard.nextInt();
        System.out.print("Assignment 2: ");
        int assignment2 = keyboard.nextInt();
        System.out.print("Assignment 3: ");
        int assignment3 = keyboard.nextInt();
        System.out.print("Assignment 4: ");
        int assignment4 = keyboard.nextInt();
        System.out.print("Lab 1: ");
        int lab1 = keyboard.nextInt();
        System.out.print("Lab 2: ");
        int lab2 = keyboard.nextInt();

        double pracAverage = (assignment1 + assignment2 + assignment3 + assignment4 + lab1 + lab2) / 6.0;

        if (pracAverage >= 50) {
            System.out.println("Passed assignment / lab hurdle!");
        } else {
            passedHurdle = false;
            System.out.println("Failed assignment / lab hurdle!");
        }

        System.out.println("Please enter 2 exam marks: ");
        System.out.print("Exam 1: ");
        int exam1 = keyboard.nextInt();
        System.out.print("Exam 2: ");
        int exam2 = keyboard.nextInt();

        if ((exam1 >= 40) && (exam2 >= 40)) {
            System.out.println("Passed exam hurdle!");
        } else {
            passedHurdle = false;
            System.out.println("Failed exam hurdle!");
        }

        double examAverage = (exam1 + exam2) / 2.0;
        double finalMark = 0.3 * pracAverage + 0.7 * examAverage;
        System.out.println("Final mark is " + finalMark);

        if ((finalMark >= 50) && (passedHurdle == true)) {

            System.out.println("Passed overall.");

        } else {

            System.out.println("Failed overall.");

        }

    }

    
    public static void LimitInputStudent() {

        System.out.println("\n========== Input all of the list of students! ==========");
        System.out.print("\nInput the numbers of students: ");

        int numberOfStudents = keyboard.nextInt();

        while (numberOfStudents > 0) {

            System.out.println("\nInput the score of student " + numberOfStudents);

            CalculateAndCheckPointsOfStudents();

            numberOfStudents = numberOfStudents - 1;

        }

        System.out.println("You inputed the last of students list!");

        // keyboard.close();

    }


    public static void LimitInputStudentLoops() {

        System.out.println("\n========== Do you want to input continue ==========");

        System.out.print("\nInput the numbers of students: ");

        int numberOfStudents = keyboard.nextInt();

        System.out.println("\nInput the score of student " + numberOfStudents);

        CalculateAndCheckPointsOfStudents();

        numberOfStudents = numberOfStudents - 1;

        if (numberOfStudents > 0) {

            do {

                System.out.println("\nDo you want to input continue?");
                System.out.println("- Press 1 to continue");
                System.out.println("- Press 0 to exit");

                System.out.print("Your choice: ");
                int keyStatement = keyboard.nextInt();

                switch (keyStatement) {

                case 1:

                    System.out.println("\nInput the score of student " + numberOfStudents);

                    CalculateAndCheckPointsOfStudents();

                    numberOfStudents = numberOfStudents - 1;

                    break;

                case 0:

                    System.out.println("\nThe program was closed. See you!");

                    keyboard.close();

                    System.exit(1);

                    break;

                default:

                    System.out.println("\nYour choice is invalid, please choose again!");

                    break;

                }

            } while (numberOfStudents > 0);

        } else {

            System.out.println("You inputed the last student!");

        }

        keyboard.close();

    }


    public static void UnlimitInputStudentLoops() {

        System.out.println("\n========== Do you want to input continue ==========");

        System.out.println("\nInput the score of student ");

        CalculateAndCheckPointsOfStudents();

        do {

            System.out.println("\nDo you want to input continue?");
            System.out.println("- Press 1 to continue");
            System.out.println("- Press 0 to exit");

            System.out.print("Your choice: ");
            int keyStatement = keyboard.nextInt();

            switch (keyStatement) {

            case 1:

                CalculateAndCheckPointsOfStudents();

                break;

            case 0:

                System.out.println("\nThe program was closed. See you!");

                keyboard.close();

                System.exit(1);

                break;

            default:

                System.out.println("\nYour choice is invalid, please choose again!");

                break;

            }

        } while (true);

    }


}