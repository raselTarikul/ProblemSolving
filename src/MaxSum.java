public class MaxSum {

    public static int maxSum(int[] arr){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i : arr){
            if (currentSum < 0){
                currentSum = 0;
            }
            currentSum = currentSum + i;
            maxSum = Math.max(maxSum, currentSum);
        }

        return  maxSum;

    }

    public static void main(String[] args){

        /*

         Given a array of integer that can contain positive and negative number,
         Find our the max sum of a sub array of it.

         Given {-2, 1, -3, 4, -1, 2, 1, -5, 4}
         Output : 6
         */

        int[] inp = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] inp2 = {-2, -1, -3};

        System.out.println(MaxSum.maxSum(inp2));

    }
}
