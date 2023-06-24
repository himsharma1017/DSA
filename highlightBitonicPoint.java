public class highlightBitonicPoint {

    public static int bitonicPoint(int arr[], int start, int end){

        while(start<=end){

            int mid = (start+end)/2;

            //Base Condition to check if arr[mid] is Bitonic point or not.
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;

            if(arr[mid+1]>arr[mid])
                return bitonicPoint(arr, mid+1, end);
            else
                return bitonicPoint(arr, start, mid-1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 11, 9, 5, 2, 1};
        int value = bitonicPoint(arr, 0, arr.length-1);
        if(value!=-1)
            System.out.println("Bitonic point is at Index : " + value);
        else
            System.out.println("No Bitonic point exists.");
    }
}
