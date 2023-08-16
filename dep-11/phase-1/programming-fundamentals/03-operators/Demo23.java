public class Demo23 {
    public static void main(String[] args) {
        
        // AND &
        // OR  |
        // XOR ^

        byte myByte1 = 0b0000_0101;
        byte myByte2 = 0b0000_0011;

        byte myResult1 = (byte) (myByte1 & myByte2);
        System.out.println(myResult1); // 00000_0001
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myResult1)));


        byte myResult2 = (byte) (myByte1 | myByte2);
        System.out.println(myResult2); // 00000_0111
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myResult2)));


        byte myResult3 = (byte) (myByte1 ^ myByte2);
        System.out.println(myResult3); // 00000_0110
        System.out.printf("%08d \n",Integer.valueOf(Integer.toBinaryString(myResult3)));


    }
}
