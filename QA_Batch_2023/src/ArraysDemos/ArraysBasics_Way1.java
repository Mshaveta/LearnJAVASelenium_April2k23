package ArraysDemos;

import java.util.Arrays;

public class ArraysBasics_Way1 {
    public static void main(String[] args) {

        //Step1: Array declaration and size allocation

       // int arr_size = 10;
        //way1:  Array Declaration
        int[] arr = new int[3];
        System.out.println("Value of Array reference variable"+arr);//[I@1b6d3586--->[-1D Array, I-> wrapper class of
        // int

        System.out.println("print the array elements - "+Arrays.toString(arr));
        System.out.println("Length of an Array - "+arr.length);
        System.out.println("last index of an array - "+ ((arr.length) -1));


//        boolean[] b_arr = new boolean[2];
//        System.out.println(b_arr);//[Z@4554617c
//
//        char[] ch_arr = new char[2];
//        System.out.println(ch_arr);//Null,Null
//
//        byte[] byte_arr = new byte[2];
//        System.out.println(byte_arr);//[B@74a14482
//
//        float[] float_arr = new float[2];
//        System.out.println(float_arr);//[F@1540e19d

//        //way2: Array Declaration
//        int arr1[] = new int[arr_size];
//
//        //way3: Array Declaration
//        int []arr2 = new int[arr_size];


       // Step2: Assign/store the values/elements into Array
        //arr_name[index_number] = value;
        arr[1] = 12;
        arr[0] = 15;
        arr[2] = 20;

        System.out.println("print the array elements - "+Arrays.toString(arr));//[0, 12, 0], [15, 12, 20]

       //step3: Access/reterive/get the array elemnets

        System.out.println(arr[2]);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //System.out.println(arr[5]);


    }
}
