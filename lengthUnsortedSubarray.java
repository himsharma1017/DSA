import java.util.*;
public class lengthUnsortedSubarray {

    public static int[] findingLengthOfUnsortedArray(int arr[], int size){

        // int sortedArray[] = new int[size];
        // Arrays.sort(arr);

        int start = 0, end = size-1;

        //  It checks whether the current element Arr[start] 
        // is less than or equal to the next element Arr[start + 1].
        // If so, it means the array is in order up to this point, and 
        // start is incremented.
        while(start<size-1 && arr[start]<=arr[start+1]){
            start++;
        }

        // // If start reached N-1, the array is already sorted.
        if(start==size-1)
            return new int[]{-1,-1}; // No subarray found.

        // It checks whether the current element Arr[end] 
        // is greater than or equal to the previous element 
        // Arr[end - 1]. If so, it means the array is in order
        // up to this point, and end is decremented.
        while(end>0 && arr[end]>=arr[end-1]){
            end--;
        }
        // After the loop, the end index is incremented 
        // by one to include the rightmost out-of-order 
        // element in the subarray that needs to be sorted.
        end++;

        return new int[]{start,end};
    }

    public static void main(String[] args) {
        int arr[] = {10,12,20,30,25,40,32,31,35,50,60};
        System.out.print("First and Last Index of Unsorted Array is : ");
        int result[] = findingLengthOfUnsortedArray(arr, arr.length);

        System.out.print(result[0] + " "  + result[1]);
    }
}
