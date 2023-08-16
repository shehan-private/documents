public class Demo13 {
    public static void main(String[] args) {
        
        /* Loops */

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");


        /* 
         * 
         * while (boolean expression) statement;
         * 
         * 
         * while (boolean expresison) {
         * 
         *      statment(s);
         * }
         * 
         */

        // while (true) System.out.println("Hello World");

        int y=0;
        while (y++ < 5) {
            System.out.println("Hello World");
        }

        int x =0;
        boolean flag = true;
        while (flag) {

        }

        int r = 0;
        loop:
        while (true) {
            System.out.println("Hello World");
            if (++r == 5) break;
            // or break loop;   break will be applied for inner most enclosing block if any label is not considered.
        }

        // System.out.println("Loops-1");
        // System.out.println("Loops-2");
        // System.out.println("Loops-3");
        // System.out.println("Loops-4");

        int a =1;
        while (a < 6) {
            System.out.printf("Loops-%d\n",a);
            a++;
        }

    }
}
