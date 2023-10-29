import java.util.*;
public class intersectionOf2Arrays {

    public static int arraysIntersection(int arr1[], int size1, int arr2[], int size2){

        HashSet<Integer> setobj = new HashSet<>();

        int count = 0;

        for(int index=0; index<size1; index++){
            if(!setobj.contains(arr1[index]))
                setobj.add(arr1[index]);
        }

        for(int index=0; index<size2; index++){
            if(setobj.contains(arr2[index])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr1[] = {89, 24, 75, 11, 23};
        int arr2[] = {89, 2, 4};
        int result = arraysIntersection(arr1, arr1.length, arr2, arr2.length);

        if(result>0)
            System.out.print("The count of Common characters is : " + result);
        else
            System.out.println("The count of Common characters is : -1.");

    }
}
