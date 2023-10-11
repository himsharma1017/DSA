public class maximumIntegerValue {

    public static int calculatingMaxValue(String str){

        int result = 0;

        for(int index=0; index<str.length(); index++){

            //Retrieves the numeric value of the character at 
            //position i in the string using Character.getNumericValue()
            // and stores it in the digit variable.
            int digit = Character.getNumericValue(str.charAt(index));

            // Choose between '*' and '+'
            if(digit<=1 || result<=1)
                result = result+digit;
            else    
                result = result*digit;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "891";
        System.out.print("Maximum Integer Value is : ");
        System.out.print(calculatingMaxValue(str));
    }
}
