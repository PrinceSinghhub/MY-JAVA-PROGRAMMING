package Arrays;

import java.util.Scanner;

public class excess_data_using_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myarr = new int[5];
        int i = 0;
        do {
            int n = sc.nextInt();
            myarr[i] = n;
            i++;
        }while (i<5);

//        todo excess data using loop
        for (int j = 0; j < 5; j++) {
            System.out.println("myarr["+j+"]" + " = "+myarr[j]);
        }
        System.out.println(myarr);
    }
}
