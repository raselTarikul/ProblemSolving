import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MockTest2 {


    public static int[] findIndx(int[] inp, int sum){

        Map<Integer, Integer> temp = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < inp.length; i++){
            if(temp.getOrDefault(inp[i], null) != null){
                result[0] = temp.get(inp[i]);
                result[1] = i;
                break;
            } else {
                temp.put(sum-inp[i], i);
            }
        }
        return result;

    }

    static int[] reversArray(int[] inpute){

        int temp = 0;

        int lastIndx = inpute.length-1;

        for(int i = 0; i < (inpute.length/2); i++ ){
            temp = inpute[i];
            inpute[i] = inpute[lastIndx -i];
            inpute[lastIndx -i] = temp;
        }
        return inpute;
    }

    public static void main(String[] args){

        /*
        Given a array of integer and a target number
        Find out which the index which number makes the two
          In {1, 2, 4, 5, 7}
          sum = 7
          Output 1, 3
         */

        int[] inp = {2, 1, 10, 7, 9, 3};
        int sum = 5;
        int[] reslt = MockTest2.findIndx(inp, sum);

        System.out.println( "First " + reslt[0] + " Second " + reslt[1] );

        /*

        Given a array of integer, revers the in array without using a second array

         Int {1, 4, 6, 2, 7, 90, 21}
         Out {21, 90, 7, 2, 6, 4, 1}
         */

        int[] a = {1, 4, 6, 2, 7, 90, 21};

        System.out.println(Arrays.toString(MockTest2.reversArray(a) ));
        
    }
}
