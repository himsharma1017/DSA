public class segregate0sand1s {

    public static void segregation(int arr[], int size){
        int count = 0;
        int index;

        for(index=0; index<size; index++){
            if(arr[index]==0)
            count++;

        for(index=0; index<count; index++)
            arr[index]=0;

        for(index=count; index<size; index++){
            arr[index] = 1;
        }
        }
    }

    static void print(int arr[], int size){
        System.out.println("The Array after segregation is : ");
        for(int index=0; index<size; index++)
            System.out.print(arr[index] + " ");
        
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 1};
        segregation(arr, arr.length);
        print(arr, arr.length);
    }
}
