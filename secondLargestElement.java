import java.util.*;
public class secondLargestElement {

    public static void secondLargest(int arr[], int size){

        int index, first, second;

        first = second = Integer.MIN_VALUE;

        /* There should be atleast two elements */        
        if(size<2){
            System.out.println("Invalid Input");
            return;
        }

        for(index=0; index<size; index++){
            /* If current element is greater than
            first then update both first and second */
            if(arr[index]>first){
                second = first;
                first = arr[index];
            }
        
            /* If arr[i] is in between first and
            second then update second  */
            else if(arr[index]>second && arr[index]!=first)
                second = arr[index];
        }

        if(second==Integer.MIN_VALUE)
            System.out.println("There is NO Second Largest element !");
        else
            System.out.println("Second Largest element is : " +second);
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 10};
        secondLargest(arr, arr.length);
    }
}
