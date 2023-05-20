import java.util.*;
public class missingAndRepeating {

    public static void missingAndRepeatNumber(int arr[], int size){

        Arrays.sort(arr);
        System.out.println("The Repeating Number is : ");

        for(int index=0; index<size-1; index++){
            if(arr[index]==arr[index+1])
                System.out.println(arr[index]);
                break;
        }

        System.out.println("and the missing number is : ");
        for(int index1=1; index1<=size; index1++){
        if(index1!=arr[index1-1])
            System.out.println(index1);
            break;
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 3, 4, 5, 5, 6, 2};
        missingAndRepeatNumber(arr, arr.length);
    }
}
