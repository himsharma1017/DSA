import java.util.*;
public class coinChange {

    public static int changingCoins(int arr[], int size, int sum){

        // Time complexity of this function: O(n*sum)
        // Space Complexity of this function: O(sum)
 
        // table[i] will be storing the number of solutions
        // for value i. We need sum+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (sum = 0)
        int table[] = new int[sum+1];

        // Initialize all table values as 0
        Arrays.fill(table,0);

        // Base case (If given value is 0)
        table[0] = 1;
        
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for(int i=0; i<size; i++){
            for(int j=arr[i]; j<=sum; j++)
                table[j] += table[j-arr[i]];
        }
        return table[sum];
    }

    public static void main(String[] args) {
        int arr[] = {2,5,3,6};
        System.out.println("Number of ways we can make the sum : " + changingCoins(arr, arr.length, 10));
    }
}
