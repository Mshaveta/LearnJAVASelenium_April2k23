package ArraysDemos;
/*
    for(datatype var_name :  arr_name){
    }
*/
public class ForeachLoopDemo {
    public static void main(String[] args) {
        int[] arr = {23,45,67,888,65};
        for( int value :  arr){
            System.out.println(value);
        }
        System.out.println("-----------------------------------------");
        String[] arrStr = {"Test1","Test2","Test3"};
        for( String value :  arrStr){
            System.out.println(value);
        }
    }
}
