public class Demo2 {
    public static void main(String[] args) {

        String myStr = "IJSE";
        int myInt = 10;
        double myDouble = 25.7865;


        /* We can inject any data type inside a string place holder */
        System.out.printf("| %s |\n", myStr);
        System.out.printf("| %s |\n", myInt);
        System.out.printf("| %s |\n", myDouble);

        System.out.println();


        /* We can specify the width any data type */
        System.out.printf("| %6s |\n", myStr);
        System.out.printf("| %6d |\n", myInt);
        System.out.printf("| %6.2f |\n", myDouble);

        System.out.println();

        /* We can specify the flag "-" to left align with any data type */
        System.out.printf("| %-6s |\n", myStr);
        System.out.printf("| %-6d |\n", myInt);
        System.out.printf("| %-6.2f |\n", myDouble);

        System.out.println();


        /* We can specify the flag "+" which stand for positive/ negative sign only with numeric data type */
        System.out.printf("| %-6s |\n", myStr);
        System.out.printf("| %+-6d |\n", myInt);
        System.out.printf("| %+-6.2f |\n", myDouble);

        System.out.println();


        /* We can specify the flag "0" (which stand for zero padding) with numeric data types. But can't use 0 padding with left align */
        System.out.printf("| %+07d |\n", myInt);
        System.out.printf("| %07.2f |\n", myDouble);

        System.out.println();


        /* We can specify the flag "," (which stand for thousand grouping) with numeric data types. Can use with 0 padding also */
        System.out.printf("| %+0,12d |\n", 1000000);
        System.out.printf("| %+0,12.2f |\n", 1000254.00);

        System.out.println();


        /*  */
        System.out.printf("%s - %s", myInt, myDouble);
        System.out.printf("%2s - %1s", myDouble, myInt);
        System.out.println();
        System.out.println();

        /* Using parameters */
        System.out.printf("+%5s+%10s+\n", "", "");
        System.out.printf("+%5s+%1$10s+\n", "");
        System.out.println();
    }
}
