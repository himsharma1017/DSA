public class bitonicPoint {

    public static int findingBitonicPoint(int arr[], int left, int right){

        if(left<=right){

            int mid = (left + right)/2;

            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                return mid;
            
            if(arr[mid]<arr[mid+1])
                findingBitonicPoint(arr, mid+1, right);
            
            else
               findingBitonicPoint(arr, left, mid-1); 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 11, 9, 5, 2, 1};
        int result = findingBitonicPoint(arr, 1, arr.length-2);

        if(result!=-1)
            System.out.println(arr[result]);
    }
}
