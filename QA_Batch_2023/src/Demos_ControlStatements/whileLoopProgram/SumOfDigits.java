package Demos_ControlStatements.Loops.whileLoopProgram;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
1+2+3
%, /
sum
 */
public class SumOfDigits {
    //class area
    public static void main(String[] args) {
        //method area
        Scanner scn =  new Scanner(System.in);
        System.out.println("Please enter any number:");
        int num = scn.nextInt(); // 123->12
        int sum = 0; //3-->5
        int rem = 0;

        while(num>0){ //1. 123>0, 2. 12>0, 1>0
            rem = num %10;//3, 12 %10 -->2, 1%10-->1
            sum = sum + rem; // sum = 0+ 3 =3,  3+2 =5, 5+1=6
            num = num/10; // num = 123/10 --> 12, 12/10--> 1

//            System.out.println("Rem is "+ rem);
//            System.out.println("Sum is "+ sum);
//            System.out.println("Number is "+ num);
//            System.out.println("------------------------------");
        }

        System.out.println("Sum is "+ sum);
    }
    //class area
}
