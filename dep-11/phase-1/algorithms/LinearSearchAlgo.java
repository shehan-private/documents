import java.util.Scanner;

public class LinearSearchAlgo {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        
        int[] nums = {10,20,30,45,87,96,-24,-45,78,45,98,-14,12};

        loop:
        do {

            System.out.print("Enter the number to search: ");
            int search = scanner.nextInt();
            scanner.nextLine();

            // boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == search) {
                    System.out.println("Found at index: "+i);
                    continue loop;
                    // found = true;
                    // break;
                }
            }
            // if (!found) System.out.println("Not found!");
            System.out.println("Not found!");


        } while (true);



    }
}