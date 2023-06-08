public class equilibriumPointInArray {

    public static int findingEqulibrium(int arr[], int size){

        int sum = 0, leftSum=0;

        //Find sum of the whole array.
        for(int index=0; index<size; index++)
            sum = sum +arr[index];

        //sum is now right sum for index.
        for(int index=0; index<size; index++){
            sum = sum - arr[index];

            if(leftSum==sum)
                return index;

            leftSum = leftSum + arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println("Equilibrium point in the Array is at index : " + findingEqulibrium(arr, arr.length));
    }
}
