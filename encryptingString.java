public class encryptingString {

    public static String encryptedString(String str){

        StringBuilder encrypted = new StringBuilder();
        int count = 1, size = str.length();

        for(int index=1; index<=size; index++){

            //This condition checks if the current character
            // is the same as the previous character 
            //(forming a substring of identical letters).
            if(index<size && str.charAt(index)==str.charAt(index-1))
                count++;
            else{
                encrypted.append(str.charAt(index-1));
                encrypted.append(count);
                //The count variable is reset to 1 to 
                //start counting the occurrences of the next character.
                count = 1; 
            }
        }
        encrypted.reverse();
        return encrypted.toString();
    }

    public static void main(String[] args) {
        String str = "aabc";
        String encrypted = encryptedString(str);
        System.out.println("Encrypted String looks like : " + encrypted);
    }
}
