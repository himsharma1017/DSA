import java.util.*;
public class firstNonRepeatingElement {

    public static int nonRepeatingElement(int arr[], int size){

        //Initializing a HashMap to store the frequency of elements.
        HashMap<Integer,Integer> freq = new HashMap<>();

        //Creating map with the frequency of each element.
        for(int index: arr)
            freq.put(index, freq.getOrDefault(index, 0)+1);

        //Running a loop to find the first Non-repeating element.
        for(int index: arr){
            if(freq.get(index)==1)
                return index;
        }
        return -1;          //If No-Repeating element is found.
    }

    public static void main(String[] args) {
        int arr[] = {9, 4, 9, 6, 7, 4};
        System.out.println("First Non Repeating Element is : " + nonRepeatingElement(arr, arr.length));        
    }
}
