import java.util.*;
public class minimizeHeights_I {

    public static int minHeight(int arr[], int size, int k){

        Arrays.sort(arr);

        // Maximum possible height difference.
        int answer = arr[size-1]-arr[0];

        int tempMin,tempMax;
        tempMin = arr[0];
        tempMax = arr[size-1];

        for(int index=1; index<size; index++){

            // IF on subtracting k we get negative value, then 
            //continue.
            if(arr[index]-k<0)
                continue;

            // Minimum element when we add k to whole array
            tempMin = Math.min(arr[0]+k, arr[index]-k);

            // Maximum element when we subtract k from whole
            // array.
            tempMax = Math.max(arr[index-1]+k, arr[size-1]-k);

            answer = Math.min(answer, tempMax-tempMin);
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20};
        System.out.print("Minimum difference between the towers is : " + minHeight(arr, arr.length, 3));
    }
}
