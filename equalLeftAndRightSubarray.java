public class equalLeftAndRightSubarray {

    public static int dividingTheArrayInHalf(int arr[], int size){

        int sum = 0, leftSum = 0;

        for(int index=0; index<size; index++)
            sum = sum+arr[index];

        for(int index=0; index<size; index++){

            sum = sum-arr[index];

            if(leftSum==sum)
                return index;
            else
                leftSum = leftSum+arr[index];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3};
        System.out.print("Index at which the Array is equal from Left and Right : ");
        int result = dividingTheArrayInHalf(arr, arr.length);
        System.out.print(result);
    }
}
