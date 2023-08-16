
//class: Cannot label
public class Demo3 {

    //method: Cannot label
    public static void main(String[] args) {
        
        // Label statement
        myLabel:
        {
            // myVar: cannot label
            int x = 10;

            anotherLabel:
            x=20;

            secondLabel: // Second label statement
            System.out.println("Hello");
        }

        thirdLabelStatement: // Third label statement
        System.out.println("IJSE");


        // Syntaxt => Valid Java Identifier:
    }
}
