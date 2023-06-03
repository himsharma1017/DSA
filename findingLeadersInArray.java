import java.util.Stack;
public class findingLeadersInArray {

    public static void leadersInArray(int arr[], int size){

        Stack<Integer> stackObj = new Stack<Integer>();
        Stack.stackObj.push(arr[size-1]);

        for(int index=size-2; index>=0; index--){
            if(arr[index]>stackObj.peek()){
                stackObj.push(arr[index]);
            }
        }

        while(!stackObj.empty()){
            for(int index=0; index<size; index++)
                System.out.print(arr[index] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2 };
        leadersInArray(arr, arr.length);
    }
}
