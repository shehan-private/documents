import java.util.Scanner;

public class BinarySearchAlgoDoWhile {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] nums = {-5, -2, 0, 3, 5, 8, 11};
        System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();
        scanner.nextLine();

        int left = 0;
        int right = nums.length;

        do {
            int mid = (left + right)/2;
            if (nums[mid] == search) {
                System.out.println("Index: " + mid);
                break;
            } else if (nums[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        } while (true);

    }

}