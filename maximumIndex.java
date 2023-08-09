import java.util.*;
public class maximumIndex {

    public static int findingMaxIndex(int arr[], int size){

        Stack<Integer> stackObj = new Stack<>();

        //loop for storing index in stack whose value appears in decreasing order
        for(int index=0; index<size; index++){
            if(stackObj.isEmpty() || arr[stackObj.peek()]>arr[index])
                stackObj.push(index);
        }

        int maxDiffSoFar = 0, tempDiff, index = size-1;

        //Now we traverse from right to left.
        while(index>=0){
            /*
            This will compare top value of array at index stack top.
            if it satisfy our condition we check the difference  and update out result.
            else we decrement our counter
            */
            if(!stackObj.isEmpty() && arr[stackObj.peek()]<=arr[index]){
                tempDiff = index-stackObj.pop();
                    if(maxDiffSoFar<tempDiff){
                        maxDiffSoFar = tempDiff;
                }
                    continue;
            }
                index--;
        }
        return maxDiffSoFar;
    }

    public static void main(String[] args) {
        int arr[] = {18,17};
        System.out.print("Maximum Index in the Array is : " + findingMaxIndex(arr, arr.length));
    }
}
