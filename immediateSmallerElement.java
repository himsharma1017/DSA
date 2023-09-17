import java.util.*;
public class immediateSmallerElement {

    public static void identifyingNextSmaller(int arr[], int size) {

        Stack<Integer> stackobj = new Stack<>();
        HashMap<Integer, Integer> hobj = new HashMap<>();
   
        /* push the first element to stack */
        stackobj.push(arr[0]);

        // iterate for rest of the elements
        for (int index = 1; index < size; index++) {

            //Check if the stack is empty. If so,
            // push the current element onto the stack 
            // and proceed to the next iteration.
            if (stackobj.empty()) {
                stackobj.push(arr[index]);
                continue;
            }

            // Check if the right element is smaller or not
            if (arr[index] < arr[index - 1]) {
                hobj.put(arr[index - 1], arr[index]);
            } else {
                hobj.put(arr[index - 1], -1);
            }

            // Push the current element onto the stack 
            // for future comparison.
            stackobj.push(arr[index]);
        }

        hobj.put(arr[size - 1], -1); // Handling the last element
        
        for (int index = 0; index < size; index++) {
            System.out.println(arr[index] + " -------> " + hobj.get(arr[index]));
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 2, 3, 1, 7};
        identifyingNextSmaller(arr, arr.length);
    }
}
