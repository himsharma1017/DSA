import java.util.*;
public class reversingWords {

    public static String wordsReversedOfString(String str){

        String[] words = str.split("\\.");

        StringBuilder reversed = new StringBuilder();

        for(int index=words.length-1; index>=0; index--){

            reversed.append(words[index]);

            if(index>0)
                reversed.append(".");
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.print("Reversing the words : ");
        System.out.print(wordsReversedOfString(str));
    }
}
