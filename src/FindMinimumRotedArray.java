public class FindMinimumRotedArray {

    public static int getMin(int[] array, int minIndx, int maxIndx){

        if(array[minIndx] < array[maxIndx]){
            return array[minIndx];
        } else {
            int mid = (maxIndx + minIndx) / 2;
            if (array[maxIndx] > array[mid]){

                //Rite sirterd
                return FindMinimumRotedArray.getMin(array, minIndx , mid-1);
            } else {
                // Left sorted
                return FindMinimumRotedArray.getMin(array, mid, maxIndx);
            }
        }

    }

    public static int finNumber(int[] arr, int l, int r, int terget){
        int m = (l + r)/2;
        System.out.println(m);
        if (arr[m] == terget){
            return m;
        }

        if(arr[m] > arr[l]){
            // Left sorter
            if (terget < arr[l] || terget > arr[m]){
                l = m + 1;
            } else {
                r = m - 1;
            }
        } else {
            //Right
            if(terget < arr[m] || terget > arr[r]){
                r = m - 1;
            } else{
                l = m +1;
            }
        }
        return FindMinimumRotedArray.finNumber(arr, l, r, terget);
    }

    public static void main(String[] atgs){

        int[] inp = {2, 3, 4, 5, 0, 1};

        System.out.println(FindMinimumRotedArray.finNumber(inp, 0, inp.length-1, 5));

    }

}
