package SearchingAlgorithms;

import java.util.Scanner;

public class Seach_index_number_of_element {
    public static void main(String[] args) {

        int[] myarr = {10,20,60,4,0,80,800};
        findIndex(myarr);
    }

    static void findIndex(int[] myarr) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;

        for (int i = 0; i < myarr.length; i++) {
            if(myarr[i]==n){
                System.out.println("The Index of Element is " + i);
                c++;

            }
        }
        if (c == 0) {
            System.out.println("Sorry Element are Not found!");
        }
    }
}
