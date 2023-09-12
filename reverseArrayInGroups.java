import java.util.*;
public class reverseArrayInGroups {

    public static void arrayBeingReversed(int arr[], int size, int k){

        for(int index=0; index<size; index+=k){

            int left = index, temp;
            // "index + k - 1": This calculates the index 
            // of the last element in the current group.
            //  Adding k - 1 to index gives the offset from
            // the starting index to the last index within the group.

            // The Math.min() function is used to ensure that
            // the calculated right value does not exceed the
            // highest valid index of the array.
            
            int right = Math.min(index+k-1, size-1);

            // reverse the sub-array [left, right].
            while(left<right){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int arr[], int size){
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        arrayBeingReversed(arr, arr.length, 3);
        System.out.print("Array after reversed looks like : ");
        printArray(arr, arr.length);
    }
}
