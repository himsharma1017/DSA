import java.util.*;
public class firstRepeatingElement {

    public static void identifyingFirstRepEl(int arr[], int size){

        //Initializing the Index of the First Repeating Element.
        int min = -1;

        //Creating an Empty HashSet.
        HashSet<Integer> hashObj = new HashSet<>();

        //Traversing the Array from Right to left.
        for(int index=size-1; index>=0; index--){
            
            //If Element is already present in the HashSet, then Update min.
            if(hashObj.contains(arr[index]))
                min = index;
            else        //Else Add Element to the Hash Set.
                hashObj.add(arr[index]);
        }

        if(min!=-1)
            System.out.println("The First Repeating Element is : " + arr[min]);
        else
            System.out.println("There is No Element which is repeated.");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2};
        identifyingFirstRepEl(arr, arr.length);
    }
}
