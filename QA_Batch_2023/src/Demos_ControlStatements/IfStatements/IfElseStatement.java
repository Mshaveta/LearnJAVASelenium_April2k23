package Demos_ControlStatements.IfStatements;
/*
 if(expression / condition){
      //Statemnet1
 }else{
     //Statement2
 }
 */
public class IfElseStatement {
    public static void main(String[] args) {
        if(false){
            System.out.println("if part...");
        }else{
            System.out.println("if result of cond/exp is false then it will print this statement");
        }

        //Find the largest number

        if(100<530){ //false
            System.out.println("Yes, 100 is greater than 30");
        }else{
            System.out.println("No, 30 is lesser than 100");
        }



    }
}
