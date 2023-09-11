package ArraysDemos.TwoDArrays;

import java.util.Arrays;

public class TwoDArraysBasics {
    public static void main(String[] args) {
        //way1:
//        int[][] mainArr = new int[3][4]; //3-Rows, 4-Cols
//        System.out.println(mainArr); //[[I@1b6d3586
//        System.out.println(Arrays.toString(mainArr));//[ [I@4554617c, [I@74a14482, [I@1540e19d ]
//        System.out.println(mainArr.length);
//        System.out.println(mainArr[0]);// returns m/m addr of subArr1 - [I@4554617c
//        System.out.println(mainArr[1]);//[I@74a14482
//        System.out.println(mainArr[2]);//[I@1540e19d
//
//        //To fetch the values of Nested or 2D array
//        System.out.println(mainArr[0][0]); //value would be acc. to its datatype
//        System.out.println(mainArr[0][1]);
//        System.out.println(mainArr[0][2]);
//        System.out.println(mainArr[0][3]);
//
//        System.out.println(mainArr[1][0]); //value would be acc. to its datatype
//        System.out.println(mainArr[1][1]);
//        System.out.println(mainArr[1][2]);
//        System.out.println(mainArr[1][3]);
//
//        System.out.println(Arrays.toString(mainArr[0]));
//        System.out.println(Arrays.toString(mainArr[1]));
//        System.out.println(Arrays.toString(mainArr[2]));
//
//        //Assigning the values to Array
//
//        mainArr[0][0] = 12;
//        mainArr[0][1] = 22;
//        mainArr[0][2] = 122;
//        mainArr[0][3] = 222;
//
//        mainArr[1][0] = 42;
//        mainArr[1][1] = 52;
//        mainArr[1][2] = 142;
//        mainArr[1][3] = 152;
//
//        mainArr[2][0] = 42;
//        mainArr[2][1] = 52;
//        mainArr[2][2] = 242;
//        mainArr[2][3] = 252;
//
//        System.out.println(Arrays.toString(mainArr[0]));
//        System.out.println(Arrays.toString(mainArr[1]));
//        System.out.println(Arrays.toString(mainArr[2]));
//
//        //fetch the array elements
//        System.out.println(mainArr[0][0]); //value would be acc. to its datatype
//        System.out.println(mainArr[0][1]);
//        System.out.println(mainArr[0][2]);
//        System.out.println(mainArr[0][3]);


        //way2:
       int[][] mainArr1 = new int[4][];
        System.out.println(mainArr1.length);//4
        System.out.println(mainArr1);//[[I@1b6d3586
        System.out.println(Arrays.toString(mainArr1));//[null, null, null, null]
        System.out.println(Arrays.toString(mainArr1[0]));

        //way2: NOt possible
       // int[][] mainArr2 = new int[ ][3];

    }
}
