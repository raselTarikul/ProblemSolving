public class CoinExchange {

    public static int numberOfWays(int[] coins, int total){


        int temp[][] = new int[coins.length+1][total+1];
        for(int i=0; i <= coins.length; i++){
            temp[i][0] = 1;
        }
        for(int i=1; i <= coins.length; i++){
            for(int j=1; j <= total ; j++){
                if(coins[i-1] > j){
                    temp[i][j] = temp[i-1][j];
                }
                else{
                    temp[i][j] = temp[i][j-coins[i-1]] + temp[i-1][j];
                }
            }
        }
        return temp[coins.length][total];
    }


    public static void main(String[] args){

        /*
            Fine how may ways can be exchange of a total in a given set of coin

            Given Number array of coins [1, 2, 3]
            Given Total amount of 5

            Output : 5

         */

        int[] inp = {3, 2};

        System.out.println(CoinExchange.numberOfWays(inp, 5));

    }
}
