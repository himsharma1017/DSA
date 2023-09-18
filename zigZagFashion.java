import java.util.Arrays;
public class zigZagFashion {
    static void zigZag(int arr[], int size)
    {
        // Flag true indicates relation "<" is expected,
        // else ">" is expected. The first expected relation
        // is "<"
        boolean flag = true;

        int temp = 0;

        for (int index = 0; index <= size - 2; index++) {
            if (flag) /* "<" relation expected */
            {
                /* If we have a situation like A > B > C,
                we get A > C < B by swapping B and C */
                if (arr[index] > arr[index + 1]) {
                    // swap
                    temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
            else /* ">" relation expected */
            {
                /* If we have a situation like A < B < C,
                we get A < C > B by swapping B and C */
                if (arr[index] < arr[index + 1]) {
                    // swap
                    temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
            flag = !flag;       /* flip flag */
        }
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        int arr[] = {1,4,3,2};
        zigZag(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

}
