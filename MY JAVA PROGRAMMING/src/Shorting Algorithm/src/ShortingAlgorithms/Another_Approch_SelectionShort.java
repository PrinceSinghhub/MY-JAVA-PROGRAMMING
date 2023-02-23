package ShortingAlgorithms;

import java.util.Arrays;

public class Another_Approch_SelectionShort {
    public static void main(String[] args) {

        int[] arr = {0,9,8,-5};
        //call our function
        SelectionShort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionShort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int maxIndex = 0;
            int last = arr.length-i-1;

            for (int j = 0; j <=last; j++) {
                if(arr[j]>arr[maxIndex]){
                    maxIndex = j;
                }

            }
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;

        }

    }
}
