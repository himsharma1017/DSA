public class nonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "algorithm";
        int index = -1;
        char fnc = ' ';

        if(str.length()==0)
            System.out.println("EMPTY STRING.");

        for(char i : str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                fnc = i;
                break;
            }
            else
                index++;
        }
        if(index==str.length()-1)
            System.out.println("Characters are repeating.");
        else
            System.out.println("First NON Repeating Character is : " + fnc);
    }
}
