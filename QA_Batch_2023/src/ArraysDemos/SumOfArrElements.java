package ArraysDemos;

public class SumOfArrElements {
    public static void main(String[] args) {
        int[] numArr = {12, 34, 56, 677, 888};
        int sum = 0;//12

        for (int i = 0; i < numArr.length; i++) {
           // int arrValue = numArr[i];
            sum = sum + numArr[i];//sum = 0+ 12=12
        }

        System.out.println(sum);//1667
    }
}
