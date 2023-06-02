public class identifyingSequence {

    public static int findingMissingNo(int arr[], int size){

        int sum = ((size+1)*(size+2))/2;
        for(int index=0; index<size; index++){
            sum = sum - arr[index];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {6,1,2,8,3,4,7,10,5};
        System.out.println("Missing Number is : " + findingMissingNo(arr, arr.length));
    }
}
