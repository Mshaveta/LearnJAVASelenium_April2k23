package ArraysDemos.Exercise;

import java.util.Arrays;

public class SortingElmns {
    public static void main(String[] args) {
        int[] arr = {12, 2, 34, 44, 555, 67};
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){ //2<12
//                temp = arr[i-1]; //temp = arr[1], temp = 2
//                arr[i-1] = arr[i];//arr[0] = arr[1]
//                arr[i] =  temp;//arr[1] = temp

                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
