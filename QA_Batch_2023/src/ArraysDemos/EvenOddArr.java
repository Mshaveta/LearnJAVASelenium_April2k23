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

            if (arrElement % 2 == 0) { //even condition--> 10%2 ==0
                evenArr[index] = arrElement;
            } else { //odd block
                oddArr[index] = arrElement;
            }
        }

        System.out.println("Value in Even Array - " + Arrays.toString(evenArr));
        //Value in Even Array - [10, 2, 0, 4, 56, 0, 70, 88]
        System.out.println("Value in Odd Array - " + Arrays.toString(oddArr));
        //Value in Odd Array - [0, 0, 3, 0, 0, 7, 0, 0]

        for (int i = 0; i < size; i++) {
            int evenElm = evenArr[i]; //10
            if (evenElm == 0) {
                continue;
            }
            System.out.print(evenElm + " ");//10  2
        }
        System.out.println("=========================================");
        for (int j = 0; j < size; j++) {
            int oddElm = oddArr[j]; //10
            if (oddElm == 0) {
                continue;
            }
            System.out.print(oddElm + " ");//10  2
        }
    }
}
