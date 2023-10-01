public class calculatingTheFine {

    public static int fineImposed(int fine[], int cars[], int date, int size){

        int totalFine = 0;

        for(int index=0; index<size; index++){
            if((cars[index]%2==1 && date%2==0) || (cars[index]%2==0 && date%2==1))
                totalFine += fine[index];
        }
        return totalFine;
    }

    public static void main(String[] args) {
        int fine[] = {200, 300, 400};
        int cars[] = {2222, 2223, 2224};
        int date = 8;
        System.out.print("The total fine imposed will be : ");
        System.out.print(fineImposed(fine, cars, date, fine.length));
    }
}
