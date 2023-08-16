public class Demo12 {
    public static void main(String[] arg) {
        int id1 = 1;
        String name1 = "Kasun";
        String address1 = "Galle";

        int id2 = 2;
        String name2 = "Nuwan";
        String address2 = "Matara";

        // System.out.printf("id=%s, name=%s, address=%s", id1, name1, address1);

        // System.out.printf("id=%s, name=%s, address=%s\n", id1, name1, address1);
        // System.out.printf("id=%s, name=%s, address=%s\n", id2, name2, address2);

        // reset = "\033[30;0m"

        // final String TITLE = "\033[32;1m";
        // final String RESET = "\033[30;1m";
        // Use these constants in the printf

        // System.out.println("|     %1$sID%2$s    |      %1$sNAME%2$s      +    %1$sAddress%2$s  |", TITLE, RESET);

        System.out.println("+-----------+----------------+-------------+");
        System.out.println("|     \033[34;1mID\033[0m    |      \033[34;1mNAME\033[0m      +    \033[34;1mAddress\033[0m  |");
        System.out.println("+-----------+----------------+-------------+");
        System.out.printf("|      %s    |      %s     +    %s    |\n", id1, name1, address1);
        System.out.printf("|      %s    |      %s     +    %s   |\n", id2, name2, address2);
        System.out.println("+-----------+----------------+-------------+");

    }
}


final String TITLE = "\033[32;1m";
final String RESET = "\033[30;1m";
System.out.println("| %1$sID%2$s | %1$sNAME%2$s + %1$sAddress%2$s |", TITLE, RESET);

System.out.printf("id=%s, name=%s, address=%s", id1, name1, address1);