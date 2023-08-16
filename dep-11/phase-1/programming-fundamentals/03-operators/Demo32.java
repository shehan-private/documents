public class Demo32 {
    public static void main(String[] args) {
        
        /*
         * int x=5;
         * x +=5; => x = x+5
         * 
         * 
         * 
         * 
         */

         int x = 5;
         x += 7.2;

         int y=2;
         y <<=1; // y = y << 1
         
         
         int a = 5;
         int b = 2;
         int c = 3;

        c += ++a + (b *=2 +a) + ++c - (a++ > b ? (c-=2 + b) +a : (a+=c++ +b) + 2);

        System.out.printf("a=%s, b=%s, c=%s \n", a,b,c);

        /*
         * byte b1 = 5;
         * byte b2 = 3;
         * b2 = (byte) (b2 + b1 + 1)  // should be done explicitly
         * b2 += b1 + 1      // implicit casting
         * 
         */

         System.out.println(10 + 15); // Constant expression

    }
}
