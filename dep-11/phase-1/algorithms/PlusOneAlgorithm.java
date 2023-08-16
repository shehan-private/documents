import java.util.Arrays;

public class PlusOneAlgorithm {
    public static void main(String[] args) {

        int[] nums = {8,9,9,9,9,9,9};

        int number = 0;
        int pow = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            number+=nums[i]*pow;
            pow*=10;
        }

        number++;
        int newNumLength;
        if (number/pow > 0) newNumLength = nums.length+1;
        else {
            newNumLength = nums.length;
            pow/=10;
        }

        int[] newNum = new int[newNumLength];
        
        for (int i = 0; i < nums.length; i++) {
            newNum[i] = number/pow;
            number-=(newNum[i]*pow);
            pow/=10;
        }
        
        System.out.println(Arrays.toString(newNum));
    }
}
