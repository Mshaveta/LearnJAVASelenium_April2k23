package ArraysDemos;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = {11, 2, 30, 45, 6, 10, 100, 1};

        int min = arr[0];//2
        int scndMin = arr[0];//11
        int minIndex = 0;//1
        int scndMinIndex = 0;//0

        for (int index = 0; index < arr.length; index++) {//index=1
            if (arr[index] < min) { //2<11--true
                scndMin = min; //scdMin = 11
                scndMinIndex = minIndex; //scndMinIndex =0
                min = arr[index]; //min = 2
                minIndex = index;//index=1

            } else if (arr[index] < scndMin) {
                scndMin = arr[index];
                scndMinIndex = index;
            }
        }

        System.out.println("Second Min - " + scndMin + " index - " + scndMinIndex);
        System.out.println(" Min - " + min + " index - " + minIndex);

    }
}
