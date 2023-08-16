public class Pattern1 {
    public static void main(String[] args) {
        
        /* 
            Single Loop, Nested Loops
            Via +

            + + + + +
            + + + +
            + + +
            + +
            +                           
            + +
            + + +
            + + + +
            + + + + +
        */

        int width = 5;
        int height = 9;

        int point = 1;
        int row = 1;
        int ctr = width;

        do {
            System.out.print("+ ");

            if (point%ctr == 0) {
                System.out.println();
                row++;
                ctr += width-row+1;
            }
            point++;

        } while (row <= height);



    }
}