package ArraysDemos;

import java.util.Arrays;

public class SecondMaxNumber {
    public static void main(String[] args) {
        // int[] numArr = {1, 3, 567, 86, 784, 30, 12};
        int[] numArr = {1, 3, 56, 86, 784, 230, 12};
        int size = numArr.length;
        int max = 0;
        int scndMax = 0;
        for (int index = 0; index < size; index++) {
            if (numArr[index] > max) { // numArr[0]-> 1 > 0-true
                scndMax = max; //sm = 0
                max = numArr[index];//max = numArr[0]--> max = 1
            } else if (numArr[index] > scndMax) {
                scndMax = numArr[index];
            }
        }
        System.out.println("Max Num - " + max);
        System.out.println("Second Num - " + scndMax);

    }
}
