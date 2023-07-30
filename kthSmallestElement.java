import java.util.*;
public class kthSmallestElement {

    public static int smallestElementInArray(int arr[], int size,int k){

        Arrays.sort(arr);

        return arr[k-1];
    }

    public static void main(String[] args) {
        int arr[] = {7 ,10, 4, 20, 15};
        int k = 4;
        System.out.println("The " + k +"th Element in the Array is : " + smallestElementInArray(arr, arr.length, k));
    }
}
