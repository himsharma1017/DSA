import java.util.*;
public class mergingTwoSortedArrays {

    public static int[] sortedArrayMerged(int arr1[], int size1, int arr2[], int size2){

        int[] mergedArr = new int[size1+size2];

        System.arraycopy(arr1,0,mergedArr,0,size1);
        System.arraycopy(arr2,0,mergedArr,size1,size2);

        Arrays.sort(mergedArr);
       
        return mergedArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 10, 5, 15};
        int[] arr2 = {20, 0, 2};
        int[] result = sortedArrayMerged(arr1, arr1.length, arr2, arr2.length);
        System.out.println(Arrays.toString(result));
    }
}
