public class OneWayEdit {

    public static boolean isOneAway(String s1, String s2){

        // If two are same langth
        if (s1.length() == s2.length()){
            int diff = 0;
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(i)){
                    diff++;
                }
            }
            if(diff > 1){
                return false;
            } else {
                return true;
            }
        } else {
            if(Math.abs(s1.length() - s2.length()) > 1){
                return false;
            }
            String small = "";
            String larger = "";

            if (s1.length() > s2.length()){
                small = s2;
                larger = s1;
            } else {
                small = s1;
                larger = s2;
            }
            int sindx = 0;
            int lindx = 0;

            int diff = 0;

            for(int i = 0; i < small.length(); i++){
                if(small.charAt(sindx) != larger.charAt(lindx)){
                    diff++;
                    lindx++;
                    if (diff > 1){
                        return false;
                    }
                } else {
                    sindx++;
                    lindx++;
                }


            }
            return  true;
        }

        // is length deiifernce is more than one the -> false

        // if length difference is 1 then check if removing one character form larger string make the same string


    }

    public static void main(String[] args){

        /*
         Given two string, find if its one way edit.
         Supported operations are
         Change - that can chane character
         Add - that can add a character at any opsiton
         Delete - that can delete a character


        isOneAway("abcde", "abcd");  // should return true
        isOneAway("abde", "abcde");  // should return true
        isOneAway("a", "a");  // should return true
        isOneAway("abcdef", "abqdef");  // should return true
        isOneAway("abcdef", "abccef");  // should return true
        isOneAway("abcdef", "abcde");  // should return true
        isOneAway("aaa", "abc");  // should return false
        isOneAway("abcde", "abc");  // should return false
        isOneAway("abc", "abcde");  // should return false
        isOneAway("abc", "bcc");  // should return false

         */
        System.out.println(isOneAway("abcdef", "abcde"));  // should return true
        isOneAway("abde", "abcde");  // should return true
        isOneAway("a", "a");  // should return true
        isOneAway("abcdef", "abqdef");  // should return true
        isOneAway("abcdef", "abccef");  // should return true
        isOneAway("abcdef", "abcde");  // should return true
        isOneAway("aaa", "abc");  // should return false
        isOneAway("abcde", "abc");  // should return false
        isOneAway("abc", "abcde");  // should return false
        isOneAway("abc", "bcc");  // should return false

    }


}
