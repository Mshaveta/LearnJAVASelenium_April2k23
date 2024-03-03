package Demos_ControlStatements.Loops.NestedLoop.Type1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Please enter Total number of rows:");
        int rowCount = scn.nextInt();
        System.out.println("Please enter Total number of Cols:");
        int colCount = scn.nextInt();

        for(int row=1;row<=rowCount;row++){
            for(int col=1;col<=colCount;col++){
                System.out.print("* ");
            }
            System.out.println(); //Next Line
        }
    }
}
