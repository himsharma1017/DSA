public class minNumberJumps {

    public static int minJumps(int arr[], int left, int right){
        if(left==right)
            return 0;

        if(arr[left]==0)
            return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        for(int index=left+1; index<=right && index<=left+arr[left];index++){
            int jumps = minJumps(arr, index, right);
            if(jumps!=Integer.MAX_VALUE && jumps+1<min)
                min = jumps+1;
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println("The Minimum Number of jumps required is : " + minJumps(arr, 0, arr.length-1));
    }
}
