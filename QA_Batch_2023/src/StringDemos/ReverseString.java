package StringDemos;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Mobile Banking";
        int size = str.length();
        int lastIndex = size - 1;

        for (int i = lastIndex; i >=0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
