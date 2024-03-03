package Demos_ControlStatements.Loops.NestedLoop.Type5;

public class Pattern1 {
    public static void main(String[] args) {
        int ttlRows = 5;
        int half = (ttlRows + 1) / 2; //3
        int loopTime = 0;

        for (int row = 1; row <= ttlRows; row++) {//row=1,1<=5 | 2, 2<=5--true

            if (row <= half) { //1<=3-true,2<=3 -true,4<=3-false, else part move
                loopTime = row; //loopTime=1,2,3
            }
            else{ // Row 4 & 5
                loopTime--;//3->2--<1
            }

            //System.out.println("loopTime Value: " + loopTime);//2

            for (int col = 1; col <= loopTime; col++) { //col=1 , 1<=1 -- 1 time,2<=1--false | col<=2, 1<=2,2<=2
                System.out.print("* ");//Row 1-3--> 1,2,3 || Row-4,5----> 2,1
            }
            System.out.println();//next line
        }
    }
}
