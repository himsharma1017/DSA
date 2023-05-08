public class firstNonRepeatingElement {

    public static int nonRepeatingElement(int arr[], int size){
        for(int index1=0; index1<size; index1++){
            int index2;

            for(index2=0; index2<size; index2++){
                if(index1!=index2 && arr[index1]==arr[index2])
                break;

            if(index2==size)
                return arr[index1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9, 4, 9, 6, 7, 4};
        int res = nonRepeatingElement(arr, arr.length);
        System.out.println("First Non Repeating Element is : " + res);
    }
}
