package ArraysDemos;

public class FindINedxNumberOfElmn {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 5, 78, 99, 1324};
        int searchElement = 1134;
        int size = arr.length;//7
        int searchedIndexNum = 0;
        boolean isFound = false;
        for (int index = 0; index < size; index++) {
            if (searchElement == arr[index]) {
                searchedIndexNum = index;
                isFound = true;
            }
        }

        if(isFound){
            System.out.println("Index No of serachedElement is - "+ searchedIndexNum);
        }else{
            System.out.println("Element not Found!");
        }

    }
}
