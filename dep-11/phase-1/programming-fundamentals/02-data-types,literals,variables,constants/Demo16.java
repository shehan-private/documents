import java.util.Calendar;

public class Demo16 {
    public static void main (String[] args) {

        byte myByte = 10;       // implicit narrowing primitive conversion

        final int myInt = 10;   
        byte myByte2 = myInt;   // implicit narowing primitive comversion

        int myInt2 = 10;
        byte myByte3 = (byte) myInt2;  // casting / explicit narrowing primitive conversion


        byte myByte4 = (byte) 256;

        byte myByte5 = (byte) (5>2);
        byte myByte6 = (byte) (10+5);
        byte myByte7 = (byte) "abc";


        Object a = 10;
        Byte myByte8 = (Byte) a;

        Object b = "abc";
        Byte myByte9 = (Byte) b;

        Calendar c = Calendar.getInstance();
        byte myByte10 = (byte) c;

    }
}
