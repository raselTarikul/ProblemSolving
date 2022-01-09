import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentlyOccurring {
    /*

    Given A array of Integer
    Fine The most Frequently Occurring Item
    Assume There is only one item is the most frequently occurring.
    Array is nonempty

    Sample Input [1,3,1,3,2,1]
    Sample Output 1

     */


//    public static void main(String[] args){
//        Integer[] numbers = {1,3,1,3,2,1, 3, 3};
//        System.out.println(mostFrequestOcceringItem(numbers));
//    }

    private static Integer mostFrequestOcceringItem(Integer[] numbers) {
        Map<Integer, Integer> counter= new HashMap<Integer, Integer>();
        Integer mostOccuringNumber = null;
        Integer mostOccuring = -1;
        for(int num: numbers){
            if(counter.get(num) == null){
                counter.put(num, 1);
            } else {
                counter.put(num, counter.get(num) + 1);
            }
            if (counter.get(num) > mostOccuring){
                mostOccuring = counter.get(num);
                mostOccuringNumber = num;
            }
        }
        return mostOccuringNumber;
    }
}
