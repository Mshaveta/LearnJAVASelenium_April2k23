package Demos_ControlStatements.IfStatements;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        int day=7;

        int a = 10;
        int b = 20;
        int sum,sub,mul,div = 0;

        String opn = "sub";
        switch (opn) {
            case "add":
                System.out.println("Add Case...");
                sum = a + b;
                System.out.println("Sum is - " + sum);
                break;

            case "sub":
                sub = a - b;
                System.out.println("Subtraction is - " + sub);
                break;

            case "mul":
                mul = a * b;
                System.out.println("Multiplication is - " + mul);
                break;

            case "div":
                div = a / b;
                System.out.println("Div is - " + div);
                break;

            default:
                System.out.println("No match Found!");

        }

        System.out.println("Exit from Switch Case....");
    }
}
