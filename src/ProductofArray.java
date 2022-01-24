import java.util.Arrays;

public class ProductofArray {


    public static int[] getproduct(int[] inpute){

        int[] result = new int[inpute.length];
        int prefix = 1;

        for(int i = 0; i < inpute.length; i++){
            result[i] = prefix;
            prefix = prefix * inpute[i];
        }

        int postfix = 1;
        for(int i = inpute.length -1; i >=0 ; i--){
            result[i] = result[i] * postfix;
            postfix = postfix * inpute[i];
        }

        return result;

    }

    public static void main(String[] args){

        /*
            Given a array of integer, return a array chat conatins
            product of array except the currect item

            Input =  [1, 2, 3, 4]
            Output = [24, 12, 8, 6]

            Input [-1, 1, 0, -3, 3]
            Output [0 0 , 9, 0, 0]
         */

        int[] inp = {-1, 1, 0, -3, 3};

        System.out.println(Arrays.toString(ProductofArray.getproduct(inp)));
    }
}
