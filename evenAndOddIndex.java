public class evenAndOddIndex {

    public static void evenAtEvenAndOddAtOddIndex(int arr[], int size){
        int evenIndex = 0;
        int oddIndex = 1;

        while(true){

            while(evenIndex<size && evenIndex%2==0)
                evenIndex += 2;

            while(oddIndex<size && oddIndex%2==1)
                oddIndex += 2;
                
            if(evenIndex<size && oddIndex<size){
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
            }

            else
                break;
        }
    }

    public static void printArray(int arr[], int size){
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 12, 1, 5, 8};
        System.out.println("Original Array is : ");
        printArray(arr, arr.length);

        evenAtEvenAndOddAtOddIndex(arr, arr.length);

        System.out.println("\n");

        System.out.println("Modified Array is : ");
        printArray(arr, arr.length);
    }
}
