package Demos_ControlStatements.Loops.NestedLoop.Type4;

public class Pattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=n; row++){

             //for spaces
             for(int sp=1;sp<= n-row; sp++){
                 System.out.print("- ");
             }

             //for stars
             for(int st=1;st<= row; st++){
                 System.out.print("* ");
             }

             //for next line
            System.out.println();
        }
    }
}
