import java.lang.reflect.Array;

public class binarySearch {

public static int binarySearch (int start, int end, int arr[], int value )
{
    while (start <= end )
    {
        int mid = (start + end) / 2;
        if (arr[mid] == value)
        { return mid;
        }

        if (arr[mid] > value)
        {
            return binarySearch(start, mid-1, arr, value);
//         end = mid -1;
            
        } else {
//             start = mid + 1;
            return binarySearch(mid+1, end, arr, value);

        }
//     }
    // return -1;
}
    return value;
}

public static void main(String[] args) {
int arr[] = {1,2,3,4,5,6,7};    
int value = 7;
System.out.println(binarySearch(0,arr.length,arr,value));
}
}