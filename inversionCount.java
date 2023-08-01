import java.util.*;
public class inversionCount {

    public static int mergeAndCount(int arr[], int l, int mid, int r){

        // Left SubArray
        int left[] = Arrays.copyOfRange(arr, l, mid+1);

        // Right SubArray
        int right[] = Arrays.copyOfRange(arr, mid+1, r+1);

        int i = 0, j = 0, k = l, swaps = 0;

        while(i<left.length && j<right.length){
            if(left[i]<=right[j])
                arr[k++] = left[i++];
            else{
                arr[k++] = right[j++];
                swaps = swaps+(mid+1)-(l+i);
            }
        }

        while(i<left.length)
            arr[k++] = left[i++];

        while(j<right.length)
            arr[k++] = right[j++];

        return swaps;
    }

    public static int mergeSortAndCount(int arr[], int l, int r){

        // Keeps track of the inversion count at a
        // particular node of the recursion tree.
        int count = 0;

        if(l<r){
            int m = (l+r)/2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count.

            // Left subarray count.
            count = count+mergeSortAndCount(arr, l, m);

             // Right subarray count.
            count = count+mergeSortAndCount(arr, m+1, r);

            // Merge count.
            count = count+mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {8, 4, 2, 1};
        System.out.print("Inversion Count in the Array is : " + mergeSortAndCount(arr, 0, arr.length-1));
    }
}