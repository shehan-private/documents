public class Demo10 {
    public static void main (String[] arg) {


        String someString1 = "this\tis a string";
        String someString2 = "this\t\tis a string";
        String someString3 = "this\bis a string";
        String someString4 = "this\nis a string";
        String someString5 = "this is awesome\r what the heck?";

        String someString6 = "This is a multiline\n\r line String in windows";
        String someString7 = "This is a multiline\n line String in other operating systems";
        String someString8 = "This is a multiline\n line String\" in other operating systems";

        System.out.println(someString1);
        System.out.println(someString2);
        System.out.println(someString3);
        System.out.println(someString4);
        System.out.println(someString5);
        System.out.println(someString6);
        System.out.println(someString7);
    }
}
