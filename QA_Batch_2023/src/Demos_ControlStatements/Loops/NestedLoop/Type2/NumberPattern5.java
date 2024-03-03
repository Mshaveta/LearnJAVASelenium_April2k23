package Demos_ControlStatements.Loops.NestedLoop.Type2;
/*
	1	2	3	4
1	1
2	2	3
3	3	4	5
4	4	5	6	7

 */
public class NumberPattern5 {
    public static void main(String[] args) {
        //  int printNum = 1;
        for(int i=1; i<=5; i++){
            //Row Area
             int printNum = i;
             /// As row chnages ---> variable set to 1
            for(int j=1; j<=i; j++){
                //col Area
                System.out.print(printNum + " ");//1-->2
                printNum++; //collevel val inc --done
            }

            //Row Area
            System.out.println();
        }
    }
}
