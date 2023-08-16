public class Demo24 {
    public static void main(String[] args) {
        
        byte result1 = 5 & 2;
        byte result2 = (byte) (-2 & 0xFF); // If it was not casted to byte => 0000_0000_0000_0000_0000_0000_1111_1110 => 254
                                           // Since it was casted to byte  =>                               1111_1110 => -2
        byte result3 = 0x2 | 0xA;
        byte result4 = 011 ^ 5;            // 011 is Octal


        byte x = 10;
        byte y = 20;
        byte z = x + y; // cannot proceeed since x and y are variables

        final byte a = 10;
        final byte b = 20;
        byte c = a + b; // can proceeed since x and y are constants.



    }
}
