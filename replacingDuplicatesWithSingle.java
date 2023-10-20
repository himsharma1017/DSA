import java.util.*;
public class replacingDuplicatesWithSingle {

    public static void removingDuplicates(int arr[], int size){

        for(int index=1; index<size; index++){
            if(arr[index]!=arr[index-1])    
                System.out.print(arr[index] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2};
        System.out.print("Removing Duplicate Elements : ");
        System.out.print(arr[0] + " ");
        removingDuplicates(arr, arr.length);
    }
}
