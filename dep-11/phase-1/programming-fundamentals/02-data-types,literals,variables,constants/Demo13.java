public class Demo13 {
    public static void main (String[] args) {


        byte myByte = 10;
        short myShort = myByte;
        short myShort2 = 355;   // ? Value Bits 16 <= Value Bits 31

        char myChar = 'A';
        char myChar2 = 65;      // ? Value Bits 16 <= (int) Value Bits 31
        // myShort = myChar;    // ? Value Bits 15 <= (char) Value Bits 16
        // myChar = myShort;    // ? Value Bits 16 <= (short) Value Bits 15
        // myChar = myByte;     // ? Value Bits 16 <= (byte) Value Bits 7

        int myInt = myByte;
        int myInt2 = myShort;

        int myLong1 = myByte;
        int myLong2 = myShort;
        int myLong3 = myInt;

        // float myFloat = 0.2; // ? (float) Value Bits 16 <= (double) Value Bits 32
        float myFloat2 = myByte;
        float myFloat3 = myShort;
        float myFloat4 = myInt;
        float myFloat5 = myLong1;
        float myFloat6 = myChar;

        float myDouble2 = myByte;
        float myDouble3 = myShort;
        float myDouble4 = myInt;
        float myDouble5 = myLong1;
        float myDouble6 = myChar;


    }
}
