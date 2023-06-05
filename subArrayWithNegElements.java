import java.util.*;
public class subArrayWithNegElements {

    public static void findingSubArrayOfNegElements(int arr[], int size, int sum){

        int currentSum = 0, start = 0, end = -1;
        HashMap<Integer, Integer> hashObj = new HashMap<>();

        for(int index=0; index<size; index++){

            currentSum = currentSum + arr[index];

            if(currentSum-sum==0){
                start = 0;
                end = index;
                break;
            }

            if(hashObj.containsKey(currentSum-sum)){
                start = hashObj.get(currentSum-sum) + 1;
                end = index;
                break;
            }

            hashObj.put(currentSum, index);
        }

        if(end==-1)
            System.out.println("No SubArray with the given sum exists.");
        else
            System.out.println("SubArray with the given sum exists between indices " + start + " till " + end);
    }
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        int sum = -10;
        findingSubArrayOfNegElements(arr, arr.length, sum);        
    }
}
