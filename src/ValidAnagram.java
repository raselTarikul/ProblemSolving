import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean isAnagram(String s1, String s2){
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        // if length is different, return false
        if (s1.length() != s2.length()){
            return false;
        }

        // count all the character occurrence
        // if both contain same character and same occarance
        // then return true else return lfase
        for(int i=0; i < s1.length(); i++){
            m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0)+1);
            m2.put(s2.charAt(i), m2.getOrDefault(s2.charAt(i), 0)+1);
        }

        for(int i = 0; i < s1.length(); i++){
            if(m1.getOrDefault(s1.charAt(i), 0 ) != m2.getOrDefault(s1.charAt(i), 0)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        /*
            Given two string s1 and s2,
            find if one is anagram of others.
            both strings contain same character
            on a same order.

            Inpur s1 = "anagram"
                  s2 = "angaram"

            Output = true

            Input s1 = "rat"
            Input s2 = "cat"

            Output: false
         */

        System.out.println(isAnagram("rat",  "cat"));

    }
}
