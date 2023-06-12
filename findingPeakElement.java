public class findingPeakElement {
    
    public static int peakElement(int arr[], int size){

        int start = 0, end = size-1;
        int mid = (start + (end-start))/2;

        while(start<end){
            if(arr[mid]>arr[mid+1])
                end = mid;
            
            else
                start = mid+1;
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 20, 4, 1, 0};
        System.out.println("The Peak Element is at Index : " + peakElement(arr, arr.length));
    }
}
