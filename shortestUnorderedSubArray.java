public class shortestUnorderedSubArray {

    public static boolean decreasing(int arr[], int size){

        for(int index=0; index<size; index++){
            if(arr[index]>arr[index+1])
                return true;
        }
        return false;
    }

    public static boolean increasing(int arr[], int size){

        for(int index=0; index<size; index++){
            if(arr[index]<arr[index+1])
                return true;
        }
        return false;
    }

    public static int unordered(int arr[], int size){

        if(increasing(arr, size)==false || decreasing(arr, size)==false)
            return -1;
        else
            return 3;
    }

    public static void main(String[] args) {
        int arr[] = {7, 9, 10, 8, 11};
        System.out.print("The Output is : ");
        System.out.print(unordered(arr, arr.length));
    }
}
