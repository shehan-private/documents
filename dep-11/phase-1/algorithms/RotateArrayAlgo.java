import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayAlgo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5};

        do {
            System.out.print("Enter a number to rotate: ");
            int rotate = scanner.nextInt();
            scanner.nextLine();

            // if (rotate > 0) {
            //     for (int i = 0; i < rotate; i++) {
            //         int tempNum1 = nums[nums.length-1];
            //         int j;
            //         for (j = nums.length-1; j > 0; j--) {
            //             nums[j] = nums[j-1];  
            //         }
            //         nums[j] = tempNum1;
            //     }
            // } else if (rotate < 0) {
            //     for (int i = 0; i > rotate; i--) {
            //         int tempNum1 = nums[0];
            //         int j;
            //         for (j = 0; j < nums.length-1; j++) {
            //             nums[j] = nums[j+1];  
            //         }
            //         nums[j] = tempNum1;
            //     }
            // }


            int i;
            if (rotate > 0) i = 1;
            else if (rotate < 0) i = -1;
            else i = 0;

            while (i!=rotate) {
                int tempNum = nums[0];
                for (int j = 0; j < nums.length; j++) {
                    
                }
                i+=i;
            }

            System.out.println(Arrays.toString(nums));
            
            
        } while (true);
        

    }
}
