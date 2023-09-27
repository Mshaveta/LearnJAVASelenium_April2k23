package StringDemos;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s = "automationtesting";
        int size = s.length();
        System.out.println("Total Length of String - "+ size);
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < size; i++) {
            char currentChr = s.charAt(i);
            if (currentChr == 'a' || currentChr == 'e' || currentChr == 'i' || currentChr == 'o' || currentChr == 'u') {
                vCount++;
            } else {
                cCount++;
            }
        }

        System.out.println("Vowels Count - "+vCount);
        System.out.println("Consonants Count - "+cCount);
    }
}
