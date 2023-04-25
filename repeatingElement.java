public class repeatingElement {

    public static int reverse(int arr[], int size){
        for(int index=0; index<size; index++){
            
            for(int j=0; j<size; j++){
                if(index!=j && arr[index]==arr[j])
                break;

                if(j==size)
                    return arr[index];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,2,6,5,6,8,1};
        System.out.println(reverse(arr, arr.length));
    }
}
