package ArraysDemos;

import java.util.Arrays;

public class EvenOddArr {
    public static void main(String[] args) {
        int[] num_arr = {10, 2, 3, 4, 56, 7, 70, 88};
        int size = num_arr.length;
       // System.out.println(size);
        //System.out.println(Arrays.toString(num_arr));

        int[] evenArr = new int[size];
        int[] oddArr = new int[size];

       // System.out.println(Arrays.toString(evenArr));
       // System.out.println(Arrays.toString(oddArr));

        for (int index = 0; index < size; index++) { // 0<8-> true, 1<8- true
            // System.out.println("value at index[" + index + "] number  - " + num_arr[index]);//10
             int arrElement = num_arr[index];//arrElement -10
            // System.out.println(arrElement);

            if ( arrElement % 2 == 0 ) { //even condition--> 10%2 ==0
                evenArr[index] = arrElement;
            }else{ //odd block
                oddArr[index] = arrElement;
            }
        }

        System.out.println("Value in Even Array - "+Arrays.toString(evenArr));
        System.out.println("Value in Odd Array - "+Arrays.toString(oddArr));
    }
}
