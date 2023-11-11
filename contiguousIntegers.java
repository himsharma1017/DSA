import java.util.*;
public class contiguousIntegers {

    public static String checkingContinuity(int arr[], int size){

        Arrays.sort(arr);

        for(int index=1; index<size; index++){

            if(arr[index]!=arr[index-1]+1 && arr[index]!=arr[index-1])
                return "No !";
        }
        return "Yes.";
    }

    public static void main(String[] args) {
        int arr[] = {10, 14, 10, 12, 12, 13, 15};
        System.out.print("Whether array contains Contiguous Elements : ");
        String result = checkingContinuity(arr, arr.length);
        System.out.print(result);
    }
}
