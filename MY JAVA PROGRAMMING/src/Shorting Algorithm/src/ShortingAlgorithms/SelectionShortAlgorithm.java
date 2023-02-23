package ShortingAlgorithms;

import java.util.Arrays;

public class SelectionShortAlgorithm {
    public static void main(String[] args) {

        int[] arr = {9,8,9,7,0};
        //call our function
        SelectionShort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionShort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length-i-1;
            int maxIndex = FindMaxIndex(arr,0,last);

            swapElement(arr,maxIndex,last);
        }

    }
//                                          fist          end
    static void swapElement(int[] arr, int maxElement, int last) {

        int temp = arr[last];
        arr[last] = arr[maxElement];
        arr[maxElement] = temp;

    }

    static int FindMaxIndex(int[] arr, int start, int end) {

        int max = start;
        for (int i = start; i <=end ; i++) {

            if(arr[i]>arr[max]){
                max = i; // return index only
            }
        }
        return max;
    }
}
