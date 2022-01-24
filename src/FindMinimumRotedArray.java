public class FindMinimumRotedArray {

    public static int getMin(int[] array, int minIndx, int maxIndx){

        if(maxIndx - minIndx == 1){
            return Math.min(array[minIndx], array[maxIndx]);
        }

        if(array[minIndx] < array[maxIndx]){
            return array[minIndx];
        } else {
            int mid = (maxIndx + minIndx) / 2;
            if (array[maxIndx] > array[mid]){
                return FindMinimumRotedArray.getMin(array, minIndx , mid);
            } else {
                return FindMinimumRotedArray.getMin(array, mid, maxIndx);
            }
        }

    }

    public static void main(String[] atgs){

        int[] inp = {2, 3, 4, 5, 0, 1};

        System.out.println(FindMinimumRotedArray.getMin(inp, 0, inp.length-1));

    }

}
