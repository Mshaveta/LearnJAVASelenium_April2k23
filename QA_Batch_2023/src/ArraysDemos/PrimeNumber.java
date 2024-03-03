package ArraysDemos;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {

        int[] numArr = {13, 22, 12, 167, 23};
        int size = numArr.length;
        int[] primeNumArr = new int[size];
        //Array traverese
        for (int index = 0; index < size; index++) {
            System.out.println(numArr[index]);
            //number divisible by all other numbers to check prime or not
            for (int j = 2; j < numArr[index]; j++) {
                if (numArr[index] % j == 0) {
                    break;
                }
                primeNumArr[index] = numArr[index];
            }
        }
        System.out.println(Arrays.toString(primeNumArr));
    }
}
