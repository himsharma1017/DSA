import java.util.*;
public class alternativeSorting {

    public static void sortingAlternate(int arr[], int size){

        Arrays.sort(arr);

        int i = 0, j = size-1;
        while(i<j){
        // Printing the last element of array
        // first and then first element and then
        // second last element and then second
        // element and so on.
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }
        // If the total element in array is odd
        // then print the last middle element.
           if(size % 2 !=0)
                System.out.print(arr[i]);
    }

    public static void main(String[] args) {
        int arr[] = {1, 12, 4, 6, 7, 10};
        System.out.print("Alternative Sorting would result in : ");
        sortingAlternate(arr, arr.length);
    }
}
