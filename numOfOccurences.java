public class numOfOccurences {

    public static int countingOccurences(int arr[], int size, int num){

        int count = 0;

        for(int index=0; index<size; index++){
            if(arr[index]==num)
                count++;
        }

        if(count>0)
            return count;
        else    
            return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 4, 2, 3,7,7,8,3};
        int num = 7;
        System.out.print("The count of occurence of " + num + " is : " + countingOccurences(arr, arr.length, num));
    }
}
