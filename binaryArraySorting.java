public class binaryArraySorting {

    public static void sortingBinaryArray(int arr[], int size){

        int left = 0, right = size-1;

        while(left<right){

            while(arr[left]==0 && left<right)
                left++;

            while(arr[right]==1 && left<right)
                right--;

            if(left<right){
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int arr[], int size){
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {1 ,0 ,1, 1, 1, 1, 1, 0, 0, 0};
        System.out.print("Sorting the Binary Array looks like : ");
        sortingBinaryArray(arr, arr.length);
        printArray(arr, arr.length);
    }

}
