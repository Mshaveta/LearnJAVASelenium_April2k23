package Demos_ControlStatements.Loops.NestedLoop.Type2;

public class StarPattern1 {
    public static void main(String[] args) {
        int count=5;
        for(int row=1;row<=count;row++){
            for(int col=1;col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
