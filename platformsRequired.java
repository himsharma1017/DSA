import java.util.*;
public class platformsRequired {

    public static int numberOfPlatforms(int arr[], int dep[], int size){

        // Sort arrival and departure arrays.
        Arrays.sort(arr);
        Arrays.sort(dep);

        // platformNeeded indicates number of platforms
        // needed at a time.
        int platformNeeded = 1, result = 1, i = 1, j = 0;

        // Similar to merge in merge sort to process
        // all events in sorted order.
        while(i<size && j<size){

            // If next event in sorted order is arrival,
            // increment count of platforms needed.
            if(arr[i]<=dep[j]){
                platformNeeded++;
                i++;
            }

            // Else decrement count of platforms needed.
            else if(arr[i]>dep[j]){
                platformNeeded--;
                j++;
            }

            // Update result if needed.
            if(platformNeeded>result)
                result = platformNeeded;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println("Maximum platforms required is : " + numberOfPlatforms(arr, dep, arr.length));
    }
}
