package Demos_TypeCasting;

public class ImplicitTypeCasting {
    public static void main(String[] args)
    {
        System.out.println("ImplicitTypeCasting Demo...");
        byte b = 10; //1 byte
        short s = b; //2 bytes
        int i = s;//4
        long l = i;

        System.out.println("Value of b is - "+b+"  and Value of s is - "+ s);
        System.out.println("Value of i is - "+i+"  and Value of l is - "+ l);



        float f = 12.34f;//4
        double d = f;
        System.out.println("Value of f is - "+f+"  and Value of d is - "+ d);

        char ch = 'A';
        int x = ch;//65

        System.out.println("Value of ch is - "+ch+"  and Value of x is - "+ x);

        boolean bool =  true;
        System.out.println("Value of ch is - "+ch+"  and Value of x is - "+ x);
    }
}
