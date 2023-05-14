package Demos_ControlStatements.Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter Amount- ");
        int amount = scn.nextInt();//2000

        if (amount>0) {
            if (amount >= 500) {
                int notes500Count = amount / 500;//notes count 2
                System.out.println("Count of 500 Notes is - " + notes500Count);
                amount = amount - (notes500Count * 500);//1200 - (2 *500)==200
                System.out.println("Pending Amount is - " + amount);
            }

            if (amount >= 100) {
                int notes100 = amount / 100;
                System.out.println("Count of 100 Notes is - " + notes100);

                amount = amount - (notes100 * 100);
                System.out.println("Pending Amount is - " + amount);
            }

            if (amount >= 50) {
                int notes50 = amount / 50;
                System.out.println("Count of 50 Notes is - " + notes50);

                amount = amount - (notes50 * 50);
                System.out.println("Pending Amount is - " + amount);
            }

            if (amount >= 20) {
                int notes20 = amount / 20;
                System.out.println("Count of 20 Notes is - " + notes20);

                amount = amount - (notes20 * 20);
                System.out.println("Pending Amount is - " + amount);
            }

            if (amount >= 10) {
                int notes10 = amount / 10;
                System.out.println("Count of 10 Notes is - " + notes10);

                amount = amount - (notes10 * 10);
                System.out.println("Pending Amount is - " + amount);
            }

            if (amount >=5) {
                int notes5 = amount / 5;
                System.out.println("Count of 5 Notes is - " + notes5);

                amount = amount - (notes5 * 5);
                System.out.println("Pending Amount is - " + amount);
            }

        }else{
            System.out.println("Pending Amount is Zero");
        }
    }
}
