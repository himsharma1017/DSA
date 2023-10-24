public class frequenciesOfLimitedRange {

    public static void calculatingFrequency(int arr[], int size){

        // This step is done to adjust the values in the array
        // to match 0-based indexing because the array indices 
        //will be used to store frequency information.
        for(int index=0; index<size; index++)
            arr[index]--;

        // For each element arr[i], it calculates the index 
        //where the frequency information should be stored by
        // taking the modulo of arr[i] with size.

        // This step marks the frequency of each element 
        // in the array using the same array.
        for(int index=0; index<size; index++){
            arr[arr[index]%size] += size;
        }

        //  For each element arr[i], it divides the element 
        //by size to retrieve the actual frequency, which was
        // marked during the previous loop. 
        for(int index=0; index<size; index++){
            arr[index] /= size;
            System.out.print(arr[index] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 5};
        System.out.print("Frequency of Each Element in the Range is : ");
        calculatingFrequency(arr, arr.length);
    }
}
