import java.util.*;
public class maxProductSubarray {

    public static int maximumProduct(int arr[], int size){

        // Max/Min positive/negative product ending
        // at the current position.
        int maxEndingHere = arr[0], minEndingHere = arr[0];
        
        // Initialize overall max product.
        int maxSoFar = arr[0];

        // Traverse through the array. The maximum product
        // subarray ending at an index will be the maximum of the 
        //element itself, the product of element and max product ending
        //previously and the min product ending previously.
        for(int index=1; index<size; index++){

            int temp = Math.max(Math.max(arr[index], arr[index]*maxEndingHere), arr[index]*minEndingHere);
            minEndingHere = Math.min(Math.min(arr[index], arr[index]*maxEndingHere), arr[index]*minEndingHere);
            maxEndingHere = temp;
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, -1, 0};
        System.out.println("Maximum product in the Array is : " + maximumProduct(arr, arr.length));
    }
}
