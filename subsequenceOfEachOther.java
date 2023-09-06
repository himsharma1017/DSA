import java.util.*;
public class subsequenceOfEachOther {

    public static boolean stringsSubsequence(String str1, String str2, int size1, int size2){

        // BASE CASE
        // If size1 becomes 0, it means that all characters 
        // of str1 have been matched, so str1 is 
        // indeed a subsequence of str2.
        if(size1==0)
            return true;

        // If size2 becomes 0 and size1 is still not 0,
        // it means that str1 has some characters remaining
        // but str2 has been fully traversed.
        if(size2==0)
            return false;

        // If last characters of two strings are matching
        if(str1.charAt(size1-1)==str2.charAt(size2-1))
            return stringsSubsequence(str1, str2, size1-1, size2-1);
        else
         // If last characters are not matching
            return stringsSubsequence(str1, str2, size1, size2-1);
    }

    public static void main(String[] args) {
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";

        if(stringsSubsequence(str1, str2, str1.length(), str2.length()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
