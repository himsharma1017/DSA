import java.util.*;
public class productPair {

    public static boolean findingThePair(int arr[], int size, int target){

        HashMap<Integer,Integer> hashobj = new HashMap<>();

        for(int index=0; index<size; index++){
            if(target%arr[index]==0 && hashobj.containsKey(target/arr[index])){
                return true;
            }
            else{
                hashobj.put(arr[index], index);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 9, 40};
        int target = 900;
        boolean result = findingThePair(arr, arr.length, target);

        if(result)
            System.out.println("The pair with product " + target + " exists.");
        else
            System.out.println("No pair with provided target exists !");
    }
}
