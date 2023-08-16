public class Demo17 {
    public static void main (String [] args) {

        byte myByte = -10;
        char myChar = (char) myByte;
        int myInt = myChar;
        byte myByte2 = (byte) myChar;
        char myChar2 = (char) (myByte & 0xFF);
        byte myByte3 = (byte) myChar2;
        System.out.println(myInt);
        System.out.println(myByte2);
        System.out.println(myByte3);

        char myChar2 = (char) (myByte & 0xFF);
        int myInt2 = myChar2;
        short myShort2 = (short) myChar2;
        byte myByte3 = (byte) myChar2;
        System.out.println(myInt2);
        System.out.println();
    }
}
