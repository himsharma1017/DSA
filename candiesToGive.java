import java.util.*;
public class candiesToGive {

    public static List<Integer> distributeCandies(int N, int K){

        
        List<Integer> result
            = new ArrayList<>(Collections.nCopies(K, 0)); // initialize a list of K people
                        // with zero candies

        int index = 0;
        while (N > 0) { // loop until we have no more
                        // candies to distribute

        int candiesToGive = Math.min(N, index + 1);

        result.set(index % K,result.get(index % K)+ candiesToGive); // distribute candies
                                      // to the i-th person
            
        N -= candiesToGive; // subtract the distributed
                                // candies from N

        index += 1; // move to the next person
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 10;
        int K = 3;
        List<Integer> result = distributeCandies(N, K);
        for (int index = 0; index < K; index++) {
            System.out.print(result.get(index) + " ");
        }
    }
}
