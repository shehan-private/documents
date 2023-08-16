import java.util.Arrays;
import java.util.Scanner;

public class App1 {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {

        final String COLOR = "\033[032m";
        final String RED_COLOR = "\033[031m";
        final String BOLD = "\033[1m";
        final String RESET = "\033[0m";
        final String CLEAR = "\033[H\033[2J";
        

        final String DASHBOARD = "Welcome to SMS";
        final String ADD_STUDENT = "Add New Student";
        final String REMOVE_STUDENT = "Remove Student";
        final String PRINT_DETAILS = "Print Student Details";

        String[] students = new String[0];

        String screen = DASHBOARD;

        do {
            final String APPTITLE = screen;
            System.out.println(CLEAR);
            System.out.println(COLOR);
            System.out.println(BOLD);
            System.out.println("-".repeat(30));
            System.out.println(" ".repeat((30-APPTITLE.length())/2).concat(APPTITLE));
            System.out.println("-".repeat(30));
            System.out.println(RESET);

            switch (screen){
                case DASHBOARD:
                    System.out.println(COLOR);
                    System.out.println("1. Add Student\n2. Remove Student\n3. Print Students\n4. Exit\n");

                    System.out.print("Enter an option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(RESET);
                    System.out.println();

                    switch (option) {
                        case 1: screen = ADD_STUDENT; break;
                        case 2: screen = REMOVE_STUDENT; break;
                        case 3: screen = PRINT_DETAILS; break;
                        case 4: System.exit(0); break;
                        default: continue;
                    }
                    break;
                
                case ADD_STUDENT:

                    
                    int student_id = students.length+1;

                    System.out.println(COLOR);
                    System.out.printf("1. New Student ID: S%03d\n", student_id);
                    
                    boolean valid;
                    String student;

                    //Take student name and validation
                    do {
                        valid = true;
                        System.out.printf("%s2. Enter Student Name: ",COLOR);
                        student = scanner.nextLine().strip();

                        //chacking blank content
                        if (student.isBlank()){
                            System.out.printf("%s%sName cannot be empty%s\n",RED_COLOR,BOLD,RESET);
                            valid = false;
                            continue;
                        }
                        
                        //Checking ASCII
                        for (int i = 0; i < student.length(); i++) {
                            if (!(Character.isLetter(student.charAt(i)) || Character.isSpaceChar(student.charAt(i)))) {
                                System.out.printf("%s%sNot valid%s\n",RED_COLOR,BOLD,RESET);
                                valid = false;

                                break;
                            }
                        }
                        
                    } while (!valid);
                    
                    //Storing data
                    String[] tempStudents = new String[students.length+1];

                    int index;
                    for (index = 0; index < students.length; index++) {
                        tempStudents[index] = students[index];
                    }
                    tempStudents[index] = student;
                    students = tempStudents;

                    System.out.println(Arrays.toString(students));

                    System.out.print("\nStudent Added successfully. Do you want to add new student (y/n)? ");
                    String option_student = scanner.nextLine();
                    System.out.print(RESET);

                    if (option_student.strip().toUpperCase().equals("Y")) screen = DASHBOARD;
                    break;

                case PRINT_DETAILS:
                    if (students.length == 0) {
                        System.out.printf("%sNo students records available.%s",RED_COLOR, RESET);

                    } else {

                        final String LINE = "+" + "-".repeat(6) + "+" + "-".repeat(10) + "+";

                        for (int i = 0; i < students.length; i++) {
                            System.out.printf("|%s | %s", student_id, students[i]);
                        }


                    }
                    System.out.printf("%sDo you want to go back (y/n)? ",COLOR);
                    String output = scanner.nextLine().strip().toUpperCase();
                    if (output.equals("Y")) {
                        screen = DASHBOARD;
                        break;
                    }

                default: System.exit(1);

            }
 
        } while (true);
        
    }
}