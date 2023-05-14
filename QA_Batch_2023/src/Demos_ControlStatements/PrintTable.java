package Demos_ControlStatements.Loops;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter Table number - ");
        int tableNum = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " * "+ i + " = "+ (tableNum * i));
        }
    }
}
