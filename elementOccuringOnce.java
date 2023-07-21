import java.util.*;
public class elementOccuringOnce {

    public static int appearingOnce(int arr[], int size){

        int x, sum, result = 0;
        
        for(int index=0; index<size; index++){
            
            // Find sum of set bits at ith position in all
            // array elements.
            sum = 0;

            x = (1<<index);
            for(int j=0; j<size; j++){
                if((arr[j] & x)!=0)
                    sum++;
            }

            // The bits with sum not multiple of 3, are the
            // bits of element with single occurrence.
            if((sum%3)!=0)
                result |= x;     // "|" is OR Operator.
        }
        return result;
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 10, 30, 30};
        System.out.print("The Element appearing only once is : ");
        System.out.println(appearingOnce(arr, arr.length));
    }
}
