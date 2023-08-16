public class Demo1 {
    public static void main(String[] args) {

        int x = 1;

        x++;

        System.out.println(x); // 2

        ++x;

        System.out.println(x); // 3


        int y = 1;

        System.out.println(y++); // 1

        System.out.println(y); // 2

        System.out.println(++y); //3


    // int a = 10, b = 5, c = 

        int a = 10;
        int b = 5;

        int result = a++ +a++ +b+b+ ++a+ b++;

        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        
    }
}