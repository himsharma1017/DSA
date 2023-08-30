import java.util.*;
public class maximumOccuringCharacter {

    public static char occurenceOfCharacter(String str, int size){

        int count = 0;
        char ans = 0;

        HashMap<Character,Integer> hobj = new HashMap<>();

        for(int index=0; index<size; index++){

            char c = str.charAt(index);

            hobj.put(c, hobj.getOrDefault(c, 0)+1);

            if(count<hobj.get(c)){
                count = hobj.get(c);
                ans = c;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "output";
        System.out.print("Character which appears most is : ");
        System.out.print(occurenceOfCharacter(str, str.length()));
    }
}
