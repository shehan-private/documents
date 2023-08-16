import java.util.Scanner;

public class Demo25 {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) throws InterruptedException {

        // String name="Kasun Sampath";

        String name = "";

        System.out.println();
        
        for (; name.isBlank();){

            System.out.println();
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // String greeting = String.format("Hello %s...",name);

        String greeting1 = "Hello "+name+"...";
        String greeting2 = "Welcome to DEP-10...";
        String greeting3 = "We are born to code";
        String greeting = "";


        for (int itr2 = 0; itr2 < 3; itr2++) {

            if (itr2 == 0) greeting =greeting1;
            else if (itr2 == 1) greeting = greeting2;
            else greeting = greeting3;

            for (int itr = 0; itr < greeting.length(); itr++) {
                System.out.print(greeting.charAt(itr));
                Thread.sleep(100);
            }

            Thread.sleep(3000);
            
            System.out.printf("\b".repeat(greeting.length()));
            System.out.printf(" ".repeat(greeting.length()));
            
        }

        System.out.println();




    }
}
