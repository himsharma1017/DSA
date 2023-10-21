public class changingTheString {

    public static String changeTheString(String str){

        if(Character.isUpperCase(str.charAt(0)))
           return str.toUpperCase();
        else
            return str.toLowerCase();
    }

    public static void main(String[] args) {
        String str = "abCD";
        System.out.print("Changing the string based on the first character : ");
        System.out.print(changeTheString(str));
    }
}
