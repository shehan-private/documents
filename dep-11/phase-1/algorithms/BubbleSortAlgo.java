import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] nums = {-5,2,3,1,7,-5,0,2,2,6,4};
        // int[] nums = {};

        int length = nums.length;
        while (length != 0) {
            for (int i = 0; i < length-1; i++) {
                if (nums[i] > nums[i+1]) {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                }
            }
            length-=1;
        };
        System.out.println(Arrays.toString(nums));
    }
}
