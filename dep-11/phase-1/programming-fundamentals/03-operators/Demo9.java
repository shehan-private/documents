public class Demo9 {
    public static void main(String[] args) {
        
        String myStr1 = "Hello";
        String myStr2 = "Java";
        int myInt = 10;
        int myInt1 = 1;
        char myChar = '!';

        int nyInt2 = myInt + myChar;

        String myStr3 = myStr1 + " " + myStr2 + " " + (myInt + myInt1) + myChar;

        System.out.println(myStr3);

        // System.out.println(myInt + myInt1 + myChar + "" + 10 + 12); // before the empty string, + is an add operator. After the empty string, it becomes a concat operator


        // System.out.println(myInt + myInt1 + myChar + "" + (10 + 12));

        System.out.println(myStr1
                                .concat(" ")
                                .concat(myStr2)
                                .concat(" ")
                                .concat(myInt + myInt1 + "")
                                .concat(myChar+""));


    }
}
