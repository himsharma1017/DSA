import java.util.*;
public class thirdLargestElement {

    public static void thirdElement(int arr[], int size){

        int first = arr[0], second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        if(size<3){
            System.out.println("Invalid Input !");
            return;
        }

        for(int index=1; index<size; index++){

            if(arr[index]>first){
                third = second;
                second = first;
                first = arr[index];
            }

            else if(arr[index]>second){
                third = second;
                second = arr[index];
            }

            else if(arr[index]>third)
                third = arr[index];
        }
        System.out.println("Third Largest Element is : " + third);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        thirdElement(arr, arr.length);
    }
}
