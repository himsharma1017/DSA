public class missingNumber {

    public static int missingNumber(int arr[], int size){
        int sum = ((size+1)*(size+2))/2;
        for(int index=0; index<arr.length; index++){
            sum -= arr[index];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};
        System.out.println(missingNumber(arr, arr.length));
    }
}
