public class uncommonCharacters {
   
    // size of the hash table
       static int MAX_CHAR = 26;

    public static void findingUncommon(String str1, String str2){

        // mark presence of each character as 0
        // in the hash table 'present[]'
        int present[] = new int[MAX_CHAR];

        for(int index=0; index<MAX_CHAR; index++){
            present[index] = 0;
        }
       
        // for each character of str1, mark its
        // presence as 1 in 'present[]'
        for(int index=0; index<str1.length(); index++){
            present[str1.charAt(index) - 'a'] = 1;
        }

        // for each character of str2
        for(int index=0; index<str2.length(); index++){           
            // if a character of str2 is also present
            // in str1, then mark its presence as -1.
            if(present[str2.charAt(index)-'a']==1 || present[str2.charAt(index)-'a']==-1){
                present[str2.charAt(index)- 'a'] = -1;
            }
            else{
                // else mark its presence as 2.
                present[str2.charAt(index)-'a'] = 2;
            }
        }

        for(int index=0; index<MAX_CHAR; index++){
            if(present[index]==1 || present[index]==2)
            
        // print all the uncommon characters.
                System.out.print((char)(index+'a') + " ");
        }
    }

    public static void main(String[] args) {
        String str1 = "characters";
        String str2 = "alphabets";
        System.out.print("Uncommon characters are : ");
        findingUncommon(str1, str2);
    }
}
