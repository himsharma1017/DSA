import java.util.*;
public class numberWithMaxZeroes {

    public static int countZeroes(int num){
        int count = 0;

        while(num>0){
            if(num%10==0)
                count++;
            // This is done to move to the next digit in
            // the number for the next iteration of the loop.
            num = num/10;
            
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 3, 9999, 2};
        int size = arr.length;

        int maxZeroCount = -1, numberWithMaxZeroes = -1;

        for(int index=0; index<size; index++){
            int currentNumber = arr[index];
            int zeroCount = countZeroes(currentNumber);

            if(zeroCount>maxZeroCount || (zeroCount==maxZeroCount && currentNumber>numberWithMaxZeroes)){
                maxZeroCount = zeroCount;
                numberWithMaxZeroes = currentNumber;
            }
        }

        if(maxZeroCount==0)
            System.out.println("No Number found with Max Zeroes !");
        else
            System.out.println("Number with Max Zeroes is : " + numberWithMaxZeroes);
    }
}
