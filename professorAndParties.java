import java.util.*;
public class professorAndParties {

    public static boolean enjoyingParties(int arr[], int size){

        HashSet<Integer> hashObj = new HashSet<>();

        for(int index=0; index<size; index++){
            if(hashObj.isEmpty() || !hashObj.contains(arr[index]))
                hashObj.add(arr[index]);
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 3 ,4, 6};
        if(enjoyingParties(arr, arr.length))
            System.out.println("It's a BOYS party !");
        else
            System.out.println("GIRLS are having fun !");
    }
}
