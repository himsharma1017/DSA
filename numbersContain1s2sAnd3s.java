public class numbersContain1s2sAnd3s {

    public static int printingOnly1s2sAnd3s(int arr[], int size){

        for(int index=0; index<size; index++){
            if(arr[index]==1 || arr[index]==2 || arr[index]==3)
                System.out.print(arr[index] + " ");
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.print("The Output is : ");
        System.out.print(printingOnly1s2sAnd3s(arr, arr.length));
    }
}
