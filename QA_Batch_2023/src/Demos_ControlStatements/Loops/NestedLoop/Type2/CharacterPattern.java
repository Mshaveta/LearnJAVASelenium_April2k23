package Demos_ControlStatements.Loops.NestedLoop.Type2;

public class CharacterPattern {
    public static void main(String[] args) {
        int count=5;
        char ch ;
        for(int row=1;row<=count;row++){
             ch='a';
            for(int col=1;col<=row; col++){
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
