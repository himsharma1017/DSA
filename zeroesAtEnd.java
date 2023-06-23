public class zeroesAtEnd {

    public static void movingZeroesAtEnd(int arr[], int size){

        int counter = 0;

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element.
        for(int index=0; index<size; index++){
            if(arr[index]!=0)
                arr[counter++] = arr[index];            
        }
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while(counter<size)
            arr[counter++] = 0;
    }

    public static void printingArray(int arr[], int size){
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.print("After moving all zeroes at the end, the Array looks like : ");
        movingZeroesAtEnd(arr, arr.length);
        printingArray(arr, arr.length);
    }
}
