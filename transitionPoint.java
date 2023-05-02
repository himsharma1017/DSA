public class transitionPoint {

    public static int transitionPoint(int arr[], int size){

        for(int index=0; index<size; index++){
            if(arr[index]==1)
                return index;
            }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,0,0,0,0,0};
        int value = transitionPoint(arr, arr.length);

        if(value>=0)
            System.out.println("The transition occurs at index : " + value);
        else
            System.out.println("There is no transition point !");

    }
}
