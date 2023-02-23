package JavaQuestion;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = s.nextInt();
        evenornot(n);
    }

    static void evenornot(int n) {
        if(n%2==0){
            System.out.println(n + " number is even");
        }
        else{
            System.out.println(n + " No is odd");
        }
    }
}
