import java.util.Scanner;

public class App3{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String[][] customers = new String[0][];

        String id;
        String name;
        String address;
        do {

            System.out.println("----------------------------------------------------------");

            for (int i = 0; i < customers.length; i++) {
                System.out.printf("|%5s|%10s|%20s",customers[0][i],customers[1][i],customers[2][i]);
            }

            System.out.println("----------------------------------------------------------");

            System.out.print("\nEnter Cutomer ID: ");
            id = scanner.nextLine().strip();

            System.out.print("\nEnter Customer Name: ");
            name = scanner.nextLine().strip();

            System.out.print("\nEnter Customer Address: ");
            address = scanner.nextLine().strip();

            String [][] newCustomers = new String[customers.length+1][0];

            int i;
            for (i = 0; i < newCustomers.length; i++) {
                newCustomers[i] = customers[i];
            }
            
            newCustomers[0][i] = id;
            newCustomers[1][i] = name;
            newCustomers[2][i] = address;

            customers = newCustomers;
            
        } while (true);
    }    
}