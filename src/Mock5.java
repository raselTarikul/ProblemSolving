public class Mock5 {

    public static void main(String[] args){
        /*
             {1, 3, 2, 5, 21, 7, 23, 0, 2}
              {2, 5, 21}
              True
              {3, 2, 7}
              true
              {3, 2, 1}
              false
         */

        System.out.println(Mock5.isSubsequence(new int[]{1, 3, 2, 5, 21, 7, 23, 0, 2}, new int[]{3, 2, 7}));
        System.out.println("----");
    }

    private static boolean isSubsequence(int[] arr1, int[] arr2){
        int senondInd = 0;
        for(int i= 0; i < arr1.length; i++){
            if(senondInd == arr2.length){
                break;
            }
            if(arr1[i] == arr2[senondInd]){
                senondInd++;
            }
        }
       return senondInd == arr2.length;

    }
}
