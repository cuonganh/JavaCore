import java.util.Scanner;

public class Triangle {
    /*
     * pseudocode 
     * 
     * START 
     * 
     * PROGRAM TriangleChecker 
     * 
     * Create variables: num1, num2, num3 
     * 
     * DO
     * Ask the user for num1, num2, num3
     * READ INPUT into num1, num2, num3
     * 
     * Create variables: keyScanner
     * Ask the user do you want to continue
     * READ INPUT into keyScanner
     * IF keyScanner means Yes
     * Check the number num1, num2, num3 is a triangle
     * IF the sum of any 2 numbers is greater than the other
     * PRINT they are a triangle
     * ELSE
     * PRINT they are not a triangle
     * EXIT proram
     * WHILE true
     * ENDWHILE
     * 
     * END
     * 
     */

     public static void TriangleChecker() {

        System.out.println("\n========== Triangle checker ==========");

        var numScanner = new Scanner(System.in);

        do {

            System.out.println("\nDo you want to input continue?");
            System.out.println("- Press 1 to continue");
            System.out.println("- Press 0 to exit");

            System.out.print("Your choice: ");
            int keyStatement = numScanner.nextInt();

            switch (keyStatement) {

            case 1:
        
            System.out.println("\nInput 3 real numbers:");
            System.out.print("Number 1: ");
            Double num01 = numScanner.nextDouble();
            System.out.print("Number 2: ");
            Double num02 = numScanner.nextDouble();
            System.out.print("Number 3: ");
            Double num03 = numScanner.nextDouble();
        
            if(num01 + num02 > num03 && num01 + num03 > num02 && num02 + num03 > num01){

                System.out.println(num01 + ", " + num02 + " and " + num03 + " are a triangle.");

            }else{

                System.out.println("Three numbers are not a triangle");

            }

                break;

            case 0:

                System.out.println("\nThe program was closed. See you!");

                numScanner.close();

                System.exit(1);

                break;

            default:

                System.out.println("\nYour choice is invalid, please choose again!");

                break;

            }


        } while (true);

    }
     

}
