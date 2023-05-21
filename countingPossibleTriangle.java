public class countingPossibleTriangle {

    public static int possibleTriangles(int arr[], int size){
        int count=0;

        for(int i=0; i<size-2; ++i){
            int k=i+2;
            
            for(int j=i+1; j<size; ++j){
                while(k<size && arr[i]+arr[j]>arr[k])
                    ++k;
            
                    if(k>j)
                    count += k-j-1;
            }           
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 3, 7};
        System.out.println("The Posible Number of Triangles are : " + possibleTriangles(arr, arr.length));
    }
}
