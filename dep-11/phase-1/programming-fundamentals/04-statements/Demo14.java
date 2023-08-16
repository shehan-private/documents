public class Demo14 {
    public static void main(String[] args) {
        
        // From nested while
        int x = 0;
        int y = 0;
        
        while (x<5){
            while (y<5) {
                System.out.print("+ ");
                y++;
                
            }
            System.out.println();
            y=0;
            x++;
        }

        System.out.println();
        System.out.println();


        // From single while
        int a = 1;
        while (a < 26) {
            System.out.print("+ ");

            if (a % 5 == 0) {
                System.out.println();
            }
            a++;
        }
    }
}
