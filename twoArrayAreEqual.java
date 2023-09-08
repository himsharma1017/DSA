import java.util.HashMap;

public class twoArrayAreEqual {

    public static boolean arrayBeingEqual(int arr1[], int size1, int arr2[], int size2){

        if(size1!=size2)
            return false;

        // Store arr1[] elements and their counts in
        // hash map
        HashMap<Integer,Integer> hobj = new HashMap<>();
        int count = 0;

        
        // Traverse arr1[] elements and check if all
        // elements of arr1[] are present same number
        // of times or not.
        for(int index=0; index<size1; index++){
            if(hobj.get(arr1[index])==null)
                hobj.put(arr1[index], 1);
            else
                count = hobj.get(arr1[index]);
                count++;
                hobj.put(arr1[index], count);
        }

        for(int index=0; index<size2; index++){
            // If there is an element in arr2[], but
            // not in arr1[]
            if(!hobj.containsKey(arr2[index]))
                return false;

            // If an element of arr2[] appears more
            // times than it appears in arr1[]
            if(hobj.get(arr2[index])==0)
                return false;
            else
                count = hobj.get(arr2[index]);
                --count;
                hobj.put(arr2[index], count);
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = {1 ,2 ,3 ,4 ,5};
        int arr2[] = {5, 4, 3, 2, 1};

        if(arrayBeingEqual(arr1, arr1.length, arr2, arr2.length))
            System.out.println("Both arrays are equal.");
        else
            System.out.println("Array are NOT Equal !");
    }
}
