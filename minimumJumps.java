import java.util.*;
public class minimumJumps {

    public static int minJumps(int arr[], int size){

         // jumps[size-1] will hold the result.
         int jumps[] = new int[size];
         
         int i, j;
  
         // if first element is 0, end cannot be reached.
         if (size == 0 || arr[0] == 0)
             return Integer.MAX_VALUE;
  
         jumps[0] = 0;
  
         // Find the minimum number of jumps to reach arr[i]
         // from arr[0], and assign this value to jumps[i]
         for (i = 1; i < size; i++) {
             jumps[i] = Integer.MAX_VALUE;
             for (j = 0; j < i; j++) {
                 if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                     jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                     break;
                 }
             }
         }
         return jumps[size-1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.print("Minimum number of jumps to reach end is : " + minJumps(arr, arr.length));
    }
}
