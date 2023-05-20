public class trappingWater {

    public static int maxWater(int arr[], int size){

        int res = 0;

        for(int index1 = 1; index1<size-1; index1++){
            int left = arr[index1];

            for(int index2 = 0; index2<index1; index2++)
                left = Math.max(left, arr[index2]);
            
            int right = arr[index1];
            for(int index2 = index1+1; index2<size; index2++)
                right = Math.max(right, arr[index2]);

            res += Math.min(left, right)-arr[index1];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(maxWater(arr, arr.length));
    }
}
