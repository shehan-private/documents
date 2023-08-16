public class Demo14 {
    public static void main (String[] args) {

        final int MY_CONST = 10;
        final int MY_CONST2 = 10 * (int) Math.random();

        byte myByte = 10;
        byte myByte2 = MY_CONST;
        // byte myByte3 = MY_CONST2;    //Since this is a runtime constant

        short myShort2 = 355;   // ? Value Bits 16 <= Value Bits 31

        char myChar2 = 65;      // ? Value Bits 16 <= (int) Value Bits 31
        // myShort = myChar;    // ? Value Bits 15 <= (char) Value Bits 16
        // myChar = myShort;    // ? Value Bits 16 <= (short) Value Bits 15
        // myChar = myByte;     // ? Value Bits 16 <= (byte) Value Bits 7

        // char myChar3 = myByte;

        long myLong1 = myShort2;

        float myFloat5 = myLong1;
    }
}
