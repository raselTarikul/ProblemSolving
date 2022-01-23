public class StockPrice {

    public static int maxProfit(int[] prices){

        int min = prices[0];
        int maxP = Integer.MIN_VALUE;

        for(int price: prices){
            min = Math.min(min, price);
            if(price - min > 0){
                maxP = Math.max(maxP, price - min);
            }
        }
        if(maxP > Integer.MIN_VALUE){
            return maxP;
        } else {
            return -1;
        }

    }

    public static void main(String[] args){

        /*
            Given a raary of positive integer thats denote the stocke proice
            for each day. Find our the nax profit you can make out of it.
         */

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(StockPrice.maxProfit(prices));

    }
}
