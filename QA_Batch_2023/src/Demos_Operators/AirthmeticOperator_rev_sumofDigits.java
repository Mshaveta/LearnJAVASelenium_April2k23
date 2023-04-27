package Demos_Operators;

public class AirthmeticOperator_rev_sumofDigits {
    public static void main(String[] args) {
        int num=567;
        System.out.println("Value of num - "+num);
        int digit1 = num%10; //2
        System.out.println("Value of digit1 - "+digit1);

        num = num/10;//54
        System.out.println("Value of num - "+num);

        int digit2 = num%10; //2
        System.out.println("Value of digit2 - "+digit2);

        int digit3 = num/10; //2
        System.out.println("Value of digit3- "+digit3);
        System.out.print("Sum of digits is ");
        System.out.println(digit1+digit2+digit3);
        System.out.println("---------------");

        System.out.print("Reverse of a number ");
        System.out.println(""+digit1+digit2+digit3);


    }
}
