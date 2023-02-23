package SearchingAlgorithms;

import java.util.Scanner;

public class search_the_element_in_givven_array {
    public static void main(String[] args) {

        int[] myarr = {10,20,60,4,0,80,800};
        searchElement(myarr);
    }

    static void searchElement(int[] myarr) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int arr : myarr){
            if(arr==n){
                System.out.println("Element are foud!");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Element are not foud!");
        }
    }

}
