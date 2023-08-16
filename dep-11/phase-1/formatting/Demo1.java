public class Demo1 {
    public static void main (String[] arg) {
        // final int id = 1;
        // String name = "Kasun";
        // Double avgMarks = 65.2532;

        // System.out.printf("id=S%04d, name=%s, avgMarks=%.2f \n", id, name, avgMarks);

        final int id1 = 1;
        String name1 = "Kasun Sampath";
        Double avgMarks1 = 75.25;

        final int id2 = 2;
        String name2 = "Nuwan Ramindu";
        Double avgMarks2 = 62.35;

        // char myChar = ' ';

        final String LINE = "+%7s+%1$15s+%1$6s+\n";
        final String RECORD = "|SK-%04d|%-15s|%6.2f|\n"; //%-15s This - flag will left align the string

        System.out.printf(LINE, "");
        System.out.printf(RECORD, id1, name1, avgMarks1);
        System.out.printf(LINE, "");
        System.out.printf(RECORD, id2, name2, avgMarks2);
        System.out.printf(LINE, "");
        // System.out.printf("+SK-%03d% 9s+\n", id1, myChar);
        // System.out.printf("id=S%04d, name=%s, avgMarks=%.2f \n", id, name, avgMarks);


    }
}