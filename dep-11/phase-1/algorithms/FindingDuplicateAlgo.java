import java.util.Scanner;

public class FindingDuplicateAlgo {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        
        int[] nums = {1,2,55,-5,5,8,8,-88,7,4,2,5,7,6,-12,-45,8,9,-78};

        // do {

        //     System.out.print("Enter the number to search: ");
        //     int search = scanner.nextInt();
        //     scanner.nextLine();

        //     System.out.println();
        //     boolean flag = false;
        //     boolean found = false;
        //     for (int i = 0; i < nums.length; i++) {
        //         if(nums[i] == search) {
                    
        //             int initIndex = i;

        //             if (found) {
        //                 if (!flag) {
        //                     System.out.print("Duplicates are found at: " + initIndex+ ", ");
        //                     flag = true;
        //                     continue;
        //                 }
        //                 System.out.print(i+", ");
        //             }
        //             found = true;
        //         }
        //     }
        //     if (flag && found) {
        //         System.out.print("\b\b");
        //         System.out.print("  ");
        //         System.out.println();
        //         System.out.println();
        //     } 
        //     else if (!flag && !found) System.out.println(search + " does not exists.\n");
        //     else if (!flag && found) System.out.println("No duplicates found!\n");

        // } while (true);

        do {

            System.out.print("Enter the number to search: ");
            int search = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            
            int[] indexes = new int[nums.length];
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == search) {

                    indexes[count] = i;
                    count++;

                }
            }

            if (count>1) {
                System.out.println("number of duplicates found: "+count);
                System.out.print("Duplicates are found at: ");

                for (int j = 0; j < count; j++) {
                    System.out.print(indexes[j] + ", ");
                }
                System.out.print("\b\b");
                System.out.print("  ");
                System.out.println();
                System.out.println();
            }

            else if (count==1) System.out.println("No duplicates found\n");
            else if (count==0) System.out.println(search + " does not exist\n");

        } while (true);


    }
}
