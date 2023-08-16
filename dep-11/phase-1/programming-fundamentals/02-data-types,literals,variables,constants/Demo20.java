public class Demo20 {
    public static void main(String[] args) {
        
        // (simple | comples data types convert into String)


        int x = 10;

        String myStr = x + "";


        // String into primitive data type

        /* Wrappers
         * 
         * byte.valueOf(String) -> byte
         * short
         * "String".charAt(index) -> char
         * Integer
         * Long
         * Float
         * Double
         * 
         */

        String myStr2 = "10";

        byte myByte = Byte.valueOf(myStr2);


    }
}
