import java.util.Scanner;

public class Demo7 {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // Standard output -> Screen    -> System.out
        // Standard error  -> Screen    -> System.err
        // Standard input  -> Keyboard  -> System.in

        // System.out.println("Hello");
        // System.err.println("IJSE");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hi! Welcome %s \n", name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.printf("Your age is %s \n", age);

    }
}
