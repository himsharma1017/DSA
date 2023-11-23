public class indexAndValueEqual {

    public static void valuesBeingEqual(int arr[], int size){

        for(int index=0; index<size; index++){
            if(arr[index]==(index+1)){
                System.out.print(arr[index]);
            }
        } 
    }

    public static void main(String[] args) {
        int arr[] = {15, 2, 45, 12, 7};
        System.out.print("Element which has same value as with Index : ");
        valuesBeingEqual(arr, arr.length);
    }
}
