package Demos_ControlStatements.Loops.NestedLoop.Type2;
/*
 	1	2	3	4	5
1	1
2	2	2
3	3	3	3
4	4	4	4	4
5	5	5	5	5	5


 */
public class NumberPattern4 {
    public static void main(String[] args) {
        int printNum = 1;
        for(int i=1; i<=4; i++){
            //Row Area

             /// As row chnages ---> variable set to 1
            for(int j=1; j<=i; j++){
                //col Area
                System.out.print(printNum + " ");//1-->2
            }

            printNum++;//2
            //Row Area
            System.out.println();
        }
    }
}
