public class Demo25 {
    public static void main(String[] args) {

        // Logical operators
        
        boolean flag1 = 5 > 2;                  // true
        boolean flag2 = 10 < 2;                 // false
        boolean flag3 = "ijse".length() == 4;   // true

        System.out.println(flag1 & flag2);      // false
        System.out.println(flag2 & flag3);      // true

        System.out.println(flag1 | flag2);      // true
        System.out.println(flag2 | flag3);      // true

        System.out.println(flag1 ^ flag2);      // true
        System.out.println(flag2 ^ flag3);      // true
        System.out.println(flag1 ^ flag3);      // false



    }
}
