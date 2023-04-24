public class reverseArray {

    public static void reverse(int arr[], int size){
        int index, j, temp;
        for(index=0; index<size/2; index++){
            temp = arr[size-index-1];
            arr[size-index-1] = arr[index];
            arr[index] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};

        System.out.println("The Original Array is :\n");
        for(int index1=0; index1<arr.length; index1++)
        System.out.print(arr[index1] + " ");
        System.out.println("\n");

        reverse(arr,arr.length);

        System.out.println("Reversed Array is : \n");
        for(int index=0; index<arr.length; index++)
        System.out.print(arr[index] + " ");
    }
}
