package Demos_ControlStatements.Programs;

import java.util.Scanner;

public class LargestNumber_usingNestedIfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter first  number:");
        int a = scn.nextInt();

        System.out.println("Please enter second  number:");
        int b = scn.nextInt();

        System.out.println("Please enter third  number:");
        int c = scn.nextInt();

        if( a>b ){
            if(a>c){
                System.out.println( a+ "  is largest number");
            }else{
                System.out.println( c+ " is largest number");
            }
        }else{
            if(b>c){
                System.out.println( b+ " is largest number");
            }else{
                System.out.println( c+ " is largest number");
            }
        }
    }
}
