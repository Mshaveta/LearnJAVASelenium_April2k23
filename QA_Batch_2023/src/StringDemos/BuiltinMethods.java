package StringDemos;

import java.util.Arrays;

/*
String starts with index number 0 same as Arrays
 */
public class BuiltinMethods {
    public static void main(String[] args) {
        String str = "Automation"; //['A','u','o']
        System.out.println("String length - " + str.length());//string also starts with index 0
        int size = str.length();
        System.out.println("Size of String - " + size);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));//A
        System.out.println(str.charAt(1));
        char ch = str.charAt(2);
        System.out.println(ch);

        //To convert the string into Arrays- [A,u,t,o,m,a,t,i,o,n] -- array of chrs
        char[] chArr = str.toCharArray();
        System.out.println(Arrays.toString(chArr)); //[A, u, t, o, m, a, t, i, o, n]

        char[] chrs = {'t', 'e', 's', 't'};
        System.out.println(Arrays.toString(chrs));

        String name = "KanikaVerma";
        System.out.println(name.indexOf("a"));

        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 6)); // excluded last index number--> [Index2-5]

        //Replace method
        String st = "abcdabcdabcdaaaabdddd";
        st = st.replace('a', 'z');
        System.out.println(st);//

        //split()
        String nameStr = "malhotra abc test automation";
        char[] nameArr = nameStr.toCharArray();
        System.out.println("Length of Array -"+ nameArr.length); // 28
        System.out.println(Arrays.toString(nameArr));//[m, a, l, h, o, t, r, a,  , a, b, c,  , t, e, s, t,  , a, u,
        // t, o, m, a, t, i, o, n]
        String[] strArr = nameStr.split(" "); //4
        System.out.println("Length of StrArray -"+ strArr.length); //
        System.out.println(Arrays.toString(strArr)); //[malhotra, abc, test, automation]

        String fullName="shaveta malhotra";
        String[] nameAr = fullName.split(" ");
        System.out.println(Arrays.toString(nameAr)); //[shaveta, malhotra]
        String firstName = nameAr[0];
        String lastName = nameAr[1];

        System.out.println("FirstName - "+firstName);
        System.out.println("LastName - "+lastName);

        String date="01/02/2023"; //01 , 02 , 2023
        String[] dateArr = date.split("/");
        System.out.println(Arrays.toString(dateArr)); //[01, 02, 2023]
        String day = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];

        System.out.println("day - "+ day);
        System.out.println("month - "+ month);
        System.out.println("Year - "+ year);

    }
}
