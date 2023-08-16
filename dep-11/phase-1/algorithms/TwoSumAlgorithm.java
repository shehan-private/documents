import java.util.Scanner;

public class TwoSumAlgorithm {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        do {
            int[] nums = {1, 3, -2, -1, 4, 5, 7};
            System.out.print("Enter the target number: ");
            int target = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if (i==j) continue;

                    if (nums[i] + nums[j] == target) {
                        System.out.println(nums[i]+"("+i+") + "+nums[j] +"("+j+") = " + target);
                    }
                }
            }
            
        } while (true);
        
        
    }
}
