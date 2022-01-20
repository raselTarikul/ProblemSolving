import java.util.HashMap;
import java.util.Map;

public class NonRepetingCharacter {

    static Character getNonRepting(String s){
        Map<Character, Integer> m = new HashMap<>();

        for(Character c: s.toCharArray()){
            m.put(c, m.getOrDefault(c, 0)+ 1);
        }

        for(Character c: s.toCharArray()){
            if(m.get(c) == 1){
                return c;
            }
        }
        return 'c';
    }

//    public static void main(String[] args){
//        /*
//            Giben a string find the first non repeating character
//            "aabbccdee" => d
//            "xxyz" => y
//         */
//
//        System.out.println(NonRepetingCharacter.getNonRepting("xxyz"));
//
//    }
}
