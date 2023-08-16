import java.util.Scanner;

public class assignment3 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        String marks1;
        String marks2;
        String marks3;

        final String COLOR_RED_BOLD;
        final String RESET;

        final String ERROR_MSG = String
                                .format("%s%s%s \n", COLOR_RED_BOLD,"%s", RESET);

        System.out.printf("Enter your name: ");

        name = scanner .nextLine().strip();

        if (name.length() == 0){

            System.out.printf(ERROR_MSG, "Name cannot be empty");
            // System.out.printf("%sName cannot be empty", COLOR_RED_BOLD, RESET);
            System.exit(1); // The integer is the exit code

            // isBlank() -> strip() and then check if the length() == 0;
            // isEmpty() -> Consider the wight spacing alos


            // scanner.skip(Sstem.lineSeperator()); (Can consume the new line character)
        };
        

        
    }
}