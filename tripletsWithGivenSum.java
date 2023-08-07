import java.util.*;
public class tripletsWithGivenSum {

    public static void findingTripletsWithSum(int arr[], int size, int sum){

        boolean counter = false;
        Arrays.sort(arr);

        for(int index=0; index<size; index++){

            int left = index+1;
            int right = size-1;
            int x = arr[index];

            while(left<right){

                if(x+arr[left]+arr[right]==sum){
                    System.out.print(x + " ");
                    System.out.print(arr[left] + " ");
                    System.out.println(arr[right] + " ");
                    left++;
                    right--;

                    counter = true;
                }

                else if(x+arr[left]+arr[right]<sum)
                    left++;

                else
                    right--;
            }
        }
        if(counter==false)
            System.out.println("No Triplet exists with the Given Sum !");
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2, 4, 3, 6};
        findingTripletsWithSum(arr, arr.length, 10);
    }
}
