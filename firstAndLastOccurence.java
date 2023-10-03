import java.util.*;
public class firstAndLastOccurence {

    public static int[] combiningOccurences(int arr[], int size, int value){

        int result[] = new int[2];
        result[0] = firstOccurence(arr, size, value);
        result[1] = lastOccurence(arr, size, value);

        return result;
    }

    public static int firstOccurence(int arr[], int size, int value){

        Arrays.sort(arr);

        int left = 0, right = size-1, result = -1;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(arr[mid]==value){
                result = mid;
                right = mid-1;
            }

            else if(arr[mid]<value)
                left = mid+1;

            else
                right = mid-1;
        }
        return result;
    }

        public static int lastOccurence(int arr[], int size, int value){

        Arrays.sort(arr);

        int left = 0, right = size-1, result = -1;

        while(left<=right){

            int mid = left + (right-left)/2;

            if(arr[mid]==value){
                result = mid;
                left = mid+1;
            }

            else if(arr[mid]<value)
                left = mid+1;

            else
                right = mid-1;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4};
        int value = 5;
         
        int result[] = combiningOccurences(arr, arr.length, value);

        if(result[0]!=-1){
            System.out.println("First Occurence is at Index : " + result[0]);
            System.out.println("Last Occurence is at Index : " + result[1]);
        }

        else{
            System.out.println("Element not found !");
        }
    }
}
