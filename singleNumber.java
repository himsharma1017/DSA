public class singleNumber {

    public static int numberAppearingOdd(int arr[], int size){

        int result = 0;

        for(int index=0; index<size; index++){

             result = result^arr[index];
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 2, 2};
        int result = numberAppearingOdd(arr, arr.length);

        if(result>0)
            System.out.print("Element appearing Odd no. of times is : " + result);
        else
            System.out.println("All the Numbers appear Even no. of times !");

    }
}
