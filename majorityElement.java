public class majorityElement {

    public static void findMajorityElement(int arr[], int size){

        int maxCount = 0;
        int index = -1;
        for(int counter=0; counter<size; counter++){
            int count = 0;
            for(int counter1=0; counter1<size; counter1++){
                if(arr[counter]==arr[counter1])
                    count++;
            }

            if(count>maxCount){
                maxCount = count;
                index = counter;
            }
        }
        if(maxCount>size/2)
            System.out.println(arr[index]);
        
        else
            System.out.println("No Majority Element!");
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 1, 3, 5, 1};
        findMajorityElement(arr, arr.length);
    }
}
