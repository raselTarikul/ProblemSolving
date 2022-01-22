public class CoinExchange {

    public static int numberOfWays(int[] coins, int total){
        int[] DP = new int[total+1];
        for(int i = 0; i <= total; i ++){
            DP[i] = Integer.MAX_VALUE;
        }

        DP[0] = 0;

        for(int a = 1; a <= total; a++){

            for(int c : coins){
                if(a - c >= 0){
                    DP[a] = Math.min(DP[a], 1 + DP[a -c]);
                }
            }

        }

        if(DP[total] == Integer.MAX_VALUE){
            return DP[total];
        } else {
            return -1;
        }

    }


    public static void main(String[] args){

        /*
            Fined minimum number of coins needed exchange of a total in a given set of coin

            Given Number array of coins [1, 2, 3]
            Given Total amount of 5

            Output : 5

         */

        int[] inp = {2};

        System.out.println(CoinExchange.numberOfWays(inp, 11));

    }
}
