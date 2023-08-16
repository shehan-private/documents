public class Table {
    public static void main(String[] args) {
        String name = "Kasun Sampath";
        int age = 15;
        String subject1 = "SE-1";
        String subject2 = "SE-2"; 
        String subject3 = "SE-3";
        double marks1 = 95.25;
        double marks2 = 85.58;
        double marks3 = 75.35;

        final String COLOR_RED_BOLD;
        final String RESET;

        double total = marks1 + marks2 + marks3;

        System.out.println("+".concat("-".repeat(40).concat("+")));
        System.out.printf("| %10s: %-28s |\n", "Name", name.toUpperCase());
    }
}
