public class ArrayRotation {

    static boolean isRotation(int[] a, int[] b){
        int indx = -1;
        boolean result = true;

        for(int i = 0; i < a.length; i++){
            if(a[0] == b[i]){
                indx = i;
                break;
            }
        }

        if(indx == -1){
            return false;
        }

        for(int i =0 ; i < a.length; i++){
            if(a[i] != b[(indx + i) % a.length]){
                result = false;
                break;
            }
        }

        return result;
    }

//    public static void main(String[] args) {
//        /*
//            Given Tow array
//            A = [1, 2, 3, 4, 5, 6, 7]
//            B = [3, 4, 5, 6, 7, 1, 2]
//
//            Find if the second array is rotation of first one
//         */
//
//        int[] a1 = {1, 2, 3, 4, 5, 6, 7};
//        int[] a2 = {3, 4, 5, 6, 7, 1, 2};
//
//        System.out.println(ArrayRotation.isRotation(a1, a2));
//    }

}
