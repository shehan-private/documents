import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int [] nums = {-5,7,3,-8,4,4,0,3,50,-20};

        // for (int i = 0; i < nums.length; i++) {
        //     int lowIndex = i;
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[lowIndex] > nums[j]) {
        //             lowIndex = j;
        //         } 
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[lowIndex];
        //     nums[lowIndex] = temp;
        // }

        for (int i = 0; i < nums.length; i++) {
            int highIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[highIndex] > nums[j]) {
                    highIndex = j;
                } 
            }
            int temp = nums[i];
            nums[i] = nums[highIndex];
            nums[highIndex] = temp;
        }


        System.out.println(Arrays.toString(nums));
    }
}
