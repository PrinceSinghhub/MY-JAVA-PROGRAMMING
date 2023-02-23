package ShortingAlgorithms;

import java.util.Arrays;

public class Another_Approch_Insernation_Short {
    public static void main(String[] args) {

        int[] arr = {-1,6,9,7,4,0};
        insertionShort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void insertionShort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int first = arr[i];
            int j = i-1;

            while (j>=0 && first<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = first;

        }

    }
}
