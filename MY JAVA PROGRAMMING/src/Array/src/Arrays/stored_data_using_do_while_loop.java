package Arrays;

import java.util.Scanner;

public class stored_data_using_do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myarr = new int[5];
        int i = 0;
        do {
            int n = sc.nextInt();
            myarr[i] = n;
            i++;
        }while (i<5);
    }
}
