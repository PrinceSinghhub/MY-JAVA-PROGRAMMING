package ShortingAlgorithms;

import java.util.Arrays;

public class IfArrayAreSortedBoobleShort {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] res = BoobleShort(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] BoobleShort(int[] arr) {

        boolean result;
        for (int i = 0; i < arr.length; i++) {
            result = false;
            for (int j = 1; j<= arr.length-i-1; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    result = true;
                }

            }
//            if we do not any swap in inner loop in 1st itteration means our array are sorted
            if(!result){  // also write result==false
                break;
            }

        }
        return arr;
    }
}


