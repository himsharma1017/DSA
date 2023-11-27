import java.util.*;

public class atleast2GreaterElem {

    public static void findingAtleast2Elem(int arr[], int size) {

        int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE;

        for (int index = 0; index < size; index++) {

            if (arr[index] > maxA) {
                maxB = maxA;
                maxA = arr[index];
            }

            else if (arr[index] > maxB)
                maxB = arr[index];
        }

        System.out.print("All the elements except 2 Greatest elements are : ");
        for (int index : arr) {
            if (index == maxA || index == maxB) {
                continue;
            }
            System.out.print(index + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, -2, 3, 4, 9, -1 };
        findingAtleast2Elem(arr, arr.length);
    }
}
