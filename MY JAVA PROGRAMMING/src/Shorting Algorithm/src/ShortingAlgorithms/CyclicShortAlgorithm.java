package ShortingAlgorithms;

import java.util.Arrays;

public class CyclicShortAlgorithm {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        cyclicShort(arr);
        System.out.println(Arrays.toString(arr));
    }

   static void cyclicShort(int[] arr) {
        int i = 0;
        while (i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swapElement(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static void swapElement(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
