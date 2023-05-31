public class wordCount {

    static final int IN = 1;
    static final int OUT = 0;

    public static int countingWords(String str){
        int state = OUT;
        int wordCount = 0, index = 0;

        while(index<str.length()){
            if(str.charAt(index)==' ' || str.charAt(index)=='\n' 
            || str.charAt(index)== '\t'){
                state = OUT;
            }
            else if(state==OUT){
                state = IN;
                wordCount++;
            }
            index++;
        }
        return wordCount;
    }
    public static void main(String[] args) {
        String str = "One two       three\n four\tfive";
        System.out.println("Total words are " + countingWords(str));
    }
}
