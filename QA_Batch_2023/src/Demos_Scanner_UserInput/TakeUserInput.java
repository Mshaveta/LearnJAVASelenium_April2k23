package Demos_Scanner_UserInput;


import java.util.Scanner;

public class TakeUserInput {
    public static void main(String[] args) {
        // What -> creating an object of Scanner class - > java's builtin ->util pkg
        //Why-> To access the properties and methods of Scanner class
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter values");
        byte b = scn.nextByte();
        System.out.println("Value of byte b is - "+b);
        short s = scn.nextShort();
        System.out.println("Value of short s is - "+s);
        int number1 = scn.nextInt();
        System.out.println("Value of int number1 is - "+number1);
        long l = scn.nextLong();
        System.out.println("Value of long l is - "+l);
        float ft = scn.nextFloat();
        System.out.println("Value of float ft is - "+ft);
        double d = scn.nextDouble();
        System.out.println("Value of double  is - "+d);
        char ch = scn.next().charAt(0);//
        System.out.println("Value of char is - "+ch);
        boolean bl = scn.nextBoolean();
        System.out.println("Value of boolean bl is - "+bl);



    }
}
