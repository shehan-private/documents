public class Demo7 {
    public static void main(String[] args) {
        
        // DataType[]           identifier;     1 - Dimension
        // DataType[][]         identifier;     2D (Matrix | Matrices)
        // DataType[][][]       identifier;     3 - Dimensions
        // DataType[][][][]     identifier;     3 - Dimensions

        /* Array ceation */
        // new DataType[size];                          1D
        // new DataType[size][[size]];                  2D
        // new DataType[size][[size]][[size]];          3D
        // new DataType[size][[size]][[size]][[size]];  4D //First dimension size only should be given

        // size = {0, positive numbers}

        int[] my1DArray = new int[5];
        int[][] my2DArray = new int[3][];

        System.out.println(my1DArray);
        System.out.println(Arrays.toString(my1DArray));

    }
}
