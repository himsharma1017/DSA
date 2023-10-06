import java.util.*;
public class sortingEvenAndOdd {

    public static void evenAndOdd(int arr[], int size){

        int evenIndex = 0, oddIndex = size-1;

        while(evenIndex<oddIndex){
            
            while(evenIndex<size && arr[evenIndex]%2==0)
                evenIndex++;

            while(oddIndex>=0 && arr[oddIndex]%2!=0)
                oddIndex--;

            if(evenIndex<oddIndex){
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
                evenIndex++;
                oddIndex--;
            }
        }

        Arrays.sort(arr,0,evenIndex);

        Arrays.sort(arr,evenIndex,size);
    }

    public static void printArray(int arr[], int size){
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 4};
        System.out.print("Segregating Even and Odd Numbers : ");
        evenAndOdd(arr, arr.length);
        printArray(arr, arr.length);
    }
}
