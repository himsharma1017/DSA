import java.util.*;
public class starAndSuperstar {

    public static void starElements(int arr[], int size){

        Stack<Integer> stackObj = new Stack<>();
        stackObj.push(arr[size-1]);

        for(int index=size-2; index>=0; index--){
            if(arr[index]>stackObj.peek())
                stackObj.push(arr[index]);
        }

        while(!stackObj.empty())
            System.out.print(stackObj.pop() + " ");
    }

    public static void superstarElements(int arr[], int size){
         
        Stack<Integer> stackObj = new Stack<>();
        stackObj.push(arr[size-1]);

        for(int index=size-2; index>=0; index--){
            if(arr[index]>stackObj.peek())
                stackObj.push(arr[index]);
        }

        System.out.print(stackObj.peek());
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 10, 3, 4, 5, 8, 10, 4};
        System.out.print("Star Elements are : ");
        starElements(arr, arr.length);

        System.out.println("\n");

        System.out.print("Super Star Element is : ");
        superstarElements(arr, arr.length);
    }
}
