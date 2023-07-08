public class maximumValue {

    public static int gettingMaxValue(int arr[], int size){

        int maxValue = arr[0], maxValIndex = 0;

        int minValue = arr[0], minValIndex = 0, result = 0;

        for(int index=1; index<size; index++){
            if(arr[index]>maxValue){
                maxValue = arr[index];
                maxValIndex = index;
            }

            else if(arr[index]<minValue){
                minValue = arr[index];
                minValIndex = index;
            }
        }
        return ((maxValue-maxValIndex)-(minValue-minValIndex));
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        System.out.print("The Output is : " + gettingMaxValue(arr, arr.length));
    }
}
