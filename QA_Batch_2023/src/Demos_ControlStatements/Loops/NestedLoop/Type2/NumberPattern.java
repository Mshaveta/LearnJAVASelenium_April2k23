package Demos_ControlStatements.Loops.NestedLoop.Type2;

public class NumberPattern {
    public static void main(String[] args) {
        int count = 5;
        for (int row = 1; row <= count; row++) {//row=1->2
            for (int col = 1; col <= row; col++) {//col=1; 1<==1--true
                //System.out.print(row+" "); //
                System.out.print(col + " ");//1
            }
            System.out.println();
        }
    }
}

/*
1

 */
