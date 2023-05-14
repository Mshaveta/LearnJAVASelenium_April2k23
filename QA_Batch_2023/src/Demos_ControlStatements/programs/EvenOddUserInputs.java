package Demos_ControlStatements.Loops.programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenOddUserInputs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("please enter the ttl count of numbers to find the Even & odd");
        int ttlNumbersCount = scn.nextInt();//20

        for (int i = 1; i <= ttlNumbersCount; i++) {

            System.out.println("Please enter "+ i +" number to find the even or odd");
            int number = scn.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is Even number");
            } else {
                System.out.println(number + " is Odd number");
            }
        }
    }
}
