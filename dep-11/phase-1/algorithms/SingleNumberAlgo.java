public class SingleNumberAlgo {
    public static void main(String[] args) {
        int[] nums = {2,6,3,4,5,4,2,5,1,6,1,6,4};

        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            for (; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] == nums[j]) break;
            }
            if (j == nums.length) System.out.println("Single number: " + nums[i] + "\nIndex: " + i);
        }

    }
}
