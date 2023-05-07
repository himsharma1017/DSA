public class pushingZeroesToEnd {
    
    public static void pushZeroesToEnd(int arr[], int size){
        int count = 0;

        for(int index=0; index<arr.length; index++){
            if(arr[index]!=0)
            arr[count++] = arr[index];
        }

        while(count<size)
        arr[count++] = 0;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZeroesToEnd(arr, arr.length);
        System.out.println("Array after pushing Zeroes to Right End.\n");

        for(int index=0; index<arr.length; index++)
            System.out.print(arr[index] + " ");
    }
}
