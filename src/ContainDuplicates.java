import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {

    static boolean hasDuplicate(int[] arr){

        Set<Integer> s = new HashSet<>();

        for(int number: arr){
            if(s.contains(number)){
                return true;
            } else{
                s.add(number);
            }
        }

        return false;

    }

    public static void main(String[] args){
        /*

            Given a array of interger,
            find it has atlest one duplicate
            Inpute {1, 2, 3, 1}
            Output true
         */
        int[] inpute = {1, 2, 3, 4};
        System.out.println(ContainDuplicates.hasDuplicate(inpute));

    }
}
