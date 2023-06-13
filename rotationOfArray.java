public class rotationOfArray {

    public static void rotatingTheArray(int arr[], int d, int size){

        //Creating a Temp Array for storing the Rotated Version.
        int temp[] = new int[size];
        //Keeping Track of the Current Index of the Temp[].
        int currentIndex = 0;

        //Storing the n-d elements of the arr[] to the front of temp[].
        for(int index=d; index<size; index++){
            temp[currentIndex] = arr[index];
            currentIndex++;
        }

        //Storing the First d elements of arr[] into temp[].
        for(int index=0; index<d; index++){
            temp[currentIndex] = arr[index];
            currentIndex++;
        }

        //Copying the elements of temp[] into arr[] , to get the final
        //rotated array.
        for(int index=0; index<size; index++)
            arr[index] = temp[index];
    }

    //Function to print elements of the Array.
    public static void printArray(int arr[], int size){
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotatingTheArray(arr, d, arr.length);
        printArray(arr, arr.length);
    }
}
