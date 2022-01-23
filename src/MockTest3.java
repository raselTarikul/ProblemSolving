import java.util.Arrays;

public class MockTest3 {

    public static void main(String[] args){

        /*

            [1, 2, 3, 4, , , , ]
            [1, 2, 3, 4]
            [1, 1, 2, 2, 3, 3, 4, 4]
         */

        int[] arr1 = {1, 2, 3, 4, 0, 0, 0, 0};
        int[] arr2 = {1, 1, 1, 1};

        System.out.println(Arrays.toString(MockTest3.sortInPlace(arr1, arr2, 4)));


    }

    public static int[] sortInPlace(int[] larger, int[] small, int l){

        int p1 = l-1;
        int p2 = l -1;
        int p3 = larger.length -1;

        for(int i = 0; i < l; i++ ){
           if(larger[p1] >= small[p2]) {
                larger[p3--] = larger[p1--];
            } else {
                larger[p3--] = small[p2--];
            }
        }
        for(int i = 0; i < p2; i++){
            larger[p3--] = small[p2-i];
        }
        return larger;


    }
}
