package StringDemos;

public class StringBasics {
    public static void main(String[] args) {
        //String id immutable -  Example
        String str = "TEST";
        System.out.println("Before - "+str);
        str.toLowerCase( );
        System.out.println("After - "+str);

        str=str.toLowerCase( );
        System.out.println("After - "+str);

        //way2: Create String using new keyword
        String st = new String("testing");
        System.out.println(st);
        st.toUpperCase();
        System.out.println(st);

        st = st.toUpperCase();
        System.out.println(st);

        //Examples
        int x=10;
        int y=20;
        System.out.println("Values are "+x+y);
        System.out.println(x+y+" Values are");
        System.out.println("Values are "+(x+y));

    }
}
