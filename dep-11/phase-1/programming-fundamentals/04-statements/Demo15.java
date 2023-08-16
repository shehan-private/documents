public class Demo15 {
    public static void main(String[] args) {

        //With nested while

        int x = 0;
        int y = 5;

        while (y>0) {
            while (x<y) {
            System.out.print("+ ");
            x++;
            }
            System.out.println();
            x=0;
            y--;
        }

        System.out.println();
        System.out.println();

        //With single while
        
        int a = 1;
        int b = 5;
        while (b>0) {
            System.out.print("+ ");

            if (a == b) {
                System.out.println();
                b--;
                a=0;
            }
            a++;
        }
        


    }
}
