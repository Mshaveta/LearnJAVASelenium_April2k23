package Demos_ControlStatements.Loops.NestedLoop.Type5;

public class Pattern2 {
    public static void main(String[] args) {
        int ttlRows = 15;
        int half = (ttlRows + 1) / 2; //3
        int loopTime = 0;
        int newNo =0;

        for (int row = 1; row <= ttlRows; row++) {

            if (row <= half) {
                loopTime = row+newNo ;
            }
            else{ // Row 4 & 5
                loopTime=loopTime-2;
            }

          //  System.out.println("loopTime Value.....: " + loopTime);//2

            for (int col = 1; col <= loopTime; col++) {
                System.out.print("* ");
            }
            System.out.println();//next line
            newNo++;

        }
    }
}
