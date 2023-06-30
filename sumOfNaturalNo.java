public class sumOfNaturalNo {

    public static int summationOfNatural(int input){

        int sum = (input*(input+1))/2;
        return sum;
    }
    
    public static void main(String[] args) {
        int input = 4;
        System.out.print("Sum of Natural number is : " + summationOfNatural(input));
    }
}
