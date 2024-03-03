package Demos_ControlStatements.Programs;

public class LargestNumber_usingLadderIfElse {
    public static void main(String[] args) {
        int a=1000;
        int b=120;
        int c = 100;

        if( (a>b) && (a>c) ){
            System.out.println("a is largest number");
        }else if( (b>a) && (b>c) ){
            System.out.println("b is largest number");
        }else{
            System.out.println("c is largest number");
        }
    }
}
