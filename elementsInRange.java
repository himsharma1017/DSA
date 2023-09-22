import java.util.*;
public class elementsInRange {

    public static boolean definingElementsRange(int arr[], int size, int a, int b){

        HashSet<Integer> setObj = new HashSet<>();

        for(int index=0; index<size; index++){
                setObj.add(arr[index]);
        }

        for(int index=a; index<=b; index++){
            if(!setObj.contains(index))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2, 7, 8, 3};
        if(definingElementsRange(arr, arr.length, 2, 5))
            System.out.println("YES");
        else
            System.out.println("NO !");
    }
}
