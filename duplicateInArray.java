public class duplicateInArray {

    public static int duplicateInArray(int arr[], int size){

        for(int index1=0; index1<arr.length; index1++){
            for(int index2= index1+1; index2<arr.length; index2++){
                if(arr[index1]==arr[index2])
                return arr[index1];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3};
        int res = duplicateInArray(arr, arr.length);
        System.out.print(res);
    }
}
