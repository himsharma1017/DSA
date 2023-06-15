public class definingTransitionPoint {

    public static int transitionPoint(int arr[], int size){

        //Initalising the Start and End values.
        int start = 0, end = size-1;
        

        //Performing Binary Search.
        while(start<=end){

            int mid = (start+end)/2;
            
            //Updating Start if mid contains 0.
            if(arr[mid]==0)
                start = mid + 1;

            //If mid contains 1.
            else if(arr[mid]==1){
                //Checking if it is the Left Most 1.
                //IF YES : Return mid.
                if(mid==0 || mid>0 && arr[mid-1]==0)
                    return mid;

                //Else Update the End value.
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1};
        int value = transitionPoint(arr, arr.length);
        System.out.println(value>=0 ? "Transition point is at Index : " + value
        : "There is no Transition point in the Array.");
    }
}
