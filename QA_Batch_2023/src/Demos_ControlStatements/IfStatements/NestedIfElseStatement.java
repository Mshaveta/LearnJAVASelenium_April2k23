package Demos_ControlStatements.IfStatements;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        if (false) {
            System.out.println("outer if part...");
            if(true){
                System.out.println("inner if part...");
            }else{
                System.out.println("inner else part...");
            }
        }else{
            System.out.println("outer else part...");
            if(false){
                System.out.println("else .... inner if part...");
            }else{
                System.out.println("else....inner else part...");
            }
        }
    }
}
