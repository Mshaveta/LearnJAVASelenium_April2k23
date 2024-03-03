package Demos_ControlStatements.Loops;

import java.util.Scanner;

public class UserInputUsingForLoop {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Please enter " + i + " number - ");
            int a = scn.nextInt();///22
            sum = sum + a;//0 + 1=1
            System.out.println("Sum is - " + sum);
        }

        System.out.println("Exit from loop...");
        System.out.println("Sum is - " + sum);
    }
}
