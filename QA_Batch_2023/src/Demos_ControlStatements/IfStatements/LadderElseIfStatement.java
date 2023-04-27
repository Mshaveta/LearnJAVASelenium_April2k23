package Demos_ControlStatements.IfStatements;
/*
 if(expression / condition){
      //Statemnet1
 }else if(exp2){
     //Statement2
 }else if(exp3){
     //Statement3
 }else{
     //Statement4
 }
 */
public class LadderElseIfStatement {
    public static void main(String[] args) {
        if(false){
            System.out.println("if part");
        }else if(false){
            System.out.println("else if statement 2");
        }else if(false){
            System.out.println("else if statement 3");
        }else{
            System.out.println("else part....");
        }

        //Eg:
        int day=10;

        if(day==1){//false
            System.out.println("Sun");
        }else if(day==2){//false
            System.out.println("Mon");
        }else if(day==3){
            System.out.println("Tue");
        }else if(day==4){
            System.out.println("Wed");
        }else if(day==5){
            System.out.println("Thur");
        }else if(day==6){
            System.out.println("Fri");
        }else if(day==7){
            System.out.println("Sat");
        }else {
            System.out.println("Wrong Day!");
        }




    }
}
