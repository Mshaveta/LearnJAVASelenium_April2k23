package Demos_ControlStatements.Loops.NestedLoop.Type4;

public class Pattern3_HalfDiamond {
    public static void main(String[] args) {
        int n = 5;
        int num = 0;
        for (int row = 1; row <= n; row++) {

            //for spaces
            for (int sp = 1; sp <= n - row; sp++) {
                System.out.print("- ");
            }

            //for stars
            //way1: for(int j=1;j<= (row-1)+row ; j++){
            //Way2: for(int j=1;j<= num+row ; j++){
            //Way3:
            for (int j = 1; j <= ((2 * row) - 1); j++) {
                System.out.print("* ");
            }

            num++;

            //for next line
            System.out.println();
        }
    }
}
