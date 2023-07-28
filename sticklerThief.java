import java.util.*;
public class sticklerThief {

    public static int maxLoot(int arr[], int size){

        int value1 = arr[0];

        if(size==0)
            return 0;

        if(size==1)
            return value1;

        int value2 = Math.max(arr[0], arr[1]);

        if(size==2)
            return value2;

        // contains maximum stolen value at the end
        int maxValue = 0;

        // Fill remaining positions
        for(int index=2; index<size; index++){
            maxValue = Math.max(arr[index]+value1, value2);
            value1 = value2;
            value2 = maxValue;
        }
        return maxValue;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.print("Maximum loot possible : " + maxLoot(arr, arr.length));
    }
}
