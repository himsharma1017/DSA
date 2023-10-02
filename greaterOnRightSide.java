public class greaterOnRightSide {

    public static int[] elementsOnRight(int arr[], int size){

        int result[] = new int[size];
        int maxFromRight = -1;

        for(int index=size-1; index>=0; index--){
            result[index] = maxFromRight;

            if(arr[index]>maxFromRight)
                maxFromRight = arr[index];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 9};
        System.out.print("The Output would be : ");
        int result[] = elementsOnRight(arr, arr.length);

        for(int index=0; index<result.length; index++)
            System.out.print(result[index] + " ");
    }
}
