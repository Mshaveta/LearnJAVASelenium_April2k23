package StringDemos;

import java.util.Arrays;

/*
A
p
p
i
u
m
 */
public class PrintStringVertical {
    public static void main(String[] args) {
        String st = "Appium";
        int size = st.length();
       // System.out.println(size);

        //way1: String method --charAt(index number)
        for(int index=0;index<size;index++){
            char ch = st.charAt(index);//Appium.charAT(0)--> A
            System.out.println(ch);
        }

        //Way2: String convert into Array
        int[] nums = {12,3,34,5};// nums[2]

        char[] chArr = st.toCharArray();
        System.out.println(Arrays.toString(chArr)); //[A, p, p, i, u, m]
        int arrSize = chArr.length;

        for(int i = 0;i<arrSize;i++){
           char ch =  chArr[i];
            System.out.println(ch);
        }
    }
}
