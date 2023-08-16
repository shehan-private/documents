import java.util.Scanner;

public class Demo9 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // inside a block inside a type is called local

        //  switch can be only used with 
        // byte, short, char, int
        // Byte Short Character Integer
        // String, Enum

        // every switch can be replaced with if. But cannot do wise versa

        /* 

            Switch labels should be constant expressions or enum number
         
            switch (expression) {

                switchLabel1:
                switchLabel2:
                switchLabel3:
                default: // can be present at anywhere but as a best practice, place it at the bottom


            }


         */

            /* 
             * A = Distinguished Pass
             * B = Credit pass
             * C = Pass
             * W - Fail
             * 
             */



            System.out.print("Enter your grade: ");
            char grade = scanner.nextLine().strip().charAt(0);

            // if (grade == 'A') System.out.println("Distinguished Pass");
            // else if (grade == 'B') System.out.println("Credit Pass");
            // else if (grade == 'C') System.out.println("Pass");
            // else if (grade == 'W') System.out.println("Fail");
            // else System.out.println("Invalid");


            switch (grade){
                case 'A': 
                    System.out.println("Distinguished Pass"); 
                    break;
                case 'B': 
                    System.out.println("Credit Pass");
                    break;
                case 'C': 
                    System.out.println("Pass");
                    break;
                case 'W': 
                    System.out.println("Fail");
                    break;
                default: System.out.println("Invalid");
            }

            System.out.println("Just after switch statement");

            // Can replace 'A' with (60+5);
            // cannot provide a variable
            // Can use case (myAgrade + 5):
            // switch (expression or variable)

            /* 
             * 
             * 
             * 
             * 
             * 
             */

    }
}
