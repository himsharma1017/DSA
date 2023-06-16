import java.util.*;
public class gettingKeyPair {

    public static void keyPair(int arr[], int size, int sum){

        HashSet<Integer> hashObj = new HashSet<>();

        for(int index=0; index<size; index++){
            if(hashObj.contains(sum-arr[index])){
                System.out.println("Yes");
                return;
            }
            hashObj.add(arr[index]);
        }
        System.out.println("No");
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 16;
        keyPair(arr, arr.length, sum);
    }
}
