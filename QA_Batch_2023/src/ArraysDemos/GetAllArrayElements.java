package ArraysDemos;

import java.util.Arrays;

public class GetAllArrayElements {
    public static void main(String[] args) {
        int[] numArr = {12, 34, 56, 677, 888};

        System.out.println(numArr);
        System.out.println("Array Length - "+numArr.length);
        System.out.println(Arrays.toString(numArr));

        int arrSize = numArr.length;//5

        for (int i = 0; i < arrSize; i++) {//i=0;i<5;i++
            System.out.println(numArr[i]);//numArr[0];//12
        }
    }
}
