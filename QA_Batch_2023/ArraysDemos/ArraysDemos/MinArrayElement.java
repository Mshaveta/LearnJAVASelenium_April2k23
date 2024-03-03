package ArraysDemos;

public class MinArrayElement {
    public static void main(String[] args) {
        int[] numArr = {1, 3, 567, 86, 784, 30, 12};
        int size = numArr.length;
        int minNum = numArr[0]; //1

        for (int index = 0; index < size; index++) {
           // System.out.println(numArr[index] +">"+ maxNum+" -> "+ (numArr[index] > maxNum));
            if((numArr[index] < minNum) ){ //567<1-false
                minNum = numArr[index]; //maxNum = 11
            }
        }

        System.out.println("MaxNumber Value - "+minNum);
    }
}
