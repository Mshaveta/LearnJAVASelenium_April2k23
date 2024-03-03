package StringDemos;

import java.util.Arrays;

/*
HonestPerson
JAVASQLPYTHON
 */
public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "JAVA SQL PYTHON";
        String resStr = "";
        /*
        charAt()
         */

        for (int i = 0; i < s.length(); i++) {
            char currentChr = s.charAt(i);
            if (currentChr != ' ') {
                resStr += currentChr;//J
                //or resStr = resStr + currentChr;
                System.out.println(i + " - " + resStr);
            }
        }
        System.out.println("New String- " + resStr);

        /*
        toCharArray() returns char type Array

         */
        char[] charArr = s.toCharArray(); //[J, A, V, A,  , S, Q, L,  , P, Y, T, H, O, N]
        System.out.println(Arrays.toString(charArr));
        String newStr = "";
        for (int i = 0; i < charArr.length; i++) {
            char currentChr = charArr[i];
            if (currentChr != ' ') {
                newStr += currentChr;//J
                //or newStr = newStr + currentChr;
                System.out.println(i + " - " + newStr);
            }
        }
        System.out.println("New String- " + newStr);


        //best way:
        String[] strArr = s.split(" ");
        System.out.println(Arrays.toString(strArr)); //[JAVA, SQL, PYTHON]
        String newStrValue = "";
        for (int i = 0; i < strArr.length; i++) {
            //newStrValue += strArr[i];
            newStrValue = newStrValue+ strArr[i];
        }
        System.out.println(newStrValue);


    }
}
