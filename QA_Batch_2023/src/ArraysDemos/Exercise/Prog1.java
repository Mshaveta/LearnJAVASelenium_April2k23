package ArraysDemos.Exercise;

import java.util.Arrays;

public class Prog1 {
        public static void main(String args[])
        {
            int array_variable [] = new int[10];
            for (int i = 0; i < 10; ++i) { //i=2,2<10, 4, 6
                array_variable[i] = i / 2; // 0/2 ->0, arr[0] - >0 | arr[2] = 1 | arr[4] = 2
                array_variable[i]++;//arr[0]++-->0++---> 1-->arr[2]-> 2--> arr[4]-> 3
                //increments the value of array element stored at index i
                System.out.print(array_variable[i] + " ");//1, 2, 3
                i++;//increment the value of i-->1, 3, 5

            }
            System.out.println("=====================================");
            System.out.println(Arrays.toString(array_variable));

            for(int i=0;i<array_variable.length;i++){
                if(array_variable[i]!=0){
                    System.out.println(array_variable[i]);
                }

            }
        }
}
