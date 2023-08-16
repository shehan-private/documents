public class Demo5 {
    public static void main(String[] args) {
        
        System.out.println("Hello");

        int x = 4;

        // assert boolean expression [: "Message"];
        assert 5 == ++x;

        assert 10 > 5 : "My Message";
        assert 0 == 100 : "Something went wrong";

        System.out.println("Welcome");
        System.out.println(x);

        // if assertion is enabled x = 5; if disabled x= 4;
        // To activate => pass -ea option to JVM

        /* 
         * shehan@starpc-ii:~/Documents/dep-11/phase-1/programming-fundamentals/04-statements$ javac Demo5.java && java -ea Demo5
            Hello
            Exception in thread "main" java.lang.AssertionError: Something went wrong
                at Demo5.main(Demo5.java:12)

         */
    }
}
