public class Demo4 {
    public static void main(String[] args) {
        
        System.out.println("Hello");

    myBlock:
    {    
        System.out.println("Welcome");
        System.out.println("to");
        if (true) break myBlock; // break sybtax => break label identifier

        // Unreachable statements
        System.out.println("DEP-10");
    }

    System.out.println("DEP-11");


    // Local variable delaration variable
    int x;

    // local constant declaration variable
    final int y;


    }
}
