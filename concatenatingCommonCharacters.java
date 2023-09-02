import java.util.*;
public class concatenatingCommonCharacters {

    public static String concatenation(String str1, String str2){

        String res = "";
        HashMap<Character,Integer> hobj = new HashMap<>();

        for(int index=0; index<str2.length(); index++)
            hobj.put(str2.charAt(index), 1);
        
        // Find characters of s1 that are not
        // present in s2 and append to result
        for(int index=0; index<str1.length(); index++){
            if(!hobj.containsKey(str1.charAt(index)))
                res += str1.charAt(index);
            else
                hobj.put(str1.charAt(index),2);
        }
        
        // Find characters of s2 that are not
        // present in s1.
        for(int index=0; index<str2.length(); index++){
            if(hobj.get(str2.charAt(index))==1)
                res += str2.charAt(index);
        }
        return res;
    }

    public static void main(String[] args) {
        String str1 = "aacdb";
        String str2 = "gafd";
        System.out.print("Concatenation of Common characters : ");
        System.out.print(concatenation(str1, str2));
    }
}
