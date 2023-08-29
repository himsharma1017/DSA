import java.util.*;
public class stringsBeingRotated {

    public static boolean RotationOfEachOther(String s1, String s2){

        return ((s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1));
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        if(RotationOfEachOther(s1, s2))
            System.out.println("Strings are rotated version of each other.");
        else
            System.out.println("No Rotations possible !");
    }
}
