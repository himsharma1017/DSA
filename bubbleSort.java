public class bubbleSort {

    public static void bubble(int arr[]){
        for(int index=0; index<arr.length-1; index++){
            for(int j=0; j<arr.length-index-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,2,8,5,9};
        bubble(arr);

        for(int index=0; index<arr.length; index++)
        System.out.print(arr[index] + " ");
    }
}
