package Demos_Operators;

//Uniary operator: can perform operations on single value
// Two type of operators: ++ (increment by 1),-- (decrement by 1) (pre,post)

public class UniaryOperators_Post {
    public static void main(String[] args) {

//        int x=10;//x=10
//        //case1:
//        x++;//x=11
//        x++;//x=12
//        x++;//x=13
//
//        System.out.println("Case1: Value of x is - "+ x);

        //Case2 :

//        int y=5; //y=5
//        int z = y++; //z = 5, y= 6
//        z++;
//        y++;
//        System.out.println("Value of y is - "+y);//7
//        System.out.println("Value of z is - "+z);//6


        //case3:
//        int a = 15;
//        System.out.println(a++);//15, a=16
//        System.out.println(a);


        //All Cases:
        int m = 5;
        m++;
        int n = m++;
        n++;

        int o = m++ + n++ + m + n;
        System.out.println("Value of m is - "+m);
        System.out.println("Value of n is - "+n);
        System.out.println("Value of o is - "+o);

    }
}
