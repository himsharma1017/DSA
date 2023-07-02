public class pascalTriangle {

    public static void formingPascal(int size){

        for(int line=1; line<=size; line++){

            int c=1;

            for(int index=1; index<=line; index++){
                System.out.print(c + " ");
                
                //The first value in the line is always 1.
                c = c*(line-index)/index;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 6;
        formingPascal(size);
    }
}
