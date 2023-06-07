import java.util.Stack;
public class findingLeadersInArray {

    public static void leadersInArray(int arr[], int size){

        //Creating Stack to store leaders.
        Stack<Integer> stackObj = new Stack<Integer>();
        stackObj.push(arr[size-1]);

        for(int index=size-2; index>=0; index--){
            if(arr[index]>stackObj.peek()){
                stackObj.push(arr[index]);
            }
        }

        //Printing Stack Elements, running the loop until the Stack is 
        //not empty.
        while(!stackObj.empty()){
                System.out.print(stackObj.pop() + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2 };
        leadersInArray(arr, arr.length);
    }
}
