package SearchingAlgorithms;

import java.util.Scanner;

public class return_if_element_are_matched {
    public static void main(String[] args) {

        int[] myarr = {10,20,60,4,0,80,800};
        int res = returnElement(myarr);
        if(res==-1){
            System.out.println("Sorry element are not Found!");
        }
        else{
            System.out.println("the element is: " + res);
        }
    }

    static int returnElement(int[] myarr) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int arr : myarr){
            if(arr==n){
                return arr;
            }
        }
        return -1;
    }

}
