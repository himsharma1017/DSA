public class indexOfFirst1inBinaryArray {

    public static int findingIndexOfFirst1(int arr[], int size){

        int left = 0, right = size-1, result = -1;

        while(left<=right){

            int mid = left+(right-left)/2;

            if(arr[mid]==1){
                result = mid;
                // Move left to find the first occurrence
                right = mid-1;
            }   

            else
            // Move right to search in the remaining portion
                left = mid+1;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        System.out.print("The first 1 appears at the Index : ");
        System.out.print(findingIndexOfFirst1(arr, arr.length));
    }
}
