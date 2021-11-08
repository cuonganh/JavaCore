import java.util.Scanner;

public class Movie {

    /*
     * pseudocode 
     * 
     * START 
     * 
     * PROGRAM MovieChecker 
     * 
     * Create variable numPeople 
     * Ask the user for numPeople
     * READ INPUT into numPeople
     * 
     * DO
     * Create variable ageOfpeople
     * Ask the user for ageOfpeople
     * READ INPUT into ageOfpeople
     * IF the age's person is less than 16
     * PRINT "You do not watch this film"
     * ELSE "Welcome to 16+ film zone. Please help your self"
     * DECREASE numPeople
     * WHILE numPeople is great than 0
     * ENDWHILE
     * 
     * END
     * 
     */

    public static void MovieCheker() {

        Scanner keyScanner = new Scanner(System.in);
        System.out.println("\nInput the number of the people: ");
        int numPeople = keyScanner.nextInt();
        int ageOfpeople;

        do {

            System.out.print("\nInput age of the person " + numPeople + ": ");
            ageOfpeople = keyScanner.nextInt();

            if (ageOfpeople < 16) {
                System.out.println("You do not watch this film. You are too young.");
                System.out.println("You can watch this film after " + (16 - ageOfpeople) + " years when you are 16 years old");
            } else {
                System.out.println("Welcome to 16+ film zone. Please help your self");
            }

            numPeople = numPeople - 1;

        } while (numPeople > 0);

        keyScanner.close();

    }

}
