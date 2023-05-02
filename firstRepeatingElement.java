public class firstRepeatingElement {

    public static int firstRepeatingElement(int arr[], int size){

        for(int index=0; index<size; index++){
            for(int index2=index+1; index2<size; index2++){
                if(arr[index]==arr[index2])
                    return index2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 5, 3, 6};
        int index = firstRepeatingElement(arr, arr.length);

        if(index == -1)
            System.out.println("There is no repeating element !");
        else
            System.out.println("First Repeating element exists at : " + index);
    }
}
