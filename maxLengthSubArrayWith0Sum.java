import java.util.*;
public class maxLengthSubArrayWith0Sum {

    public static int maxLength(int arr[], int size){

        int sum = 0;                //Initialize sum of elements.
        int maxLength = 0;          //Initialize result.

        //Creates an Empty HashMap hashObj.
        HashMap<Integer, Integer> hashObj = new HashMap<>();

        //Traversing through the array.
        for(int index=0; index<size; index++){
           
            //Add current element to sum.
            sum = sum + arr[index];

            if(sum==0)
                maxLength = index + 1;

            //Looking this sum in HashTable.    
            Integer prevIndex = hashObj.get(sum);

            //If the sum is seen before, then update the maxLength if required.
            if(prevIndex!=null)
                maxLength = Math.max(maxLength, index-prevIndex);
            else                //Else put this sum in HashTable.
                hashObj.put(sum, index);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Length of the longest SubArray with Sum 0 is : " + maxLength(arr, arr.length));
    }
}
