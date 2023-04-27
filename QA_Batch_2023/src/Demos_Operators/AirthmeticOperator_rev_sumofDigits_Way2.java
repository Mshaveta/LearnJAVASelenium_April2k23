package Demos_Operators;

import java.util.Scanner;

public class AirthmeticOperator_rev_sumofDigits_Way2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num  = scn.nextInt();
        int rev=0;
        int rem=0;

        // find first digit
        rem = num%10;
        rev= rev*10 + rem;
        num = num/10;
//        System.out.println("Remainder is - "+ rem);
//        System.out.println("Reverse of a number is = "+ rev);
//        System.out.println("Number is - "+ num);

        //find 2nd digit
        rem = num%10;
        rev= rev*10 + rem;
        num = num/10;
//        System.out.println("Remainder is - "+ rem);
//        System.out.println("Reverse of a number is = "+ rev);
//        System.out.println("Number is - "+ num);

        rem = num%10;
        rev= rev*10 + rem;
       // System.out.println("Remainder is - "+ rem);
        System.out.println("Reverse of a number is = "+ rev);


    }
}
