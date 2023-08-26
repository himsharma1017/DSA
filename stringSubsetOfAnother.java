import java.util.*;
public class stringSubsetOfAnother {

    public static int subset(String s1, String s2){

        // using indexOf method to check if s1 is
        // a substring of s2
        return s2.indexOf(s1);
    }

    public static void main(String[] args) {
        String s1 = "bk";
        String s2 = "facebook";

        int res = subset(s1, s2);

        if(res==-1)
            System.out.println("No Substring present !");
        else
            System.out.println("Present at Index : " + res);
    }
}
