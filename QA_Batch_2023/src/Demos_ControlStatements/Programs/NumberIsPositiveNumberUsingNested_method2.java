package Demos_ControlStatements.Programs;

public class NumberIsPositiveNumberUsingNested_method2 {
    public static void main(String[] args) {
        int number= 0;
        if(number!=0){ // 0!=0--->
            if(number>0){
                System.out.println("Number is Positive");
            }else{
                System.out.println("Number is Negative");
            }
        }else{
            System.out.println("Number is Zero");
        }
    }
}
