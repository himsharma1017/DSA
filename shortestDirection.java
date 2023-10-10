import java.util.*;
public class shortestDirection {

    public static String findingShortestDirection(String str){

        int x = 0, y = 0;

        // Count the number of each direction
        for(char ch: str.toCharArray()){

            if(ch=='N')
                y++;
            else if(ch=='S')
                y--;
            else if(ch=='E')
                x++;
            else if(ch=='W')
                x--;
        }

        StringBuilder result = new StringBuilder();

        // Append the appropriate direction as needed
        while(x<0){
            result.append('W');
            x++;
        }

        while(x>0){
            result.append('E');
            x--;
        }

        while(y>0){
            result.append('N');
            y--;
        }

        while(y<0){
            result.append('S');
            y++;
        }

        // Sort the characters lexicographically
        char[] chars = result.toString().toCharArray();
        Arrays.sort(chars);

        return new String(chars);

    }

    public static void main(String[] args) {
        String str = "NESNWES";
        System.out.print("Shortest Direction is : " + findingShortestDirection(str));
    }
}
