public class subArraySum {

    public static int subArraySum(int arr[], int size, int sum){

        int currentSum = arr[0], start=0;

        for(int index=0; index<size; index++){

            while(currentSum>sum && start<index){
                currentSum -= arr[start];
                start++;
            }

            if(currentSum==sum){
                int result = index;
                System.out.println("Sum found between Indexes " + start + " and " + result);
                return 1;
            }

            if(index<size)
                currentSum += arr[index];
        }
        System.out.println("No SubArray found");
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {12,5,6,9,17,8,14};
        int sum = 14;
        subArraySum(arr, arr.length, sum);
    }
}
