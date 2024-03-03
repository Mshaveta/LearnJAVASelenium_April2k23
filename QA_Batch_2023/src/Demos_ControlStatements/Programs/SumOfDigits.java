package Demos_ControlStatements.Programs;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter any number between 0 to 1000");
        int number =  scn.nextInt();
         if(number>=0 && number <=1000){
             //Sum of digits logic
             System.out.println("Write login to find the Sum of digits");
         }else{
             System.out.println("Please enter the values between range 0-1000");
         }
    }
}
