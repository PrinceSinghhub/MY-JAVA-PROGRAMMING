package JavaQuestion;

import java.util.Arrays;

public class reverse_array_using_swap {
    public static void main(String[] args) {

        int[] myarr = {-22,-1,-100,20,0,10};
        swap(myarr);
        System.out.println(Arrays.toString(myarr));
    }

    static void swap(int[] myarr) {
        int start = 0;
        int end = myarr.length-1;
        while (start<end){
            swapArray(myarr,start,end);
            start++;
            end--;
        }
    }

    static void swapArray(int[] myarr, int a, int b) {
        int temp = myarr[a];
        myarr[a] = myarr[b];
        myarr[b] = temp;
    }
}
