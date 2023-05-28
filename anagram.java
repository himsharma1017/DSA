import java.util.*;
public class anagram {

    public static boolean areAnagram(char str1[], char str2[]){

        int n1 = str1.length;
        int n2 = str2.length;

        if(n1!=n2)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int index=0; index<n1; index++){
            if(str1[index]!=str2[index])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char str1[] = {'l', 'i', 's', 't', 'e', 'n'};
        char str2[] = {'s', 'i', 'l', 'e', 'n', 't'};
        if(areAnagram(str1, str2))
            System.out.println("The two strings are Anagram of Each Other.");
        else
            System.out.println("The two strings are NOT Anagram of Each Other.");
    }
}
