public class exceptionallyOdd {

    public static int oddNumberOfTimes(int arr[], int size){

        int result = 0, index = 0;

        for(index=0; index<size; index++){
            
            // The caret symbol (^) represents the bitwise XOR operator.
            // By using the XOR operation, the code effectively 
            // cancels out the occurrences of the same element 
            // that appear an even number of times, leaving only
            // the element that occurs an odd number of times in 
            // the final result
            result = result^arr[index];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 2, 7, 5, 2, 5};
        System.out.println("Element which occurs Odd number of times : " + oddNumberOfTimes(arr, arr.length));
    }
}
