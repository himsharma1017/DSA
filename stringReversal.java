import java.util.*;
public class stringReversal {

    public static String reversingString(String str){

        HashSet<Character> hobj = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(int index=str.length()-1; index>=0; index--){

            // the character at the current index i is 
            //extracted from the input string and stored 
            //in the variable currentChar.
            char currentChar = str.charAt(index);

            //This condition checks whether currentChar is 
            //not a space character and whether it hasn't 
            //been seen before in the seen set.
            if(currentChar!=' ' && !hobj.contains(currentChar)){

                result.append(currentChar);
                // The currentChar is then added to the hobj
                // set using the add method, marking it as seen.
                hobj.add(currentChar);
            }
        }
        //StringBuilder is converted to a regular string
        // using the toString method.
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "I AM AWESOME";
        System.out.print("Reversed String looks like : ");
        System.out.print(reversingString(str));
    }
}
