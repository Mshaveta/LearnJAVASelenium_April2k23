package Demos_Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        //AND - &&
        //OR -  ||
        // NOT - !
        int a=50;
        int b=100;
        int c=200;
        System.out.println((a>b) && (a>c)) ;//false
        System.out.println((a>b) || (a>c)) ;//false || false - false
        System.out.println(!(a>b));// !(false)--> true
    }
}
