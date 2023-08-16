public class Demo10 {
    public static void main(String[] args) {
        

        // int[][][] my3DArray = {{{0, 2, 3},{5, 5, 6},{5, 8, 9}},{{5, 3, 6},{7, 5, 8},{4, 3, 5}},{{5, 5, 7},{7, 5, 8},{7, 8, 9}}};

        // int[] intArray = {10,20};
        // int[][] intArrayArray = {intArray,null, {-2,3,5}};
        // int[][][][] myArray = {
        //     {{intArray,intArray,{5,7,8}},null,intArrayArray},
        //     null,
        //     null,
        //     {intArrayArray,null,null,intArrayArray}
        // };


        int[] myIntArray1 = {5,7,8};
        int[] myIntArray2 = {2,-3,1};

        int[][] myInArrayArray = {myIntArray2,null,myIntArray2};

        int[][][] myIntArrayArrayArray = {null,null};

        int[][][][] myArray = {
            myIntArrayArrayArray,
            myIntArrayArrayArray,
            null,
            {{myIntArray1,null,myIntArray1},null,myInArrayArray},
            {{{10,20,30},myIntArray2,myIntArray2},null,myInArrayArray,null},
            null
        };

        assert myArray.length == 6;
        assert myArray[0] == myArray[1];
        assert myArray[0].length == 2;
        assert myArray[3][2] == myArray[4][2];
        assert myArray[4][2][0] == myArray[4][2][2];
        assert myArray[3][0][0] == myArray[3][0][2];
        assert myArray[4][0][1] == myArray[4][0][2];

        System.out.println("Passed!");


    }
}
