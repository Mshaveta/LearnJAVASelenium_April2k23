package ArraysDemos.TwoDArrays;

import java.util.Arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        //int[][] mainArray = new int[3][2]; // 3Rows -2 cols-->{ {1,2}, {2,3}, {3,4} }
//or
//        int[][] mainArray = {{1, 2}, {2, 3}, {3, 4}};
//        System.out.println(mainArray); //[[I@1b6d3586
//        System.out.println(Arrays.toString(mainArray));
//        System.out.println("2D array length - " + mainArray.length);//3
//        System.out.println(mainArray[1]);//[I@4554617c
//        System.out.println("First index Array value (3) - " + mainArray[1][1]);//3
//
//        //1D array
//        int[] num1 = {2, 3, 4, 5};
//        System.out.println(num1); //[I@4554617c
//        System.out.println(Arrays.toString(num1));//[2, 3, 4, 5];
//        System.out.println("1D array length - " + num1.length);//4


        //===================================================================//
        String[][] namesArr = new String[][]
                {
                        {"1", "Tester1"},
                        {"2", "Tester2"},
                        {"3", "Tester3"},
                        {"4", "Tester4"},
                        {"5", "Tester5"}
                };
        int rowCount = namesArr.length;
        System.out.println("Row Count - "+namesArr.length);
        int colCount = namesArr[0].length;
        System.out.println("Col Count - "+namesArr[0].length);

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                System.out.print( namesArr[row][col] +" ");
            }
            System.out.println();
        }
    }
}

