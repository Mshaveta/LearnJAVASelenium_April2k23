package Demos_ControlStatements.Loops.NestedLoop.Type3;

public class Pattern1Way2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){ //i=1 ,2
            for(int j=n; j>=i; j--){ //j=5,5>=2--true || j=4, 4>=2-true || j=3,3>=3-true || j=2,2>=2-> true ||
                System.out.print("*");//* * * * * | ****
            }
            System.out.println();
        }
    }
}
