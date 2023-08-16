public class Demo8 {
    public static void main(String[] args) {
        
        int[][] matrix = new int[3][3];

        // matrix[0][0] = 2;
        // matrix[0][1] = 3;
        // matrix[0][2] = 5;

        // matrix[1][0] = 6;
        // matrix[1][1] = 2;
        // matrix[1][2] = 8;

        // matrix[2][0] = 3;
        // matrix[2][1] = 1;
        // matrix[2][2] = 2;

        // System.out.print(matrix[0][0] +" ");
        // System.out.print(matrix[0][1] +" ");
        // System.out.print(matrix[0][2] +" ");
        // System.out.println();

        // System.out.print(matrix[1][0] +" ");
        // System.out.print(matrix[1][1] +" ");
        // System.out.print(matrix[1][2] +" ");

        // System.out.print(matrix[2][0] +" ");
        // System.out.print(matrix[2][1] +" ");
        // System.out.print(matrix[2][2] +" ");

        int[] row1 = {2,3,5};
        int[] row2 = {6,2,8};
        int[] row3 = {3,1,2};

        matrix[0] = row1;
        matrix[1] = row2;
        matrix[2] = row3;

    }
}
