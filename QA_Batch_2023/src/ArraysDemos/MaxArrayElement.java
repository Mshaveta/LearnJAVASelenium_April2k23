package ArraysDemos;

public class MaxArrayElement {
    public static void main(String[] args) {
        int[] numArr = {11, 34, 567, 86, 784, 3, 2};
        int size = numArr.length;
        int maxNum = 0;//784
        for (int index = 0; index < size; index++) {
           // System.out.println(numArr[index] +">"+ maxNum+" -> "+ (numArr[index] > maxNum));
            if(numArr[index] > maxNum){ //11>0-true, 34>11, 567>34, 86>567, 784>567
                maxNum = numArr[index]; //maxNum = 11
            }
        }
        System.out.println("MaxNumber Value - "+maxNum);
    }
}
