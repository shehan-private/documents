public class Demo13 {
    public static void main(String[] args) {
        
        byte myByte = -127;
        byte myByte2 = (byte) (myByte << 1);
        short myShort = (short) (myByte << 1);

        System.out.println(myShort);

        System.out.printf("%32s \n", Integer.valueOf(Integer.toBinaryString(myByte)));
        System.out.printf("%032d \n", Integer.valueOf(Integer.toBinaryString(myShort)));


    }
}
