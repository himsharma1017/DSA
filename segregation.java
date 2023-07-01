public class segregation {

    public static void segregatingArray(int arr[], int size){

        int left = 0, right = size-1;

        while(left<right){

            //Increment left index while see 0 at left.
            while(arr[left]==0 && left<right)
                left++;

            //Decrement right index while we see 1 at right.
            while(arr[right]==1 && left<right)
                right--;

            //If left is smaller than right, then there is a 1 at left
            //and 0 at right. Exchange arr[left] and arr[right].
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
        int arr[] = {0, 0, 1, 1, 0, 1, 0, 1, 1, 0};
        System.out.print("Array after segregation looks like : ");
        segregatingArray(arr, arr.length);
        printArray(arr, arr.length);
    }
}
