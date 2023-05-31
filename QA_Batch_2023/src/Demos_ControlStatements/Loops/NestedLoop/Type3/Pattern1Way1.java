package Demos_ControlStatements.Loops.NestedLoop.Type3;

public class Pattern1Way1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n+1)-i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
