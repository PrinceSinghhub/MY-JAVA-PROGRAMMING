package ShortingAlgorithms;

import java.util.Arrays;

public class Short_arrar_DesendingOrder_using_BoobleShort {
    public static void main(String[] args) {

        int[] arr = {9,8,4,6,5,10,80,0,60,40,-10,-1};
        int[] res = BoobleShort(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] BoobleShort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j<= arr.length-i-1; j++) {

                if(arr[j]>arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }
}
