public class repeatingElementsInArray {

    public static int duplicatesInArray(int arr[], int size){

        for(int index=0; index<arr.length; index++){
            arr[arr[index]%arr.length] = arr[arr[index]%arr.length] + arr.length;
        }

        System.out.print("The Repeating Elements are : ");
        for(int index=0; index<arr.length; index++){
            if(arr[index]>=arr.length*2)
                System.out.print(index + " ");
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 0, 3, 7, 8, 2 ,2, 1, 4 };
        duplicatesInArray(arr, arr.length);
    }
}
