public class Demo15 {
    public static void main (String[] args) {

        byte myByte = -10;
        int myInt = myByte;

        int myInt2 = Integer.valueOf (Integer.toBinaryString(myInt));

        // System.out.printf("%032d\n",myInt2);

        final byte myByte3 = 14;
        final int MY_INT3 = myByte3;
        byte myByte4 = MY_INT3; // compile time constant

        byte myByte4 = 10;
        final int MY_INT3 = myByte4;
        byte myByte4 = MY_INT3; // runtime constant

        final int MY_INT5 = 15;                            // compile time constant
        final int MY_INT6 = 15 * (int) Math.random();       // runtime constant


    }
}
