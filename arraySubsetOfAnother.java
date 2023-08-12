import java.util.*;
public class arraySubsetOfAnother {

    public static boolean arraySubset(int arr1[], int arr2[], int size1, int size2){

        HashSet<Integer> hashObj = new HashSet<>();

        if(arr1.length<arr2.length)
            return false;

        for(int index=0; index<size1; index++){
            if(!hashObj.contains(arr1[index]))
                hashObj.add(arr1[index]);
        }

        for(int index=0; index<size2; index++){
            if(!hashObj.contains(arr2[index]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 4, 5, 6};
        int arr2[] = {7, 8, 9};

        if(arraySubset(arr1, arr2, arr1.length, arr2.length))
            System.out.println("arr2[] is subset of arr1[].");
        else
            System.out.println("NO SUBSET EXISTS !");
    }
}
