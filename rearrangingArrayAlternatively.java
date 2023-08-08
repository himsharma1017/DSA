import java.lang.reflect.Array;
import java.util.*;
public class rearrangingArrayAlternatively {

    public static void rearrangingArray(int arr[], int size){

        int temp[] = arr.clone();

        int small = 0, large = size-1;

        boolean flag = true;

        for(int index=0; index<size; index++){
            if(flag)
                arr[index] = temp[large--];
            else
                arr[index] = temp[small++];

            flag = !flag;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.print("Original Array : ");
        System.out.print(Arrays.toString(arr));

        System.out.println("\n");

        System.out.print("Array after rearranging : ");
        rearrangingArray(arr, arr.length);
        System.out.print(Arrays.toString(arr));
    }
}
