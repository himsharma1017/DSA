import java.util.LinkedHashSet;

public class removingDuplicatesFromPrimeArray {

    public static void removingDuplicates(int arr[], int size){

        LinkedHashSet<Integer> setobj = new LinkedHashSet<>();

        for(int index=0; index<size; index++){
            if(!setobj.contains(arr[index])){
                setobj.add(arr[index]);
            }
        }

        for(int index:setobj)
            System.out.print(index + " ");
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,3,7,5};
        System.out.print("Removing Duplicates would result the Array as : ");
        removingDuplicates(arr, arr.length);
    }
}
