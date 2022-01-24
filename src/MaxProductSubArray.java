public class MaxProductSubArray {

    public static int maxProduct(int[] numbers){

        int maxPro = Integer.MIN_VALUE;
        int minPro = Integer.MAX_VALUE;
        int currentPro = 1;

        for(int num: numbers){
            if (num == 0){
                currentPro = 1;
            } else {
                currentPro = currentPro * num;
                maxPro = Math.max(currentPro, maxPro);
                minPro = Math.min(currentPro, minPro);
            }
        }

        return maxPro;

    }

    public static void main(String[] args){

        /*
          Input = [2, 3, -2, 4]
          Out = 6

         */
        int[] inp = {2, 3, -2, 4};

        System.out.println(MaxProductSubArray.maxProduct(inp));

    }

}
