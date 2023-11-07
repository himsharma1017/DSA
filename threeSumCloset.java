import java.util.*;
public class threeSumCloset {

    public static int closestSumOfTriplets(int arr[], int size, int target){

        int closestSum = Integer.MAX_VALUE, minDiff = Integer.MAX_VALUE;

        for(int index=0; index<size-2; index++){

            int left = index+1, right = size-1;

            while(left<right){

                int sum = arr[index] + arr[left] + arr[right];
                int diff = Math.abs(target-sum);

                if(diff<minDiff || (diff==minDiff && sum>closestSum)){
                    minDiff = diff;
                    closestSum = sum;
                }

                if(sum<target)
                    left++;
                else
                    right--;
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int arr[] = {-7,9,8,3,1,1};
        int target = 2;
        System.out.print("Sum which is closest to the Target value is : ");
        int result = closestSumOfTriplets(arr, arr.length, target);
        System.out.print(result);
    }
}
