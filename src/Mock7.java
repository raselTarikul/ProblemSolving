import java.util.Arrays;

public class Mock7 {

    public static void main(String[] args){
        /*

      ======
        "12", "12"
        [4, 2]
        [20, 10]
        [24, 12]
        [4, 4, 1]
        144
        "144"
        [18, 12, 6]
        [0, 15, 10, 5]
        [0, 0, 12, 8, 4]
        [18, 27 28, 13, 4]
        [8, 8, 0, 6, 5]
        [5,6,0,8,8]
        input : "123", "456"
        output : "56088"
         */

        System.out.println(multyply("123", "456"));

    }

    public static String multyply(String s1, String s2){
        int[] temp1 = new int[s1.length() + s2.length() + 1];
        for(int i = 0; i < s1.length(); i++ ){
            for(int j =0; j < s2.length(); j++){
                temp1[i + j] += (s2.charAt(j) -'0') * (s1.charAt(i) - '0');
            }

        }
        StringBuilder res = new StringBuilder();
        int reminder = 0;
        for(int i = temp1.length -1; i >0; i-- ){
            reminder = temp1[i]/10;
            res.append(temp1[i]%10);
            temp1[i-1] += reminder;


        }
        res.append(temp1[0]);
        while (res.charAt(0) == '0' && res.length() > 0){
            res.deleteCharAt(0);
        }
        return res.reverse().toString();

    }


}
