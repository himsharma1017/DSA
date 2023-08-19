import java.util.*;
public class secondAndThirdSmallest {

    public static void smallestElements(int arr[], int size){

        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        if(size<2){
            System.out.println("Invalid Input !");
            return;
        }

        for(int index=0; index<size; index++){
            if(arr[index]<first){
                second = first;
                first = arr[index];
            }

            else if(arr[index]<second && arr[index]!=first)
                second = arr[index];
        }
        System.out.println("The second smallest element is " + second + " and the smallest element is " + first);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 7, 3, 6};
        smallestElements(arr, arr.length);
    }
}
