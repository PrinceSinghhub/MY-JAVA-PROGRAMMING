package JavaQuestion;

import java.util.Arrays;

public class swap_number_in_Array {
    public static void main(String[] args) {
        int[] myarr = {1,2,3,4,5};
        //index 2 to swap 4
        System.out.println(Arrays.toString(myarr));
        swapArray(myarr,2,4);
        System.out.println(Arrays.toString(myarr));
    }

    static void swapArray(int[] myarr, int a, int b) {
        int temp = myarr[a];
        myarr[a] = myarr[b];
        myarr[b] = temp;
    }
}
