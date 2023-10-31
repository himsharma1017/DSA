public class unionOfArrays {

    public static void arraysUnited(int arr1[], int size1, int arr2[], int size2){

        int i = 0, j = 0;

        while(i<size1 && j<size2){
            
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }

            else if(arr2[j]<arr1[i]){
                System.out.print(arr2[j] + " ");
                j++;
            }

            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

            while(i<size1){
                System.out.print(arr1[i] + " ");
                i++;
            }

            while(j<size2){
                System.out.print(arr2[j] + " ");
                j++;
            }
    }

    public static void main(String[] args) {
        int arr1[] = {2, 2, 3, 4, 5};
        int arr2[] = {1, 1, 2, 3, 4};
        System.out.print("Union of Both the arrays is : ");
        arraysUnited(arr1, arr1.length, arr2, arr2.length);
    }
}
