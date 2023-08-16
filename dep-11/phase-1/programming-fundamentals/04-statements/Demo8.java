import java.util.Scanner;

public class Demo8 {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        /* Syntax 1
         * if (bolean expression) statement;
         * 
         * Syntax 2
         * 
         * if (boolean expression) statement;
         * {
         *  else if (boolean expression) statement;
         *  else if (boolean expression) statement;
         * ......
         * }
         * {
         *  else statement
         * 
         * }
         * 
         * Syntax 3
         * 
         * if (boolean expression) {
         *  statement 1;
         *  statement 2;
         * .....
         * } else if (boolean expression) {
         *  statement 1;
         *  statement 2;
         * 
         * } else {
         *  statement 1;
         * 
         * }
         * 
         * 
         */

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (name.length() > 0) System.out.printf("Your name is %s \n",name); // if single statement only use in the same line
            else System.out.println("Invalid name");

            System.out.println("------------------");


            /* 
             * if (name.length() > 0) 
             *  System.out.printf("Your name is %s",name); // bad practice
             */



             // Homework
             /* 
              
                Enter your name: | Just enter or only spaces: Invalid name (Red color)
                Enter your age: | if age is less than 10 or greater than 18 - Invalid age (red)
                Enter your subject 1: | All subjects are start with SE- and 3 digit subject code 1 // SE-1 : invalid subject
                Enter your marks 1: | (0-100) : invalid name
                Enter your subject 2:
                Enter your marks 2:
                Enter your subject 3:
                Enter your marks 3:

                strip()
                startswith()
                String substring()
                endswith()


              */

    }
}
