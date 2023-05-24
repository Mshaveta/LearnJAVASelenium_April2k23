package Demos_ControlStatements.Loops.NestedLoop.Type2;
/*
row/col	1	2	3	4	5
1	1
2	1	2
3	1	2	3
4	1	2	3	4
5	1	2	3	4	5

 */
public class NumberPattern3 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            //Row Area
            int printNum = 1; /// As row chnages ---> variable set to 1
            for(int j=1; j<=i; j++){
                //col Area
                System.out.print(printNum + " ");//1-->2
                printNum++;
            }

            //Row Area
            System.out.println();
        }
    }
}
