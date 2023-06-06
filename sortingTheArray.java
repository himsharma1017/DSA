public class sortingTheArray {

    public static void printingArray(int arr[], int size){
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
    }

    public static void sorting0s1s2sInArray(int arr[], int size){

        int low=0, mid=0, high=size-1, temp;

        //Iterate till all the elements are sorted.
        while(mid<=high){
            switch(arr[mid]){
                //If the element is 0.
                case 0 : temp = arr[low];
                         arr[low] = arr[mid];
                         arr[mid] = temp;
                         low++;
                         mid++;
                         break;

                //If the element is 1.         
                case 1 : mid++;
                         break;

                //If the element is 2.                
                case 2 : temp = arr[mid];
                         arr[mid] = arr[high];
                         arr[high] = temp;
                         high--;
                         break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        //Function call.
        sorting0s1s2sInArray(arr, arr.length);
        printingArray(arr, arr.length);

    }
}
