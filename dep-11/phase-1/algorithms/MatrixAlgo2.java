import java.util.Arrays;

public class MatrixAlgo2 {
    public static void main(String[] args) {
        
        int[][] m1 = {
            {2,3,-1,2},
            {4,-2,7,3},
            {-8,2,1,-4}
        };

        int[][] m2 = {
            {1,7,-8,2},
            {-4,6,2,3},
            {2,3,-1,2}
        };

        int[][] result = new int[3][4];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = m1[i][j] + 2*m2[i][j];
            }
            System.out.println(Arrays.toString(result[i]));
        }

    }
}
