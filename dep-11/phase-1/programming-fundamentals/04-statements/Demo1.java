public class Demo1 {
    public static void main(String[] args) {
        
        final String HELLO = "Hello";
        String greeting =  HELLO.length() > 5 ? "Statements" : "Expressions";
        System.out.println(HELLO + greeting);


        ; //Empty statement
        {
            // Block
        }

    }
}