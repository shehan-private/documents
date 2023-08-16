import java.util.Arrays;

public class InsertSortAlgo {
    public static void main(String[] args) {
        // 1. InsertSortAlgo (Linear search)
        
/* 
        int[] nums = {3,-2,-5,7,-5,4,2,4,6,-3};

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) continue;

            // Finding the position via linear search
            for (int j = 0; j < i; j++) {

                if (nums[j] > nums[i]) {

                    //Shifting
                    int temp = nums[i];
                    for (int k = i; k > j; k-- ){
                        nums[k] = nums[k-1];
                    }
                    nums[j] = temp;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
*/
        // 2. InsertSortAlgo (Binary search)

        int[] nums = {3,-2,-5,7,-5,4,2,4,6,-3};

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) continue;

            // Finding the position via linear search

            int left = 0;
            int right = i;
            do {
                int mid = (left+right)/2;
                if (nums[mid] < nums[i]) left = mid+1;
                else if (nums[mid] > nums[i]) right = mid;
                else {
                    left = mid;
                    break;
                }
            } while (left != right);

            int insertionPosition = left;

            //Shifting
            int temp = nums[i];

            for (int k = i; k > insertionPosition; k-- ){
                nums[k] = nums[k-1];
            }
            nums[insertionPosition] = temp;
            break;
        }

        System.out.println(Arrays.toString(nums));
    }
}
