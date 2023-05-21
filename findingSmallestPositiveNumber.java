public class findingSmallestPositiveNumber {

    public static int findingPositiveNum(int arr[], int size){

        int ptr=0;

        for(int index=0; index<size; index++){
            if(arr[index]==1){
                ptr=1;
                break;
            }
        }

        if(ptr==0)
            return 1;

        for(int index=0; index<size; index++){
           if(arr[index]<0 || arr[index]>size) 
                arr[index]=1;
        }

        for(int index=0; index<size; index++)
            arr[(arr[index]-1)%size] += size;

        for(int index=0; index<size; index++){
            if(arr[index]<=size)
                return (index+1);
        }
        return (size+1);

    }
    public static void main(String[] args) {
        int arr[] = {2, 3, -7, 6, 8, 1, -10, 15};
        System.out.println(findingPositiveNum(arr, arr.length));
    }
}
