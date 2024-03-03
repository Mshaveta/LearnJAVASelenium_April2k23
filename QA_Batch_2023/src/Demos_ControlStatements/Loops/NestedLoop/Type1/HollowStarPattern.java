package Demos_ControlStatements.Loops.NestedLoop.Type1;

import java.util.Scanner;

public class HollowStarPattern {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        System.out.println("Please enter Total number of rows:");
        int rowCount = scn.nextInt();
        System.out.println("Please enter Total number of Cols:");
        int colCount = scn.nextInt();

        for(int row=1;row<=rowCount;row++){
            for(int col=1;col<=colCount;col++){
                if( row==1 ||row==rowCount || col==1 || col==rowCount ) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(); //Next Line
        }
    }
}
