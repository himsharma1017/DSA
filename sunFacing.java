public class sunFacing {

    public static int facingTheSun(int arr[], int size){

        //First Building will always see the Sunlight. So, the count
        //is initiated from 1.
        int maxHeight = arr[0], count = 1;

        //Traversing the elements.
        for(int index=1; index<size; index++){
            //If Current Element is greater than or equal to Max Height,
            //then Update Max Height and increment Count.
            if(arr[index]>maxHeight || arr[index]==maxHeight){
                maxHeight = arr[index];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5};
        System.out.print("Number of Buildings which will receive the Sunlight are : " + facingTheSun(arr, arr.length));
    }
}
