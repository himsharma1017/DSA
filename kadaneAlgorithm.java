import java.util.*;
public class kadaneAlgorithm {

    public static void algorithmKadane(int arr[], int size){

        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0, start = 0, end = 0, s = 0;

        for(int index=0; index<size; index++){
            maxEndingHere += arr[index];

            if(maxSoFar<maxEndingHere){
                maxSoFar = maxEndingHere;
                start = s;
                end = index;
            }

            if(maxEndingHere<0){
                maxEndingHere = 0;
                s = index+1;
            }
        }
        System.out.println("Maximum Contiguous Sum is : " + maxSoFar);
        System.out.println("Starting Index is : " + start);
        System.out.println("Last Index is : " + end);
    }

    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4};
        algorithmKadane(arr, arr.length);
    }
}
