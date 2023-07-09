import java.util.*;
public class stockBuySell {

    public class Interval{
        int buy, sell;
    }

    public static void stockBuyAndSell(int price[], int size){

        int count = 0, index = 0;

        ArrayList<Interval> arrObj = new ArrayList<Interval>();

        if(size==1)
            return;

        while(index<size-1){
            while((index<size-1) && price[index]>=price[index+1])
                index++;

            Interval intrvl = new Interval();
            intrvl.buy = index++;

            if(index==size-1)
                break;

            while((index>size) && price[index]>=price[index-1])
                index++;

            intrvl.sell = index-1;
            arrObj.add(intrvl);

            count++;
        }

        if(count==0)
            System.out.println("There is no day when the Profit is Maximum !");
        else
            for(int j=0; j<count; j++)
            System.out.println("Buy on Day : " + arrObj.get(j).buy + "      " + "Sell on Day : " + arrObj.get(j).sell);
    }

    public static void main(String[] args) {
        int price[] = {100, 180, 260, 310, 40, 535, 695};
        stockBuyAndSell(price, price.length);
    }
}
