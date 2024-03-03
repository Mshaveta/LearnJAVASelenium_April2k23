package Demos_ControlStatements.Loops.NestedLoop.Type2;

public class NumberPattern2 {
    public static void main(String[] args) {
        int printNum = 0;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(printNum + " ");//1-->2
                printNum++;
            }
            System.out.println();
        }
    }
}
