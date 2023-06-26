public class countingZeroes {

    public static int numberOfZeroes(int arr[], int size){

        int count = 0;

        for(int index=0; index<size; index++){
            if(arr[index]==0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
        System.out.println("Number of zeroes are : " + numberOfZeroes(arr, arr.length));
    }
}
