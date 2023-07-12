public class occuringOddTimes {

    public static int numberOccurOddTimes(int arr[], int size){

        int index, res = 0;

        for(index=0; index<size; index++)
            // XOR of all elements gives us odd occuring
            //elements.
            res = res^arr[index];   
        
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {8, 8, 7, 7, 6, 6, 1};
        System.out.print("Only Number to appear Odd Times is : ");
        System.out.println(numberOccurOddTimes(arr, arr.length));
    }
}
