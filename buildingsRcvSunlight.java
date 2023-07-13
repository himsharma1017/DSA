public class buildingsRcvSunlight {

    public static void receivingSunlight(int arr[], int size){

        int maxHeight = arr[0];
        System.out.print(maxHeight + " ");

        for(int index=1; index<size; index++){
            if(arr[index]>maxHeight){
                maxHeight = arr[index];
                System.out.print(maxHeight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 8, 3};
        System.out.print("Buildings which will receive sunlight are : ");
        receivingSunlight(arr, arr.length);
    }
}
