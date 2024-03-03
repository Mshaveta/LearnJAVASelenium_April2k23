package ArraysDemos;

import java.util.Arrays;

public class ArraysBasics_Way3 {
    public static void main(String[] args) {

        //way3:least used way: Array declaration and size allocation
        int[] arr = new int[] {12,23,44};
        System.out.println(arr);//[I@1b6d3586

        System.out.println("Array length - "+ arr.length ); //3

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


        System.out.println(Arrays.toString(arr));//[12, 3, 5, 6, 7]


    }
}
