import java.util.HashSet;
import java.util.Set;

public class MockTest1 {

    public static void main(String[] args){
        /*
        Input:
        num1 =  "11",
        num2 = "123"
        Output: "134"
        1 <= num1.length, num2.length <= 104
        num1 and num2 consist of only digits.
        num1 and num2 don't have any leading zeros except for the zero itself.
        You7:41 PM
        Pow(10, 4)
         */

//        String num1 = "12";
//        String num2 = "123";
//        int indx1 = num1.length() -1;
//        int indx2 = num2.length() -1;
//        String result = "";
//        int reminder = 0;
//
//        while (indx1 >= 0 || indx2 >= 0){
//           int sum1 =  0;
//           if (indx1 >= 0){
//               sum1 = sum1 + num1.charAt(indx1) - '0';
//           }
//            if (indx2 >= 0){
//                sum1 = sum1 + num2.charAt(indx2) - '0';
//            }
//
//            sum1  = sum1 + reminder;
//            result = sum1 % 10 + result;
//            reminder = sum1/10;
//            indx1 -= 1;
//            indx2 -= 1;
//        }
//        if (reminder >0) {
//            result = reminder + result;
//        }
//        System.out.println(result);

        Integer[] inp = {1, 2, 2, 1, 3, 4, 4};

        Set<Integer> s = new HashSet<>();
        int sum =  inp[0];
        for(int i= 1; i < inp.length; i ++){
            sum^= inp[i] ;
        }
        System.out.println(sum);


    }
}
