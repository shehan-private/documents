public class Demo24 {
    public static void main(String[] args) throws InterruptedException {
        
        String chars = "|/-\\|/-\\";

        String reset = String.format("\b".repeat(121));
        System.out.println();

        for(int i=1, q=0; i <= 100; i++) {

            if (q == 8) q=0;
            char charVal = chars.charAt(q);

            String progress = String.format("=".repeat(i));
            
            // System.out.println();
            System.out.printf("%s", reset);


            System.out.printf("Loading (%s) ", charVal);
            System.out.printf("[%s",progress);
            System.out.printf(" ".repeat(100-i));
            System.out.printf("] %.2f%%",(i/100.0*100));
            Thread.sleep(50);
            q++;

        }

        System.out.printf("\b".repeat(122));
        System.out.print(" ".repeat(122));
        System.out.printf("\b".repeat(122));
        System.out.print("Completed!");
        Thread.sleep(2000);
        System.out.println();
        System.out.println();
        


    }
}
