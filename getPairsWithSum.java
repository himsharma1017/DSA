import java.util.*;
public class getPairsWithSum {

    public static int getPairWithCount(int arr[], int size, int sum){

        int count = 0;
        HashMap<Integer, Integer> hashObj = new HashMap<>();

        for(int index=0; index<size; index++){
            if(hashObj.containsKey(sum-arr[index]))
                count = count + hashObj.get(sum-arr[index]);
            
            if(hashObj.containsKey(arr[index]))
                hashObj.put(arr[index], hashObj.get(arr[index]+1));

            else
                hashObj.put(arr[index], 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, -1, 5};
        System.out.println("Count of pairs with given sum is : " + getPairWithCount(arr, arr.length, 6));
    }
}
