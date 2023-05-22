import java.util.*;
public class minimumSum {

    public static int leastPossibleSum(int arr[], int size){

        int a=0;
        int b=0;

        Arrays.sort(arr);
        for(int index=0; index<size; index++){
            if(index%2!=0)
                a = a*10 + arr[index];
            
            else
                b = b*10 + arr[index];
        }
        return (a+b);
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 0, 7, 4};
        System.out.println("The Minimum sum that can be formed is : " + leastPossibleSum(arr, arr.length));
    }
}
