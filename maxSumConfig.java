public class maxSumConfig {

    public static int findPivot(int arr[], int size){

        for(int index=0; index<size; index++){
            if(arr[index]>arr[(index+1)%size])
                return index;
        }
        return -1;
    }

    public static int maxSum(int arr[], int size){

        int sum = 0;
        int pivot = findPivot(arr, size);

        // difference in pivot and index of
        // last element of array.
        int diff = size-1-pivot;

        for(int index=0; index<size; index++){

            sum = sum+((index+diff)%size)*arr[index];

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1};
        System.out.print("Maximum sum configuration is : " + maxSum(arr, arr.length));

    }
}
