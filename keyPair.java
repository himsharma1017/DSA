public class keyPair {

    public static boolean findingKeyPair(int arr[], int size, int sum){
        for(int index = 0; index<size; index++){
            for(int index1 = 1; index1<size-1; index1++){
                if((arr[index]+arr[index1])==sum)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int sum = -2;
        findingKeyPair(arr, arr.length, sum);

        if(findingKeyPair(arr, arr.length, sum))
            System.out.println("Yes");        
        else
            System.out.println("No");        
    }
}
