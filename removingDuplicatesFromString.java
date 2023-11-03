import java.util.*;
public class removingDuplicatesFromString {

    public static void duplicatesRemoved(String str, int size){

        // A LinkedHashSet is a class in Java that extends the
        // capabilities of HashSet.However, unlike HashSet, 
        // LinkedHashSet also maintains the order of insertion 
        // of elements.
        LinkedHashSet<Character> result = new LinkedHashSet<>();

        for(int index=0; index<size; index++){
            char currentChar = str.charAt(index);
            if(!result.contains(currentChar)){
                result.add(currentChar);
            }
        }

        for(char index: result)
            System.out.print(index + " ");
    }

    public static void main(String[] args) {
        String str = "HappyNewYear";
        System.out.print("Characters left after removing Duplicates : ");
        duplicatesRemoved(str, str.length());
    }
}
