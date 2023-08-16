import java.util.Arrays;
import java.util.Scanner;

public class InsertionAlgo {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] nums = {-10,-5,0,3,7,9};

        do {
            System.out.print("Enter a number: ");
            int insertion = scanner.nextInt();
            scanner.nextLine();

            int indexNums = 0;
            int indexNewArray = 0;
            int[] newArray = new int[nums.length+1];

            for (; indexNewArray < newArray.length; indexNewArray++) {
                if (indexNewArray == newArray.length-1 && nums[indexNums-1] < insertion) {
                    newArray[indexNewArray] = insertion;
                    break;
                }
                if (nums[indexNums] < insertion){
                    newArray[indexNewArray] = nums[indexNums];
                    indexNums++;
                } else {
                    newArray[indexNewArray] = insertion;
                    insertion = nums[nums.length-1] + 1;
                }
            }

            System.out.println(Arrays.toString(newArray));

        } while (true);
        



    }
}
