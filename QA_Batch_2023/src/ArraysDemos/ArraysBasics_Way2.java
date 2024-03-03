package ArraysDemos;

import java.util.Arrays;

public class ArraysBasics_Way2 {
    public static void main(String[] args) {

        //Step1: Array declaration and size allocation
        int[] arr = {12,3,5,6,7}; //size: - 5

        System.out.println(arr);//[I@1b6d3586

        System.out.println("Array length - "+ arr.length ); //5

        arr[0] = 123;
        //arr[5] = 423;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

        System.out.println(Arrays.toString(arr));//[12, 3, 5, 6, 7]

    }
}
