public class searchingAnElement {

    public static int findingElement(int arr[],int start, int end, int value){

        int mid = (start+end)/2;

        while(start<=end){

            if(arr[mid]==value)
                return mid;

            else if(arr[mid]>value)
                end = mid-1;

            else
                start = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Element found at Index : " + findingElement(arr, 0, arr.length, 4));
    }
}
