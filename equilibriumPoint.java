public class equilibriumPoint {
    
    public static int equilibriumPoint(int arr[], int size){

        int sum=0, leftSum=0;

        for(int index=0; index<size; index++){
            sum += arr[index];
        }

        for(int index2=0; index2<size; index2++){
            sum -= arr[index2];

            if(leftSum==sum)
            return index2;

            leftSum += arr[index2];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,2};
        System.out.println("The First Equilibrium index is at : " + equilibriumPoint(arr, arr.length));
    }
}
