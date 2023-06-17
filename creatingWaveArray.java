public class creatingWaveArray {

    public static void swapping(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sortingTheWave(int arr[], int size){

        for(int index=0; index<size-1; index=index+2){

            if(index>0 && arr[index-1]>arr[index])
                swapping(arr, index, index-1);

                if(index<size-1 && arr[index+1]>arr[index])
                    swapping(arr, index, index+1);
        }
    }

    public static void printArray(int arr[], int size){
        for(int index : arr)
            System.out.print(index + " ");
    }

    public static void main(String[] args) {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        sortingTheWave(arr, arr.length);
        System.out.print("Transforming the Array into Wave form looks like : ");
        printArray(arr, arr.length);
    }
}
