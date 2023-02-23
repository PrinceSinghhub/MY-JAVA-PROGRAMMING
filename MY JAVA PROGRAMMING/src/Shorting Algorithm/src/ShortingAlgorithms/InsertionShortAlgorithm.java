package ShortingAlgorithms;
import java.util.Arrays;

public class InsertionShortAlgorithm {
    public static void main(String[] args) {

        int[] arr = {-1,6,9,7,4,0};
        insertionShort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionShort(int[] arr) {
        for (int i = 0; i <arr.length-1; i++) {

            for(int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swapElement(arr,j,j-1);
                }
                else {
                    break;
                }

            }

        }
    }

    static void swapElement(int[] arr, int i , int last) {

        int temp  = arr[i];
        arr[i] = arr[last];
        arr[last] = temp;
    }
}
