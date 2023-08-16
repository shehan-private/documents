public class Demo5 {
    public static void main(String[] args) {
        
        byte x = 5;
        byte y = -2;

        x = (byte) (~x + ~y);

        int result = y + y++ + -(--x);
        result = result + ~-5 + x + ++y;

        System.out.println(~result);

        System.out.printf("result=%s, x=%s, y=%s \n", result, x, y);



    }
}
