import java.util.*;
public class charsToMakeAnagram {

    final static int chars = 26;

    public static int removedCharsToMakeAnagram(String str1, String str2){

        int arr[] = new int[chars];

        for(int index=0; index<str1.length(); index++){
            arr[str1.charAt(index)-'a']++;
        }

        for(int index=0; index<str2.length(); index++){
            arr[str2.charAt(index)-'a']--;
        }

        int ans = 0;

        for(int index=0; index<chars; index++){
            ans += Math.abs(arr[index]);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "cddgk";
        String str2 = "gcd";
        System.out.print("Minimum characters removed to make Anagram are : ");
        System.out.println(removedCharsToMakeAnagram(str1, str2));
    }
}
