import java.net.CacheRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class distributeCandies {

    public static List<Integer> candiesToBeDistributed(int N, int K){

        //Initialize a list of K people with 0 candies.
        List<Integer> listObj = new ArrayList<>(Collections.nCopies(K, 0)); 

        int index = 0;

        //Loop will run until we have no more candies
        //to distribute.
        while(N>0){

            int candiesToGive = Math.min(N, index+1);

            //Distribute candies to i-th person.
            listObj.set(index%K, listObj.get(index%K)+candiesToGive);

            //Subtract the distributed candies from N.
            N = N-candiesToGive;

            //Move to the next person.
            index = index+1;
        }
        return listObj;
    }

    public static void main(String[] args) {
        int N=7;
        int K=4;
        List<Integer> listObj = candiesToBeDistributed(N, K);
        
        for(int index=0; index<K; index++)
            System.out.print(listObj.get(index) + " ");
    }
}
