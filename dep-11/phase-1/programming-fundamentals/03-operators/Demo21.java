public class Demo21 {
    public static void main(String[] args) {
        
        int x = 10;
        int y = 10;

        System.out.println(x == y);
        System.out.println(x != y);

        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 == flag2);

        double d = 10.25;
        System.out.println(x == d);

        // numeric == numeric , numeric != numeric
        //boolean == boolean , boolean != boolean

        //numeric == boolean X Cannot execute


        String str1 = "abc";
        String str2 = "edf";
        String str3 = "abc";

        // This bad practice

        System.out.println(str1 == str2); //false
        System.out.println(str2 == str3); //false

        // Good practice

        System.out.println(str1.equals(str3));


        String str4  = "ABC";
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));


        System.out.println(str1.compareTo(str4) == 0);
        System.out.println(str1.compareToIgnoreCase(str4) == 0);




    }
}
