public class Mock4 {

    public static int findMaxSum(int[] arr){
        int maxSum = arr[0];
        int currectSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            currectSum = Math.max(arr[i], currectSum + arr[i]);
            maxSum = Math.max(maxSum, currectSum);

        }

        return  maxSum;
    }


    public static void main(String[] args){
        /*
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
        Example 2:
        Input: nums = [1]
        Output: 1
        Example 3:

        Input: nums = []
        Output: 23
         */

        System.out.println(Mock4.findMaxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }


}
