import java.util.Arrays;
import java.util.Scanner;

public class App2 {
    private static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        
        final String COLOR = "\033[032m";
        final String RED_COLOR = "\033[031m";
        final String BOLD = "\033[1m";
        final String RESET = "\033[0m";
        final String CLEAR = "\033[H\033[2J";
        
        final String DASHBOARD = "Customer Management System";
        final String ADD_CUSTOMER = "Add New Customer";
        final String DELETE_CUSTOMER = "Delete Existing Customer";
        final String PRINT_DETAILS = "Print Customer Details";

        String[] customers = new String[0];
        String[] customerIds = new String[0];

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
                    System.out.println("1. Add New Customer\n2. Delete Existing Customer\n3. Print Customer Details\n4. Exit\n");

                    System.out.print("Enter an option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(RESET);
                    System.out.println();

                    switch (option) {
                        case 1: screen = ADD_CUSTOMER; break;
                        case 2: screen = DELETE_CUSTOMER; break;
                        case 3: screen = PRINT_DETAILS; break;
                        case 4: System.exit(0); break;
                        default: continue;
                    }
                    break;
                 
                case ADD_CUSTOMER:

                    boolean valid;
                    String customerId;

                    // Validating customer ID
                    customerIdLoop:
                    do {
                        valid = true;
                        System.out.printf("%s1. Enter Customer ID: ",COLOR);
                        customerId = scanner.nextLine().strip();

                        //checking blank content
                        if (customerId.isBlank()){
                            System.out.printf("%s%Customer ID cannot be empty%s\n",RED_COLOR,BOLD,RESET);
                            valid = false;
                            continue;
                        }

                        //Checking format validity
                        if (customerId.charAt(0) != 'C' || customerId.charAt(1) != '-'){

                            System.out.printf("%sInvalid ID%s\n",RED_COLOR,BOLD,RESET);
                            valid = false;
                            continue;
                        }

                        for (int i = 2; i < customerId.length(); i++) {
                            if (!Character.isDigit(customerId.charAt(i))) {
                                System.out.printf("%sInvalid ID%s\n",RED_COLOR,BOLD,RESET);
                                valid = false;
                                continue customerIdLoop;
                            }
                        }

                        //Checking exisiting ID
                        for (int i = 0; i < customerIds.length; i++) {
                            if (customerIds[i].equals(customerId)) {
                                System.out.printf("%sID Already Exists%s\n",RED_COLOR,BOLD,RESET);
                                valid = false;
                                continue customerIdLoop;
                            }
                        }
                    } while (!valid);

                    //Validating customer name
                    String customerName;

                    customerNameLoop:
                    do {
                        valid = true;
                        System.out.printf("%s2. Enter Customer name: ",COLOR);
                        customerName = scanner.nextLine().strip();

                        //checking blank content
                        if (customerName.isBlank()){
                            System.out.printf("%s%Customer name cannot be empty%s\n",RED_COLOR,BOLD,RESET);
                            valid = false;
                            continue;
                        }

                        //Checking validity of customer name
                        for (int i = 0; i < customerName.length(); i++) {
                            if (!(Character.isLetter(customerName.charAt(i)) || Character.isSpaceChar(customerName.charAt(i)))) {
                                System.out.printf("%s%sNot valid%s\n",RED_COLOR,BOLD,RESET);
                                valid = false;
                                continue customerNameLoop;
                            }
                        }

                    } while (!valid);

                    // Storing data into arrays
                    String[] newCustomerIds = new String[customerIds.length + 1];
                    String[] newCustomers = new String[customers.length + 1];

                    int index;
                    
                    for (index = 0; index < customerIds.length; index++) {
                        newCustomerIds[index] = customerIds[index];
                        newCustomers[index] = customers[index];
                    }
                    newCustomerIds[index] = customerId;
                    newCustomers[index] = customerName;

                    customerIds = newCustomerIds;
                    customers = newCustomers;

                    System.out.println(Arrays.toString(customerIds));
                    System.out.println(Arrays.toString(customers));

                    // Asking to add another customer
                    System.out.printf("Cool: %s has been added successfully. Do you want to add new customer (y/n)? ", customerName);
                    String answer = scanner.nextLine().strip().toUpperCase();

                    if (answer.equals("Y")) continue;
                    else {
                        screen = DASHBOARD;
                        break;
                    }
                
                case DELETE_CUSTOMER:

                    // Validating customer ID
                    customerIdLoop:
                    do {
                        valid = true;
                        System.out.printf("%s1. Enter Customer ID to delete: ",COLOR);
                        customerId = scanner.nextLine().strip();

                        //checking blank content
                        if (customerId.isBlank()){
                            System.out.printf("%sCustomer ID cannot be empty%s\n",RED_COLOR,BOLD,RESET);
                            valid = false;
                            continue;
                        }

                        //Checking format validity
                        if (customerId.charAt(0) != 'C' || customerId.charAt(1) != '-'){

                            System.out.printf("%sInvalid ID%s\n",RED_COLOR,BOLD,RESET);
                            valid = false;
                            continue;
                        }

                        for (int i = 2; i < customerId.length(); i++) {
                            if (!Character.isDigit(customerId.charAt(i))) {
                                System.out.printf("%sInvalid ID%s\n",RED_COLOR,BOLD,RESET);
                                valid = false;
                                continue customerIdLoop;
                            }
                        }

                        //Checking existing ID
                        int i;
                        int indexPosition = -1;
                        for (i = 0; i < customerIds.length; i++) {
                            if (customerIds[i].equals(customerId)) {
                                indexPosition = i;
                                break;
                            }  
                        }
                        if (i == customerIds.length) {
                            System.out.printf("%sID Not found%s\n",RED_COLOR,BOLD,RESET);
                            valid = false;
                            continue;
                        }

                        // Deleting data from array
                        String[] deleteCustomerIds = new String[customerIds.length - 1];
                        String[] deleteCustomers = new String[customers.length - 1];

                        // int index;
                        int indexCustomer;
                        for (index = 0, indexCustomer = 0; index < deleteCustomerIds.length; index++,indexCustomer++) {
                            if (index == indexPosition) indexCustomer++;
                            deleteCustomerIds[index] = customerIds[indexCustomer];
                            deleteCustomers[index] = customers[indexCustomer];
                            
                        }
                        
                        customerIds = deleteCustomerIds;
                        customers = deleteCustomerIds;

                        System.out.println(Arrays.toString(customerIds));
                        System.out.println(Arrays.toString(customers));

                        System.out.print("Customer deleted successfully. Do you want to delete another customer (y/n)? ");
                        answer = scanner.nextLine().strip().toUpperCase();

                        if (answer.equals("Y")) continue;
                        else {
                            screen = DASHBOARD;
                            break;
                        }

                    } while (!valid);
                    break;

                case PRINT_DETAILS:

                    if (customers.length == 0) {
                        System.out.printf("%sNo customer records available.%s",RED_COLOR, RESET);

                    } else {

                        final String LINE = "+" + "-".repeat(12) + "+" + "-".repeat(18) + "+";

                        System.out.println(LINE);
                        System.out.printf("|%-12s|%-18s|\n", "Customer Id", "customer name");
                        System.out.println(LINE);

                        for (int i = 0; i < customers.length; i++) {
                            System.out.printf("|%-12s|%-18s|\n", customerIds[i], customers[i]);
                        }
                        System.out.println(LINE);


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
