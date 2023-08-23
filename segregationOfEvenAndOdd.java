public class segregationOfEvenAndOdd {

    public static void evenAndOdd(int arr[], int size){

        for(int index=0; index<size; index++){
            while(arr[index]%2==0 && arr[index+1]%2==0){
                if(arr[index]>arr[index+1]){
                    arr[index+1] = arr[index];
                    System.out.print(arr[index] + " " + arr[index+1]);
                }
                else
                    System.out.print(arr[index] + " " + arr[index+1]);
            }

            while(arr[index]%2!=0 && arr[index+1]%2!=0){
                
        }
    }

    public static void main(String[] args) {
        
    }
}
