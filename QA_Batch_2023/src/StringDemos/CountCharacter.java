package StringDemos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println("Please enter  String:");
        Scanner scn = new Scanner(System.in);
        String str = scn.next();//hello
        System.out.println("Please enter a charcater to find the occurences in String");
        char srchChr = scn.next().charAt(0); //l

        int strSize = str.length();
        // To compare th int, char use ---> ==
        // TO compare the String values use ---> equals()
        int chrCount = 0;
        for (int index = 0; index < strSize; index++) {
            char chr = str.charAt(index);
            // to count the occurence of
            if(chr == srchChr){ //h ==l,e ==l
                chrCount++;
            }
        }

        System.out.println("Occurrence of searched char "+ srchChr +" - "+ chrCount);


    }
}
