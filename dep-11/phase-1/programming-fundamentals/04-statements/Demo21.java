import java.util.Scanner;

public class Demo21 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        String num;
        boolean submit=false;
        int number = -1;
        int optionNum = 0;
        final String GREEN = "\033[042m";
        final String COLOR = "\033[032m";
        final String RESET = "\033[0m";
        
        do {
            System.out.println();
            System.out.print("Enter a number between (0-100): ");
            num = scanner.nextLine();

            if (num.isBlank()) {
                submit= false;
                continue;
            }

            number = Integer.parseInt(num);

            if (number < 0 || number > 100) {
                System.out.println("Invalid range");
                submit = false;
                continue;
            } else submit = true;

        } while (!submit);

        submit = false;

        do {
            System.out.println();
            System.out.println("Select an option: ");
            System.out.println("(1) Fast");
            System.out.println("(2) Medium");
            System.out.println("(3) Slow");
            System.out.print("Enter your option: ");
            String option = scanner.nextLine();
            if (option.isBlank()) {
                submit= false;
                continue;
            }

            optionNum = Integer.parseInt(option);

            if (optionNum < 1 || optionNum > 3) {
                System.out.println("\nInvalid range");
                submit = false;
                continue;
            } else submit = true;

        } while(!submit);
        System.out.println();

        int itr = 0;
        do {

            String progress = GREEN+ String.format(" ".repeat(itr)) + RESET;
            String reset = String.format("\b".repeat(109));
        
            System.out.printf("%s", reset);
            System.out.printf("[%s",progress);
            System.out.printf(" ".repeat(100-itr));
            System.out.printf("] %.2f%%",(itr/100.0*100));

            int speed;
            if (optionNum == 1) speed = 500;
            else if(optionNum == 2) speed = 1000;
            else speed = 2000;

            Thread.sleep(speed);

            

        } while (itr++ < number);
        System.out.println(COLOR + "\n\nCompleted!\n" + RESET);


    }
}
