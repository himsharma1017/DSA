import java.util.*;
public class balancedBrackets {

    public static boolean areBracketsBalanced(String expr){

        Deque<Character> stack = new ArrayDeque<Character>();

        for(int index=0; index<expr.length(); index++){
            char x = expr.charAt(index);

            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty())
                return false;

            char check;
            switch(x){
                case '}' : check = stack.pop();
                            if(check=='[' || check=='(')
                                return false;
                            break;

                case ']' : check = stack.pop();
                            if(check=='{' || check=='(')
                                return false;
                            break;

                case ')' : check = stack.pop();
                            if(check=='{' || check=='[')
                                return false;
                            break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        String expr = "([{}])";

        if(areBracketsBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
