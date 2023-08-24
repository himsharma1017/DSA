import java.util.*;
public class surpasserCount {

    /* Function to merge the two halves arr[l..m] and
    arr[m+1..r] of array arr[] */
    public static void merge(int arr[], int l, int m, int r, Map<Integer, Integer>hm){

        int n1 = m-l+1;
        int n2 = r-m;

         /* create temp arrays */
        int left[] = new int[n1];
        int right[] = new int[n2];

        /* Copy data to temp arrays left[] and right[] */
        for(int i=0; i<n1; i++)
            left[i] = arr[l+i];

        for(int j=0; j<n2; j++)
            right[j] = arr[m+1+j];

        /* Merge the temp arrays back into arr[l..r]*/    
        int i=0, j=0, k=l, c=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                 // increment inversion count of left[i]
                hm.put(left[i], hm.getOrDefault(left[i],0)+c);
                arr[k++] = left[i++];
            }
            else{
                // inversion found
                arr[k++] = right[j++];
                c++;
            }
        }

          /* Copy the remaining elements of left[], if
        there are any */
        while(i<n1){
            hm.put(left[i], hm.getOrDefault(left[i], 0)+c);
            arr[k++] = left[i++];
        }

          /* Copy the remaining elements of right[], if
        there are any */
        while(j<n2){
            arr[k++] = right[j++];
        }
    }

    /* l is for left index and r is right index of
    the sub-array of arr to be sorted */
    public static void mergeSort(int arr[], int l, int r, Map<Integer, Integer>hm){

        if(l<r){
            int m = l+(r-l)/2;

        mergeSort(arr, l, m, hm);
        mergeSort(arr, m+1, r, hm);
        merge(arr, l, m, r, hm);
        }
    }

    /* Function to print an array */
    public static void findSurpasser(int arr[], int size){

        // To store inversion count for elements
        Map<Integer, Integer> hm = new HashMap<>();
        
        // To store copy of array
        int dup[] = arr.clone();

        // Sort the copy and store inversion count
        // for each element.
        mergeSort(dup, 0, size-1, hm);

        System.out.print("Surpasser Count is : ");
        for(int index=0; index<size; index++){
            if(hm.containsKey(arr[index]))
                System.out.print((size-1)-index-hm.get(arr[index]) + " ");
            else
                System.out.print((size-1)-index + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 5, 3, 8, 1};

        System.out.println("Given Array is : " + Arrays.toString(arr));
        System.out.println();
        findSurpasser(arr, arr.length);
    }
}
