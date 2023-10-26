import java.util.*;
public class productArrayPuzzle {

    public static int[] creatingProductArray(int arr[], int size){

        int leftproducts[] = new int[size];
        int rightproducts[] = new int[size];

        leftproducts[0] = 1;

        for(int index=1; index<size; index++){
            leftproducts[index] = leftproducts[index-1]*arr[index-1];
        }
        
        rightproducts[size-1] = 1;

        for(int index=size-2; index>=0; index--){
            rightproducts[index] = rightproducts[index+1]*arr[index+1];
        }

        int productarray[] = new int[size];

        for(int index=0; index<size; index++){
            productarray[index] = leftproducts[index]*rightproducts[index];
        }
        return productarray;
    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        System.out.print("Product Array looks like : ");
        int[] productarray = creatingProductArray(arr, arr.length);

        for(int index:productarray)
            System.out.print(index + " ");
    }
}
