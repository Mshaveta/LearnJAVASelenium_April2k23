package ArraysDemos;

import java.util.Arrays;

public class ReverseArrayDemo {
    public static void main(String[] args) {
        int[] arr = {11, 34, 6, 77, 78};
        int size = arr.length;
        int lastIndex = size - 1;//5, index 0 - 4

        for (int i = 0; i <= size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[lastIndex - i];//arr[0] = arr[4-0]->arr[4]
            arr[lastIndex - i] = temp;
        }

        System.out.println("After - " + Arrays.toString(arr));
    }
}
