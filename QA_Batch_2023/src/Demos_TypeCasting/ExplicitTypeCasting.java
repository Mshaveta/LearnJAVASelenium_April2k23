package Demos_TypeCasting;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        long l = 1000L; //8 bytes
        int i = (int)l; //i = 4 bytes
        short s = (short)i;
        byte b = (byte) s;

        System.out.println("Value of i is - "+i + " and value of l is - "+l);
        System.out.println("Value of s is - "+s + " and value of b is - "+b);

        double d = 12.45;
        float f = (float) d;
        System.out.println("Value of d is - "+d + " and value of f is - "+f);

        int x=65;
        char ch = (char) x;
        System.out.println("Value of x is - "+x + " and value of ch is - "+ch);
    }
}
