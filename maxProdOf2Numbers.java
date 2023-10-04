import java.util.*;
public class maxProdOf2Numbers {
    
    public static int prodOfMaxValues(int arr[], int size){

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for(int index=0; index<size; index++){

            if(arr[index]>max1){
                max2 = max1;
                max1 = arr[index];
            }
            else if(arr[index]>max2)
                max2 = arr[index];
        }
        return max1*max2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 100, 42, 4, 23};
        int result = prodOfMaxValues(arr, arr.length);
        System.out.print("Product of 2 Maximum Numbers : " + result);
    }
}
