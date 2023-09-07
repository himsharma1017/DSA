public class firstCharOfEachWord {

    public static String onlyFirstCharacter(String str){

        String result = " ";

        // This variable will be used to keep track of 
        // whether the current character is the first 
        // character of a word or not.
        boolean value = true;

        for(int index=0; index<str.length(); index++){

            if(str.charAt(index) == ' '){

                // This means the next character 
                // encountered will be treated as the
                // first character of a new word.
                value = true;
            }
            else if(str.charAt(index)!=' ' && value==true){

                result += str.charAt(index);
                value = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = " bad is good";
        System.out.print("First letter of every string is : ");
        System.out.print(onlyFirstCharacter(str));
    }
}
