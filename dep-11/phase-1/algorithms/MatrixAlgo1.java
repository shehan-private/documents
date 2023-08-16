import java.util.Arrays;

public class MatrixAlgo1 {
    public static void main(String[] args) {
        
        int[][] m1 = {{2,3,-1,2},{4,-2,7,3},{-8,2,1,-4}};

        System.out.println(Arrays.toString(m1[0]));
        System.out.println(Arrays.toString(m1[1]));
        System.out.println(Arrays.toString(m1[2]));

        System.out.println();
        // System.out.println(m1[0].length);
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] *=-1;
            }
        }

        System.out.println(Arrays.toString(m1[0]));
        System.out.println(Arrays.toString(m1[1]));
        System.out.println(Arrays.toString(m1[2]));

    }
}
