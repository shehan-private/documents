import java.util.Scanner;

public class LinearSearchAlgo2 {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        
        String[] names = {"Kasun", "Nuwan", "Ruwan", "Supun", "Upul", "Nimal"};

        loop:
        do {

            System.out.print("Enter the number to search: ");
            String search = scanner.nextLine();

            for (int i = 0; i < names.length; i++) {
                if(names[i].equalsIgnoreCase(search)) {
                    System.out.println("Found at index: "+i);
                    continue loop;

                }
            }
            System.out.println("Not found!");


        } while (true);



    }
}
