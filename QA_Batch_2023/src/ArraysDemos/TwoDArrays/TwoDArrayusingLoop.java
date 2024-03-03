package ArraysDemos.TwoDArrays;

import java.util.Arrays;

public class TwoDArrayusingLoop {
    public static void main(String[] args) {
        int[][] numArr = { {2, 3, 4, 5},
                           {1, 2, 3, 4}
                         }; //[2][4]

        //or
        int[][] numArr1 = new int[][]{ {2, 3, 4, 5},
                                       {1, 2, 3, 4}
                                     }; //[2][4]


        System.out.println("Row size - "+numArr.length);//2
        System.out.println("Col size - "+numArr[0].length);//2
        System.out.println(Arrays.toString(numArr));//[[I@1b6d3586, [I@4554617c]
        System.out.println(Arrays.toString(numArr[0]));
        System.out.println(Arrays.toString(numArr[1]));
        System.out.println(numArr[0][1]);

        System.out.println("==================================================================");

        for (int row = 0; row < numArr.length; row++) { //row
            for (int col = 0; col < numArr[0].length; col++) {
                System.out.print(numArr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
