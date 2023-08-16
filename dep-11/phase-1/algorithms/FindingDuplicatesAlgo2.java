import java.util.Scanner;

public class FindingDuplicatesAlgo2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        do {
            System.out.print("Enter a text: ");
            String search = scanner.nextLine();

            char[] chars = search.toLowerCase().toCharArray();

            loop:
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ') continue;
                int count = 0;
                
                for (int j = 0; j < chars.length; j++) {

                    if (chars[i] == chars[j]) {
                        if (j < i) continue loop;
                        count++;
                    }
                }
                if (count>1) System.out.println(chars[i] + "-" +count);
            }

        } while (true);
    }
}
