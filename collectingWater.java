public class collectingWater {

    public static int trappingWater(int arr[], int size){

        
        // Let the first element be stored as
        // previous, we shall loop from index 1.
        int prev = arr[0], prevIndex = 0, water = 0;

        
        // To store the water until a larger wall
        // is found, if there are no larger walls
        // then delete temp value from water.
        int temp = 0;

        for(int index=1; index<=size; index++){
            
            // If the current wall is taller than
            // the previous wall then make current
            // wall as the previous wall and its
            // index as previous wall's index
            // for the subsequent loops.
            if(arr[index]>prev){
                prev = arr[index];
                prevIndex = index;
                // Because larger or same height wall is found.
                temp = 0;
            }

            else{

                // Since current wall is shorter than
                // the previous, we subtract previous
                // wall's height from the current wall's
                // height and add it to the water.
                water = water + prev - arr[index];

                // Store the same value in temp as well
                // If we dont find any larger wall then
                // we will subtract temp from water.
                temp = temp + prev - arr[index];
            }
        }

        // If the last wall was larger than or equal
        // to the previous wall then prev_index would
        // be equal to size of the array (last element)
        // If we didn't find a wall greater than or equal
        // to the previous wall from the left then
        // prev_index must be less than the index
        // of the last element.
        if(prevIndex<size){

            // Temp would've stored the water collected
            // from previous largest wall till the end
            // of array if no larger wall was found then
            // it has excess water and remove that
            // from 'water' variable.
            water = water - temp;

            // We start from the end of the array, so
            // previous should be assigned to the last
            // element.
            prev = arr[size];

            // Loop from the end of array up to the
            // 'previous index' which would contain the
            // "largest wall from the left".
            for(int index=size; index>=prevIndex; index--){
                // Right end wall will be definitely smaller
                // than the 'previous index' wall.
                if(arr[index]>prev)
                    prev = arr[index];

                else
                    water = water + prev - arr[index];
            }
        }
        //Return the maximum water.
        return water;
    }

    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 0, 4};
        System.out.print("Maximum amount of water that can be collected is : " + trappingWater(arr, arr.length-1));
    }
}
