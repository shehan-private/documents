import java.util.Scanner;

public class App4 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String BLUE_COLOR = "\033[034;1m";
        final String RED_COLOR = "\033[031;1m";
        final String GREEN_COLOR = "\033[032;1m";
        final String RESET = "\033[0m";
        final String CLEAR = "\033[H\033[2J";
        final String ERROR_MSG = String.format("\n\t%s%s%s\n", RED_COLOR,"%s",RESET);
        final String SUCCESS_MSG = String.format("\n\t%s%s%s\n", GREEN_COLOR,"%s",RESET);
        final String APP_MARGIN = String.format("\n\t%s%s%s\n", BLUE_COLOR,"%s",RESET);
        
        final String DASHBOARD = "Welcome to DEP-11 Phase 1";
        final String ADD_MARKS = "Add Assignment Marks";
        final String PRINT_MARKS = "Print Assignment Marks";
        final String EXIT = "Exit App";

        // int[] accountIds = {1,2,3};
        // String[] accountNames = {"Suresh Mahanama","Sanath Jayasuriya","Avishka Gunawardene"};
        // double[] accountBalances = {50000,75000,95000};

        // String[][] students = new String[0][3];

        String[][] students = {{"DEP-01","Shehan Rathnayake","88.56"},{"DEP-02","Kamal Rajapakshe","57.56"},{"DEP-03","Sugath Ranjan","68.75"},{"DEP-04","Ajith Bandara","37.35"}};

        // int[] accountIds = new int[0];
        // String[] accountNames = new String[0];
        // double[] accountBalances = new double[0];

        String screen = DASHBOARD;

        do {
            final String APPTITLE = screen;
            System.out.println(CLEAR);
            System.out.printf(APP_MARGIN, APPTITLE);

            mainSwitch:
            switch (screen){
                case DASHBOARD:
                    System.out.printf("\n\t[1]. %s\n\t[2]. %s\n\t[3]. Exit\n", ADD_MARKS,PRINT_MARKS,EXIT);
                    System.out.print("\n\n\tEnter an option to continue: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    // System.out.println(RESET);
                    System.out.println();
                    System.out.println();

                    switch (option) {
                        case 1: screen = ADD_MARKS; break;
                        case 2: screen = PRINT_MARKS; break;
                        case 3: screen = EXIT; break;
                        default:
                    }
                    break;

                case ADD_MARKS:

                    boolean valid;
                    String studentId;
                    // Validating customer ID
                    studentIdLoop:
                    do {
                        valid = true;
                        System.out.printf("\n\t1. Enter Student ID: ");
                        studentId = scanner.nextLine().strip();

                        //checking blank content
                        if (studentId.isBlank()){
                            System.out.printf(ERROR_MSG,"Student name cannot be empty");
                            valid = false;
                            
                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            String answer = scanner.nextLine().strip().toUpperCase();

                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        //Checking format validity
                        if (studentId.length() != 6 || !studentId.startsWith("DEP-")){
                            System.out.printf(ERROR_MSG, "Invalid student ID");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            String answer = scanner.nextLine().strip().toUpperCase();

                            if (answer.equals("Y")) continue studentIdLoop;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        String digits = studentId.substring(4,6);
                        // System.out.println(digits);

                        for (int i = 0; i < digits.length(); i++) {
                            if (!Character.isDigit(digits.charAt(i))) {
                                System.out.printf(ERROR_MSG, "Invalid student ID");
                                valid = false;

                                System.out.print("\n\tDo you want to continue (Y/n)? ");
                                String answer = scanner.nextLine().strip().toUpperCase();

                                if (answer.equals("Y")) continue studentIdLoop;
                                else {
                                    screen = DASHBOARD;
                                    break mainSwitch;
                                }
                            }
                        }

                        //Checking exisiting ID
                        for (int i = 0; i < students.length; i++) {
                            if (students[i][0].equals(studentId)) {
                                System.out.printf(ERROR_MSG, "Student Id exisits");
                                valid = false;

                                System.out.print("\n\tDo you want to continue (Y/n)? ");
                                String answer = scanner.nextLine().strip().toUpperCase();

                                if (answer.equals("Y")) continue studentIdLoop;
                                else {
                                    screen = DASHBOARD;
                                    break mainSwitch;
                                }
                            }
                        }
                    } while (!valid);

                    //Enter Student name
                    String studentName;

                    studentNameLoop:
                    do {
                        valid = true;
                        System.out.printf("\n\t[2]. Enter Student name: ");
                        studentName = scanner.nextLine().strip();

                        //checking blank content
                        if (studentName.isBlank()){
                            System.out.printf(ERROR_MSG,"Student name cannot be empty");
                            valid = false;
                            
                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            String answer = scanner.nextLine().strip().toUpperCase();

                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        //Checking validity of Student name
                        for (int i = 0; i < studentName.length(); i++) {
                            if (!(Character.isLetter(studentName.charAt(i)) )) {
                                if (!(Character.isSpaceChar(studentName.charAt(i)))) {
                                    System.out.printf(ERROR_MSG, "Invalid account name");
                                    valid = false;

                                    System.out.print("\n\tDo you want to continue (Y/n)? ");
                                    String answer = scanner.nextLine().strip().toUpperCase();

                                    if (answer.equals("Y")) continue studentNameLoop;
                                    else {
                                        screen = DASHBOARD;
                                        break mainSwitch;
                                    }
                                }
                            }
                        }

                    } while (!valid);

                    //Enter students marks
                    double studentMarks;
                    do {
                        valid = true;
                        System.out.print("\t[3]. Enter Marks: ");
                        studentMarks = scanner.nextDouble();
                        scanner.nextLine();
        
                        //Validating marks
                        if (studentMarks < 0 || studentMarks >100) {
                            System.out.printf(ERROR_MSG, "Marks out of range");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            String answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }
                        
                    } while (!valid);

                    // Storing data into array

                    String[][] newStudents = new String[students.length+1][3];

                    int index = 0;
                    for (int i = 0; i < students.length; i++) {
                        for (index = 0; index < students[0].length; index++) {
                            newStudents[i][index] = newStudents[i][index];
                        }
                    }

                    newStudents[index][0] = studentId;
                    newStudents[index][1] = studentName;
                    newStudents[index][2] = studentMarks+"";


                    // Success message & Asking to add another customer
                    System.out.printf(SUCCESS_MSG,String.format("Marks for student ID %s has been created successfully.", studentId));
                    System.out.print("\n\tDo you want to add another new customer (Y/n)? ");
                    String answer = scanner.nextLine().strip().toUpperCase();

                    if (answer.equals("Y")) continue;
                    else {
                        screen = DASHBOARD;
                        break;
                    }
 
                case PRINT_MARKS:
                    if (students.length == 0) {
                        System.out.printf(ERROR_MSG, "No student records available.");

                    } else {
                        //Sorting the array
                        if (students.length > 1) {
                            for (int i = 0; i < students.length; i++) {
                                
                                for (int j = i+1; j < students.length-2; j++) {
                                    double studentMark1 = Double.parseDouble(students[j-1][2]);
                                    double studentMark2 = Double.parseDouble(students[j][2]);
                                    if(studentMark1 > studentMark2) {
                                        String[][] temp = new String[1][3];
                                        temp[0][0] = students[j][0];
                                        temp[0][1] = students[j][1];
                                        temp[0][2] = students[j][2];

                                        students[j][0] = students[j+1][0];
                                        students[j][1] = students[j+1][1];
                                        students[j][2] = students[j+1][2];

                                        students[j+1][0] = temp[0][0];
                                        students[j+1][1] = temp[0][1];
                                        students[j+1][2] = temp[0][2];
                                    }
                                }
                            }
                        }
                        
                        //Displaying marks
                        for (int i = 0; i < students.length; i++) {
                            
                        }

                        //Displaying table
                        final String LINE = "+" + "-".repeat(12) + "+" + "-".repeat(18) + "+" + "-".repeat(50) + "+";

                        System.out.println(LINE);
                        System.out.printf("|%-12s|%-18s|%-50s|\n", "Student Id", "Student name","Student marks");
                        System.out.println(LINE);

                        String GREEN = String.format("\033[032;0m \033[03;m");
                        for (int i = 0; i < students.length; i++) {

                            double marks = Double.parseDouble(students[i][2]);
                            String grade;
                            String color;
                            if (marks>75) {
                                grade = "A";
                                color = GREEN;
                            }
                            else if (marks>65) {
                                grade = "B";
                                color = BLUE;
                            }
                            else if (marks>55) {
                                grade = "C";
                                color = YELLOW;
                            }
                            else {
                                grade = "F";
                                color = RED;
                            }

                            double emptySpace = 100-marks;
                            String graph = String.format("[%s%s]",color,emptySpace);

                            System.out.printf("|%-12s|%-18s|%-50s|\n", students[i][0], students[i][1], grade+" "+String.format("%.2f%%",marks));
                        }
                        System.out.println(LINE);


                    }
                    System.out.printf("Do you want to go back (y/n)? ");
                    String output = scanner.nextLine().strip().toUpperCase();
                    if (output.equals("Y")) {
                        screen = DASHBOARD;
                        break;
                    }
/* 
                    // Enter A/C No
                    index = -1;
                    accNoLoop:
                    do {
                        valid = true;
                        System.out.print("\n\tEnter A/C No: ");
                        String accNo = scanner.nextLine().strip();
                        
                        // Checking blank A/C No
                        if (accNo.isBlank()) {
                            System.out.printf(ERROR_MSG, "A/C No cannot be empty");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        // Checking A/C length and format
                        if (accNo.length() != 9 || !accNo.substring(0, 4).equals("SDB-")) {
                            System.out.printf(ERROR_MSG, "Invalid A/C No");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        // Checking last 5 digits
                        String accNoSub = accNo.substring(4);
                        // System.out.println(Integer.parseInt(accNoSub));
                        // System.out.println(accNoSub);
                        for (int i = 0; i < 5; i++) {
                            if (!Character.isDigit(accNoSub.charAt(i))) {
                                System.out.printf(ERROR_MSG, "Invalid A/C No");
                                valid = false;

                                System.out.print("\n\tDo you want to continue (Y/n)? ");
                                answer = scanner.nextLine().strip().toUpperCase();
                                System.out.println();
                                if (answer.equals("Y")) continue accNoLoop;
                                else {
                                    screen = DASHBOARD;
                                    break mainSwitch;
                                }
                            }
                        }

                        // Check existing A/C No
                        
                        for (int i = 0; i < accountIds.length; i++) {
                            if (accountIds[i] == Integer.parseInt(accNoSub)){
                                index = i;
                                break;
                            }
                        }
                        if (index == -1) {
                            System.out.printf(ERROR_MSG, "A/C not exists");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                    } while (!valid);
                    
                    System.out.println("\n\tName: " + accountNames[index]);
                    System.out.printf("\n\tAccount Balance: Rs.%.2f\n", accountBalances[index]);

                    double deposit = 0;
                    do {
                        valid = true;
                        System.out.print("\n\tDeposit Amount: Rs.");
                        deposit = scanner.nextDouble();
                        scanner.nextLine();

                        if (deposit < 500){
                            System.out.printf(ERROR_MSG, "Minimum deposit amount is Rs.500.00");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }
                    } while (!valid);

                    // Updating the account balance and display
                    accountBalances[index] += deposit;
                    System.out.printf(SUCCESS_MSG,"Money Deposited successfully..");
                    System.out.printf("\n\tNew Balance: Rs. %.2f\n", accountBalances[index]);

                    System.out.print("\n\tDo you want to continue (Y/n)? ");
                    answer = scanner.nextLine().strip().toUpperCase();
                    System.out.println();

                    if (answer.equals("Y")) continue;
                    else {
                        screen = DASHBOARD;
                        break mainSwitch;
                    }

                case WITHDRAW_MONEY:

                    // Enter A/C No
                    index = -1;
                    accNoLoop:
                    do {
                        valid = true;
                        System.out.print("\n\tEnter A/C No: ");
                        String accNo = scanner.nextLine().strip();
                        
                        // Checking blank A/C No
                        if (accNo.isBlank()) {
                            System.out.printf(ERROR_MSG, "A/C No cannot be empty");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        // Checking A/C length and format
                        if (accNo.length() != 9 || !accNo.substring(0, 4).equals("SDB-")) {
                            System.out.printf(ERROR_MSG, "Invalid A/C No");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        // Checking last 5 digits
                        String accNoSub = accNo.substring(4);
                        // System.out.println(Integer.parseInt(accNoSub));
                        // System.out.println(accNoSub);
                        for (int i = 0; i < 5; i++) {
                            if (!Character.isDigit(accNoSub.charAt(i))) {
                                System.out.printf(ERROR_MSG, "Invalid A/C No");
                                valid = false;

                                System.out.print("\n\tDo you want to continue (Y/n)? ");
                                answer = scanner.nextLine().strip().toUpperCase();
                                System.out.println();
                                if (answer.equals("Y")) continue accNoLoop;
                                else {
                                    screen = DASHBOARD;
                                    break mainSwitch;
                                }
                            }
                        }

                        // Check existing A/C No
                        
                        for (int i = 0; i < accountIds.length; i++) {
                            if (accountIds[i] == Integer.parseInt(accNoSub)){
                                index = i;
                                break;
                            }
                        }
                        if (index == -1) {
                            System.out.printf(ERROR_MSG, "A/C not exists");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                    } while (!valid);
                    
                    System.out.println("\n\tName: " + accountNames[index]);
                    System.out.printf("\n\tAccount Balance: Rs.%.2f\n", accountBalances[index]);

                    double withdraw = 0;
                    do {
                        valid = true;
                        System.out.print("\n\tWithdraw Amount: Rs.");
                        withdraw = scanner.nextDouble();
                        scanner.nextLine();

                        if (withdraw < 100){
                            System.out.printf(ERROR_MSG, "Minimum deposit amount is Rs.100.00");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();
                            System.out.println();
                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                        if ((accountBalances[index] - withdraw) < 500){
                            System.out.printf(ERROR_MSG, "Insufficient account balance");
                            valid = false;

                            System.out.print("\n\tDo you want to continue (Y/n)? ");
                            answer = scanner.nextLine().strip().toUpperCase();

                            if (answer.equals("Y")) continue;
                            else {
                                screen = DASHBOARD;
                                break mainSwitch;
                            }
                        }

                    } while (!valid);

                    // Updating the account balance and display
                    accountBalances[index] -= withdraw;
                    System.out.printf(SUCCESS_MSG,"Money withdrawal process successfull..");
                    System.out.printf("\n\tNew Balance: Rs. %.2f\n", accountBalances[index]);

                    System.out.print("\n\tDo you want to continue (Y/n)? ");
                    answer = scanner.nextLine().strip().toUpperCase();
                    System.out.println();

                    if (answer.equals("Y")) continue;
                    else {
                        screen = DASHBOARD;
                        break mainSwitch;
                    }

                case TRANSFER_MONEY:
                    

                case EXIT:
                    System.out.print("\n\tAre you sure you want to exit from App (Y/n)? ");
                    String answerExit = scanner.nextLine().strip().toUpperCase();
                    System.out.println();
                    if (answerExit.equals("Y")) System.exit(0);
                    else {
                        screen = DASHBOARD;
                        break;
                    }
*/ 
                default: screen = DASHBOARD;
            }
              
        } while (true);

         
    }
}