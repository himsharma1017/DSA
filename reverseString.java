public class reverseString {

    public static String reversedString(String text){
        String reversed = new String("");

        for(int index=0; index<text.length(); index++){
            reversed = text.charAt(index) + reversed;
        }
        return reversed;
    }
    public static void main(String[] args) {
        String str = new String("Hello");
        String result = reversedString(str);
        System.out.println(result);
    }
}
