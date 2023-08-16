public class Demo27 {
    public static void main(String[] args) {
        
        // for (int x = 0; x < 5; x++) {

        //     System.out.print("\nHello ");
        //     // if (x == 2) break;
        //     if (x == 2) continue; // Transfering the execution to the next itteration
        //     System.out.print("World\n");

            

        // }
        // System.out.println();

            /* Continue with labels */

        loop:
        for (int a= 0; a < 5; a++) {
            System.out.println();

            for (int x = 0; x < 5; x++) {

                
                // if (x == 2) break;
                if (a==2 && x == 2) continue loop; // Transfering the execution to the next itteration
                System.out.print("+ ");

            }

        }

        


    }
}
