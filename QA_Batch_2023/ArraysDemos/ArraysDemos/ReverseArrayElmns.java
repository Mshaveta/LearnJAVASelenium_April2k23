package ArraysDemos;

import java.util.Arrays;

public class ReverseArrayElmns {
    public static void main(String[] args) {
        int[] arr = {11,34,6,77,78};
        System.out.println("before - "+ Arrays.toString(arr));

        int size =  arr.length;//5, index 0 - 4
        for (int i = size-1; i >=0; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("After - "+ Arrays.toString(arr));
    }
}
