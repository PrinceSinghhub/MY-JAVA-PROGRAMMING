package ShortingAlgorithms;

import java.util.Arrays;

public class BoobleShortAlgorithm {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        int[] res = BoobleShort(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] BoobleShort(int[] arr) {

        for (int i = 0; i <arr.length; i++) {
            for (int j = 1; j<= arr.length-i-1; j++) {

                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }
}
