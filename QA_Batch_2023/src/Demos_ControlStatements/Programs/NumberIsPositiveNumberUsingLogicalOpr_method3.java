package Demos_ControlStatements.Programs;

public class NumberIsPositiveNumberUsingLogicalOpr_method3 {
    public static void main(String[] args) {
        int number= -100;
        if( number>0 || number <0 ){ // true 1 or false ---> true
            if(number>0){
                System.out.println("Number is positive");
            }else{
                System.out.println("Number is Negative");
            }
        }else{
            System.out.println("Number is Zero");
        }
    }

}
