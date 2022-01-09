import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommonElementOfTwoSortedArray {
    /*

    Given Tow sorted array of Integers
    Find out common item between tow array

    Input array [1, 3, 4, 6, 7, 9] and [1, 2, 4, 5, 9, 10]
    Output should be [1, 4, 9]
     */

//    public static void main(String[] args){
//        Integer[] inpute1 = {1, 3, 4, 6, 7, 9};
//        Integer[] inpute2 = {1, 2, 4, 5, 9, 10};
//
//       System.out.println(commonElement( inpute1, inpute2));
//    }

    public static ArrayList<Integer> commonElement(Integer[] inp1, Integer[] inp2){
        Integer indx1 = 0;
        Integer indx2 =0;
        ArrayList<Integer> res = new ArrayList<>();
        while (indx1 < inp1.length && indx2 < inp2.length){
            if(inp1[indx1] > inp2[indx2]){
                indx2 += 1;
            }else if (inp1[indx1] < inp2[indx2]) {
                indx1 +=1;
            } else {
                res.add(inp1[indx1]);
                indx1 +=1;
                indx2 +=1;
            }
        }
        return res;
    }

}
