import java.util.*;
public class plusOne {

    public static int[] addingOne(int arr[], int size){

        // This represents the carry that is added 
        // to the least significant digit.
        int carry = 1;

        // This loop iterates through the input array 
        // from the least significant digit (last element)
        // to the most significant digit (first element).
        for(int index=size-1; index>=0; index--){

            int sum = arr[index]+carry;
            arr[index] = sum%10;
            carry = sum/10;
        }

        // This conditional block checks if there is 
        // any carry left after iterating through all digits.
        if(carry>0){

            int newNumber[] = new int[size+1];

            // The first element of the newNumber array is set to the carry.
            newNumber[0] = carry;

            // The rest of the elements in the newNumber array 
            // are copied from the original array, shifting one position to the right
            for(int index=1; index<size; index++){

                newNumber[index] = arr[index-1];
            }
            return newNumber;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4};
        int result[] = addingOne(arr, arr.length);

        for(int index:result)
            System.out.print(index + " ");
    }
}
