package ArraysDemos;

import java.util.Arrays;

public class RightShiftDemo {
    public static void main(String[] args) {
        int[] arrNum = {10, 22, 33, 54, 65};
        int size = arrNum.length;
        System.out.println("Size - " + size);
        int lastIndex = size - 1;
        System.out.println("lastIndex - " + lastIndex);

        int temp = arrNum[lastIndex];
        System.out.println("temp - " + temp);

        for (int i = 0; i < size - 1; i++) {
            arrNum[lastIndex - i] = arrNum[lastIndex - (i + 1)];
            System.out.println("Iteration - " + i + Arrays.toString(arrNum));
        }
        arrNum[0] = temp;
        System.out.println("New Array - " + Arrays.toString(arrNum)); //[65, 10, 22, 33, 54]

        //To Print the new Right Shift Array
        for (int index = 0; index < size; index++) {
            System.out.println(arrNum[index]);
        }

    }

}
