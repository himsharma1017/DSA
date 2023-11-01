import java.util.*;
public class elemWithLeftSIdeSmallerAndRightGreater {

    public static int uniqueElement(int arr[], int size){

        int leftMax[] = new int[size];
        int rightMin[] = new int[size];

        // This initializes the first element of the 
        // leftMax array to the smallest possible integer
        // value (Integer.MIN_VALUE), as there are no elements
        // to the left of the first element.
        leftMax[0] = Integer.MIN_VALUE;

        for(int index=1; index<size; index++){
            leftMax[index] = Math.max(leftMax[index-1], arr[index-1]);
        }

        // This initializes the last element of the rightMin 
        // array to the largest possible integer value (Integer.MAX_VALUE),
        // as there are no elements to the right of the last element.
        rightMin[size-1] = Integer.MAX_VALUE;

        for(int index=size-2; index>=0; index--){
            rightMin[index] = Math.min(rightMin[index+1], arr[index+1]);
        }

        // This loop iterates through the array (except the first and last elements) 
        // and checks if the current element satisfies the given condition.
        for(int index=1; index<size-1; index++){
            if(arr[index]>=leftMax[index] && arr[index]<=rightMin[index])
                return arr[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 7};
        int result = uniqueElement(arr, arr.length);

        if(result!=-1)
            System.out.print("Element which has left side smaller and right side greater : " + result);
        else
            System.out.println("No such Element exists !");
    }
}
