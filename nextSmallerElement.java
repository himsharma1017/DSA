import java.util.*;
public class nextSmallerElement {

    public static void identifyingNextSmaller(int arr[], int size){

        Stack<Integer> stackobj = new Stack<>();
        HashMap<Integer,Integer> hobj = new HashMap<>();
   
        /* push the first element to stack */
        stackobj.push(arr[0]);

        // iterate for rest of the elements
        for(int index=1; index<size; index++){

            if(stackobj.empty()){
                stackobj.push(arr[index]);
                continue;
            }

            /* if stack is not empty, then
    pop an element from stack.
    If the popped element is greater
    than next, then
    a) print the pair
    b) keep popping while elements are
    greater and stack is not empty */
            while(stackobj.empty()==false && stackobj.peek()>arr[index]){
                hobj.put(arr[index],stackobj.peek());
                stackobj.pop();
            }
            /* push next to stack so that we can find
            next smaller for it */
            stackobj.push(arr[index]);
        }

         /* After iterating over the loop, the remaining
        elements in stack do not have the next smaller
        element, so print -1 for them */
        while(stackobj.empty()==false){
            hobj.put(stackobj.peek(), -1);
            stackobj.pop();
        }

        for(int index=0; index<size; index++){
            Integer value = hobj.get(arr[index]);
            if(value==null)
                value = -1;
            System.out.println(arr[index] + " -------> " + value);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 3, 1, 7};
        identifyingNextSmaller(arr, arr.length);
    }
}
