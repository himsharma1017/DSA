import java.util.*;
public class minimumEnergy {

    public static int minEnergy(int arr[], int size){

        
    // initMinEnergy is variable to store
    // minimum initial energy required.
        int initialMinEnergy = 0;
        
    // currEnergy is variable to store
    // current value of energy at
    // i'th checkpoint on street
        int currEnergy = 0;

    // flag to check if we have successfully
    // crossed the street without any energy
    // loss <= 0 at any checkpoint.
        boolean flag = false;

        for(int index=0; index<size; index++){
            currEnergy = currEnergy + arr[index];

    // If current energy, becomes negative or 0,
    // increment initial minimum energy by the negative
    // value plus 1. to keep current energy
    // positive (at least 1). Also
    // update current energy and flag.
        if(currEnergy<=0){
            initialMinEnergy = initialMinEnergy + Math.abs(currEnergy) +1;
            currEnergy = 1;
            flag = true;
        }
        }

    // If energy never became negative or 0, then
    // return 1. Else return computed initialMinEnergy
        return (flag==false)? 1 : initialMinEnergy;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 6, 1};
        System.out.print("Minimum Energy to cross all the Checkpoints is : ");
        System.out.println(minEnergy(arr, arr.length));
    }
}
