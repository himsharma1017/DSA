public class linearSearch {

    public static int linear(int arr[], int target){
        for(int index=0; index<arr.length; index++){
            if(arr[index]==target)
                return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,15,37,49,56,84};
        int elementToBeFound = 48;
        int counter = linear(arr, elementToBeFound);
        if(counter==-1)
            System.out.println("Element is not present in the Array !");
        else
            System.out.println("Element is found at index : " + counter);
    }
}
