public class Demo19 {
    public static void main(String[] args) {
        
        /* 
         *  do statement while(boolean expression);
         * 
         *  do {
         *  
         * statments
         * ....
         * 
         * } while (boolean expression);    
         * 
         */



        //  int x = 5;
        //  do System.out.println("Hello"); while (x++ < 5);

         /* 
          * 
            + + + + +
            + + + +
            + + +
            + +
            +

          */

        int x = 1;
        int y = 1;

        do {

            do {
                System.out.print("+ ");

                if (x == 6-y) break;
            
            } while (x++ < 5);

            x=1;
            System.out.println();

        } while (y++ < 5);
        

        System.out.println();

        // single loop

        int a = 1;
        int b = 1;

        do {
            System.out.print("+ ");

            if (a == 6-b) {
                if (b==5) {System.out.println(); break;}

                b++;
                a=0;
                System.out.println();
            }
        
        } while (a++ < 5);

        System.out.println();

        int p = 1;
        int q = 1;
        int r = 5;

        do {
            System.out.print("+ ");

            // if(p%5==0) System.out.println();

            if (q == r) {
                q=0;
                r-=1;
                if (r==1) r=1
                System.out.println();
            }

            // if (p ==)

            // if (p == 6-q) {
            //     // System.out.println();
            //     if (q==5) {
            //         q = -1;

            //     }

            //     q+=1;
            //     p=0;
            //     System.out.println();

            q++;

        } while (p++ < 45);






    }
}
