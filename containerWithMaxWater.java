import java.util.*;
public class containerWithMaxWater {

    public static int maxWater(int arr[], int size){

        int start = 0, end = size-1, area = 0;

        while(start<end){

            area = Math.max(area, Math.min(arr[start], arr[end])*(end-start));
            
            if(arr[start]<arr[end])
                start++;
            else
                end--;
        }
        return area;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,4,5};
        System.out.print("Maximum area of the container to hold water is : " + maxWater(arr, arr.length));
    }
}
