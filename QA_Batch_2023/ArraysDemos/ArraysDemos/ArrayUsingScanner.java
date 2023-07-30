package ArraysDemos;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUsingScanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many elements do you want to store?");
        int arrSize = scn.nextInt();

        //Array declaration
        int[] num_arr = new int[arrSize];
        System.out.println(Arrays.toString(num_arr));

        //Assign/store the elements into Arrays

        for (int i = 0; i < num_arr.length; i++) {
            System.out.println("Enter value at index number["+i+"]");
            num_arr[i] =  scn.nextInt();
        }

        System.out.println(Arrays.toString(num_arr));//[12, 55, 67, 4, 34]

        for (int i = 0; i < num_arr.length; i++) {
            System.out.println(num_arr[i]);

        }
    }
}
