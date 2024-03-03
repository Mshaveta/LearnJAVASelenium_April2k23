package Demos_ControlStatements.Loops.NestedLoop.Type3;

public class Pattern2Way2 {
    public static void main(String[] args) {
        int n = 5;
        int printNum=5;
        for (int i = 1; i <= n; i++) {

            //Row Level
            for (int j = 1; j <= (n + 1) - i; j++) {
                System.out.print(printNum);//55555
                //Col Level
            }
            printNum--;//5-4
            //Row Level
            System.out.println();
        }
    }
}
