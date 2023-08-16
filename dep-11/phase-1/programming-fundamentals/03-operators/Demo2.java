public class Demo2 {
    public static void main(String[] args) {
        
        int x = 1;
        int y = 2;

        int result  = ++x + ++y + x - y + x++ - --y;
        result = result + x++ + y--;
        result = x + result + y ;
        System.out.printf("\nresult=%s, a=%s, b=%s\n", result, x, y);


    }
}
