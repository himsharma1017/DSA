public class smallestPosNumber {

    public static int findingSmallestPos(int arr[], int size){

        int ptr = 0;

        // Check if 1 is present in array or not
        for(int index=0; index<size; index++){
            if(arr[index]==1){
                ptr = 1;
                break;
            }
        }

        // If 1 is not present
            if(ptr==0)
                return 1;

        //Changing Values to 1.
        for(int index=0; index<size; index++){
            if(arr[index]<=0 || arr[index]>size)
                arr[index] = 1;
        }

        //Updating Indices according to values.
        for(int index=0; index<size; index++)
            arr[(arr[index]-1)%size] = arr[(arr[index]-1)%size] + size;
    
        //Finding which index has value less than n.
        for(int index=0; index<size; index++){
            if(arr[index]<=size)
                return (index+1);
        }
        //If Array has values from 1 to n.
        return (size+1);
    }

    public static void main(String[] args) {
        int arr[] = {0,-10,1,3,-20};
        System.out.print("The Smallest Missing Positive Number is : ");
        System.out.println(findingSmallestPos(arr, arr.length));
    }
}
