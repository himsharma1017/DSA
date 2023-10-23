import java.util.*;
public class parenthesisChecker {

    public static boolean checkingParenthesis(String str){

        Stack<Character> stobj = new Stack<>();

        for(char index: str.toCharArray()){

            if(index=='(' || index=='[' || index=='{')
            // Push opening brackets onto the stack.
                stobj.push(index);
            else{
                if(stobj.isEmpty())
                    return false;
            
            // Pop the top element from the stack
            char removedVal = stobj.pop();
            if((index==')' && removedVal!='(') || 
                (index==']' && removedVal!='[') || 
                (index=='}' && removedVal!='{'))
                // If closing bracket doesn't match the 
                //corresponding opening bracket, return false
                    return false;
            }
        }
        // Return true if the stack is empty, 
        //meaning all brackets are matched and closed.
        return stobj.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{([])}";
        
        if(checkingParenthesis(str))
            System.out.println("Balanced.");
        else
            System.out.println("NOT Balanced !");
    }
}
