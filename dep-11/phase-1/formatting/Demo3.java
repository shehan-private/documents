public class Demo3 {
    public static void main (String[] args) {


        int id1 = 1;
        String name1 = "Kasun Sampath";
        System.out.printf("ID=C%04d, NAME=%s \n", id1, name1);

        String formattedString = String.format("ID=C%04d, NAME=%s \n", id1, name1);

        System.out.println(formattedString);
    }
}



String dash1 = String.format("-".repeat(15));

        System.out.printf("%s1m+",COLOR);
        // System.out.printf("%1$s+%1$s+%1$s+\n",dash1);

        String tableFormat = String.format("%1$s+%1$s+%1$s+\n",dash1);