package Demos_Operators;

//Uniary operator: can perform operations on single value
// Two type of operators: ++ (increment by 1),-- (decrement by 1) (pre,post)

public class UniaryOperators_Mix {
    public static void main(String[] args) {

        //Ex1:
//        int a = 2;
//        int b =  5;
//        int c = a++ + b++ + a + ++b + ++a;
//        System.out.println("value of a is = "+ a);
//        System.out.println("value of b is = "+ b);
//        System.out.println("value of c is = "+ c);
//
//        //Ex2:
//        int x=11;
//        System.out.println(x++ + ++x );
//        System.out.println(x);
//
//
//        //Ex3:
//        int m =100;
//        m++ ;
//        ++m ;
//        int n = m + ++m + m++ + m;
//        System.out.println(n);
//        System.out.println(m);
//
//        n++;
//        System.out.println(++n);


        //Ex4:
        int a=5;
        byte b = 6;
        long l = 10;
        int c = (int) (a++ + b++ + l++ + a+b+l);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);



    }
}
