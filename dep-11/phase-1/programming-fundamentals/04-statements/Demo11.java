import java.util.Scanner;

public class Demo11 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter a number between 1 to 5: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        mySwitch:
        switch( num * num) {
            case 2 * 2 :{
                System.out.println("2 ^ 2");
                break mySwitch;
            } 

            case 3 * 3:
                lbl1 :{
                System.out.println("3 ^ 3");
                break lbl1;
            } 

            case 4 * 4 : {
                System.out.println("4 ^ 4");
                break;
            }   

            case 5 * 5:lbl2 : {
                System.out.println("5 ^ 5");
                break lbl2;
            }

            case 1 * 1 : {
                System.out.println("1 ^ 1");
                break;
            } 

            default :
            System.out.println("Invalid number");
        }



    }
}
