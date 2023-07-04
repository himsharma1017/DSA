import java.util.*;
public class threeGreatCandidates {

    public static int findingGreatCandidates(int arr[], int size){

        //If size is less than 3, No Triplet exists.
        if(size<3)
            return -1;

        //Intialize Maximum, Second Maximum and Third Maximum element.
        int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
        
        //Intialize Minimum and Second Minimum element.
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

        for(int index=0; index<size; index++){

            // Update Maximum, second maximum and third maximum element.
            if(arr[index]>maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = arr[index];
            }

            //Update second maximum and third maximum element.
            else if(arr[index]>maxB){
                maxC = maxB;
                maxB = arr[index];
            }

            // Update third maximum element.
            else if(arr[index]>maxC)
                maxC = arr[index];

            // Update Minimum and second minimum element.
            if(arr[index]<minA){
                minB = minA;
                minA = arr[index];
            }

             // Update second minimum element.
            else if(arr[index]<minB)
                minB = arr[index];
        }
        return Math.max(minA*minB*maxA, maxA*maxB*maxC);
    }
    public static void main(String[] args) {
        int arr[] = {- 1, -4, 3, -6, 7, 0};
        int value = findingGreatCandidates(arr, arr.length);

        if(value==-1)
            System.out.print("No Great Candidates were found !");
        else
            System.out.print("The Potential of Three Candidates is : " + value);
    }
}
