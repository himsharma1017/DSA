import java.util.*;
public class repeatedChracater {

    public static char repeatingCharacter(char str[]){

        HashSet<Character> hobj = new HashSet<>();

        for(int index=0; index<str.length-1; index++){

            char c = str[index];

            if(hobj.contains(c))
                return c;
            else
                hobj.add(c);
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        System.out.print("The Repeating Character is : ");
        System.out.println(repeatingCharacter(arr));
    }
}
