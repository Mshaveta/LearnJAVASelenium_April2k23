package StringDemos;


public class ComparisonMethods {
    public static void main(String[] args) {
        String s = "Test";
        String s1 = "test";
        String s2 = "test";
        //compares m/m address or object references
        if (s == s1) {
            System.out.println("yes Matched!");
        } else {
            System.out.println("Not Matched!");
        }

        if (s1 == s2) {
            System.out.println("yes Matched!");
        } else {
            System.out.println("Not Matched!");
        }

        //compares values
        if (s.equals(s1)) {
            System.out.println("yes Matched!");
        } else {
            System.out.println("Not Matched!");
        }

        if (s1.equals(s2)) {
            System.out.println("yes Matched!");
        } else {
            System.out.println("Not Matched!");
        }

        //m/m allocation will  be in Heap
        String str = new String("Test"); // Heap --m/m1
        String str1 = new String("test");// Heap --m/m2
        String str2 = new String("test");// Heap --m/m3
        if (str1 == str2) {
            System.out.println("yes Matched!");
        } else {
            System.out.println("Not Matched!");
        }

        if (str1.equals(str2)) {
            System.out.println("yes Matched!");
        } else {
            System.out.println("Not Matched!");
        }
    }
}
