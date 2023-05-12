import java.util.*;
public class waveArray {

    public static void swapping(int arr[], int a, int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sortInWave(int arr[], int size){

        Arrays.sort(arr);

        for(int index=1; index<size; index+=2){
            swapping(arr, index, index+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        sortInWave(arr, arr.length);

        for(int index=0; index<arr.length; index++)
            System.out.print(arr[index] + " ");
    }
}
