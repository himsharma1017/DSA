import java.util.*;
public class tripletsWith0Sum {

    public static void findingTriplets(int arr[], int size){

        Arrays.sort(arr);
        
        boolean counter = false; 

        for(int index=0; index<size-1; index++){

            int left = index+1;
            int right = size-1;
            int x = arr[index];

            while(left<right){

                if(x+arr[left]+arr[right]==0){
                    System.out.print(x + " ");
                    System.out.print(arr[left] + " ");
                    System.out.println(arr[right] + " ");
                    left++;
                    right--;

                    counter = true;
                }

                else if(x+arr[left]+arr[right]<0)
                    left++;

                else
                    right--;
            }
        }
        if(counter==false)
            System.out.println("No Triplet exists !");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        findingTriplets(arr, arr.length);
    }
}
