public class Demo6 {
    public static void main(String[] args) {
        
        /*
            DataType[] identifier;
            DataType identifier[];
            DataType        []  identifier;
            DataType    []identfier;


            identifier = new DataType[size];
            identifier = new DataType[] {value1, value2, value3};
            identifier = {value1, value2, value3};                  X // This cannot be done
            DataType[] identifier = {value1, value2, value3};



         * 
         */

        int myInt;
        myInt = 10;


        int[] myArray;
        myArray = new int[] {myInt,20,30,myInt,50};

        // myArray = {10,20,30,40,50};

        int[] nums = {1,2,3,4,myArray.length-1};

        for (int i = 0; i < nums.length; i++) {
            myArray[i] = nums[i];

        }
        nums = null;

        for (int i=0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
