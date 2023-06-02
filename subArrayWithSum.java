public class subArrayWithSum {

    public static int findingSubarray(int arr[], int size, int sum){

        int currentSum = arr[0], start = 0, index;
        
        for(index=1; index<=size; index++){
            if(currentSum>sum && start<index-1){
                currentSum = currentSum -arr[start];
                start++;
            }

            if(currentSum==sum){
                int lastIndex = index-1;
                System.out.println("Sub Array with the given sum is found between " + start + " and " + lastIndex);
                return 1;
            }

            if(index<size){
                currentSum = currentSum + arr[index];
            }
        }
        System.out.println("No Sub Array found.");
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        findingSubarray(arr, arr.length, sum);
    }
}
