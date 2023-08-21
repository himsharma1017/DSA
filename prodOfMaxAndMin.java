public class prodOfMaxAndMin {

    public static int maxAndMin(int arr1[],int arr2[], int size1, int size2){

        int max = arr1[0], min = arr2[0];

        for(int index=1; index<size1; index++){
            if(arr1[index]>max)
                max = arr1[index];
        }

        for(int index=1; index<size2; index++){
            if(arr2[index]<min)
                min = arr2[index];
        }
        return max*min;
    }

    public static void main(String[] args) {
        int arr1[] = {0, 0, 0, 0};
        int arr2[] = {1, -1, 2};
        System.out.print("The product of Maximum value of arr1 and Minimum value of arr2 is : " + maxAndMin(arr1, arr2, arr1.length,arr2.length));
    }
}
