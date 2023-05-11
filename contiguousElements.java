import java.util.*;
public class contiguousElements {

    public static boolean elementsAreContiguous(int arr[], int size){
        Arrays.sort(arr);

        for(int index=1; index<size; index++){
            if((arr[index]-arr[index-1])>1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {10, 14, 10, 12, 12, 13, 15};
        elementsAreContiguous(arr, arr.length);
        
        if(elementsAreContiguous(arr, arr.length))
            System.out.println("Yes");
        
        else
            System.out.println("No");
    }
}
