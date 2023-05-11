public class facingTheSun {

    public static int countingBuildings(int arr[], int size){
        int count = 1;
        int currMax = arr[0];
    
        for(int index=1; index<size; index++){
            if(arr[index]>currMax || arr[index]==currMax){
                count++;
                currMax = arr[index];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5};
        int res = countingBuildings(arr, arr.length);
        System.out.println(res);
    }
}
