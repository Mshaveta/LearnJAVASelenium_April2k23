package StringDemos;

import java.util.Arrays;
/*
String starts with index number 0 same as Arrays
 */
public class BuiltinMethods {
    public static void main(String[] args) {
        String str = "Automation"; //['A','u','o']
        System.out.println( "String length - "+ str.length() );//string also starts with index 0
        int size = str.length();
        System.out.println("Size of String - "+ size);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));//A
        System.out.println(str.charAt(1));
        char ch = str.charAt(2);
        System.out.println(ch);

        //To convert the string into Arrays- [A,u,t,o,m,a,t,i,o,n] -- array of chrs
        char[] chArr = str.toCharArray();
        System.out.println(Arrays.toString(chArr)); //[A, u, t, o, m, a, t, i, o, n]

        char[] chrs = {'t','e','s','t'};
        System.out.println(Arrays.toString(chrs));

        String name = "KanikaVerma";
        System.out.println(name.indexOf("a"));

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,6)); // excluded last index number--> [Index2-5]

    }
}
