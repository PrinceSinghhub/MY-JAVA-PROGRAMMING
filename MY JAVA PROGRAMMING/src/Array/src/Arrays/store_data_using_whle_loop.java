package Arrays;

import java.util.Scanner;

public class store_data_using_whle_loop {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <5){
            int a = sc.nextInt();
            n[i] = a;
            i++;
        }

    }
}
