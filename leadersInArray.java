public class leadersInArray {

    public static void leaderInArray(int arr[], int size){

        int maxFromRight = arr[size-1];

        System.out.print(maxFromRight + " ");

        for(int index=size-2; index>=0; index--){
            if(arr[index] > maxFromRight){
                maxFromRight = arr[index];
                System.out.print(maxFromRight + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        leaderInArray(arr, arr.length);
    }
}