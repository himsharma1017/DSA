public class swapKthElem {

    public static void elementSwapped(int arr[], int size, int target){

        if(target<0 || target>size){
            System.out.println("Invalid Input of the Index to be Swapped !");
            return;
        }

        int temp = arr[target-1];
        arr[target-1] = arr[size-target];
        arr[size-target] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 1, 2};

        System.out.print("Original array is : ");
        for(int index:arr)
            System.out.print(index + " ");

        System.out.println("\n");

        System.out.print("Array after swapping would be : ");

        elementSwapped(arr, arr.length, 2);
        for(int index:arr)
            System.out.print(index + " ");
    }
}
