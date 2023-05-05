public class findingIndices {

    public static void findIndex(int arr[], int size){
        int leftMin = 0;    int rightMin = 0;
        int leftMax = 0;    int rightMax = 0;

        int min = arr[0];   int max = arr[0];

        for(int index=1; index<size; index++){
            if(arr[index]<min){
                leftMin = rightMin = index;
                min = arr[index];
            }

            else if(arr[index]==min)
                rightMin = index;

            if(arr[index]>max){
                leftMax = rightMax = index;
                max = arr[index];
            }

            else if(arr[index]==max)
                rightMax = index;
        }
        System.out.println("The Left Most Minimum Element is : " + leftMin);
        System.out.println("The Left Most Maximum Element is : " + leftMax);
        System.out.println("The Right Most Minimum Element is : " + rightMin);
        System.out.println("The Right Most Maximum Element is : " + rightMax);
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 1, 2, 1, 5, 6, 5};
        findIndex(arr, arr.length);
    }
}
