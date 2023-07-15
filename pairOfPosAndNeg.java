import java.util.*;
public class pairOfPosAndNeg {

    public static void positiveAndNegPair(int arr[], int size){

        ArrayList<Integer> arrayObj = new ArrayList<>();
        HashMap<Integer,Integer> hashObj = new HashMap<>();

        for(int index=0; index<size; index++){

            //If the element has been encountered early, then
            //Increment its count.
            if(hashObj.containsKey(Math.abs(arr[index])))
                hashObj.put(Math.abs(arr[index]), hashObj.get(Math.abs(arr[index]))+1);

            //If the element has not been seen before, then Initialize 
            //its count to 1.
            else
                hashObj.put(Math.abs(arr[index]),1);

            if(hashObj.get(Math.abs(arr[index]))==2)
                arrayObj.add(Math.abs(arr[index]));
        }

        if(arrayObj.size()==0)
            return;

        for(int index=0; index<arrayObj.size(); index++)
            System.out.print("-" + arrayObj.get(index) + " " + arrayObj.get(index) + " ");
    }
    public static void main(String[] args) {
        int arr[] = { 4, 8, 9, -4, 1, -1, -8, -9 };
        System.out.print("Pair of Positive and Negative elements are : ");
        positiveAndNegPair(arr, arr.length);
    }
}
