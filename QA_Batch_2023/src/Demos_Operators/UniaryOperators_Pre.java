package Demos_Operators;

//Uniary operator: can perform operations on single value
// Two type of operators: ++ (increment by 1),-- (decrement by 1) (pre,post)

public class UniaryOperators_Pre {
    public static void main(String[] args) {

//         int x=10; //x=10
//        //case 1:
//         ++x;
//         System.out.println("Value of x is - "+ x);
//
//        //case 2:
//        int y=1;
//        System.out.println("Value of y is - "+  ++y);
//        System.out.println("Value of y is - "+  y);
//
//        //case 3:
//        int z=5;
//        int a = ++z;//z=6, a=6
//        System.out.println("Value of a is - "+  a);//a=6
//        System.out.println("Value of z is - "+  z);//z=6

        //Ex:
        int a = 2;
        ++a;
        System.out.println("Value of a is - "+a);
        ++a;

        int b = a + ++a;
        ++b;

        System.out.println("Value of b is - "+b);

        int c = a + b + ++a + ++b;

        System.out.println("Value of a is - "+a);
        System.out.println("Value of b is - "+b);
        System.out.println("Value of c is - "+c);








    }
}
