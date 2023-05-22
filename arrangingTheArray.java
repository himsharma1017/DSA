public class arrangingTheArray {

    public static void printingArray(int arr[], int size){
        for(int index=0; index<size; index++){
            System.out.print(arr[index] + " ");
        }
    }

    public static void rearrangingPosAndNeg(int arr[], int size){
        int key,j;

        for(int index=1; index<size; index++){
            key = arr[index];
            
            if(key>0)
                continue;

            j = index-1;
            while(j>=0 && arr[j]>0){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,11,-13,-5,6,-7,5,-3,-6 };
        rearrangingPosAndNeg(arr, arr.length);
        printingArray(arr, arr.length);
    }
}
