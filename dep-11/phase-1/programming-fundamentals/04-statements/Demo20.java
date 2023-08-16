import java.util.Scanner;

public class Demo20 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean correct = true;
        String name = "";

        do {
            

            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            if (name.isBlank()){
                System.out.println("Name cannot be empty");
                
            }

        } while (name.isBlank());

        int x = 0;
        int marks;
        int subject1;
        int subject2;
        int subject3;

        do {
                
            System.out.printf("Enter your marks for subject-%s: ",x);
            marks = scanner.nextInt();
            scanner.nextLine();

            if (marks > 0 && marks < 100){
                x++;
                

            } else System.out.printf("Invalid input");

            if (x == 1) subject1 = marks;
            else if (x==2) subject2 = marks;
            else subject3 = marks;

        } while (x == 3);
            

            
            // marks = ddd-1;
        }
        
        
        


    
    
}
