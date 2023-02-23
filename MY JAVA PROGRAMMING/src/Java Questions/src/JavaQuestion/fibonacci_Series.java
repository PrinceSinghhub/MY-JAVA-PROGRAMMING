package JavaQuestion;

import java.util.Scanner;

public class fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n = sc.nextInt();
        int result = febonachi(n);
        System.out.println("Febonachi Series "+n+" is: "+ result);


    }

    static int febonachi(int n) {
        int f,s,t;
        f=0;s=1;t=0;
        int r = 0;
        for (int i = 0; i<n; i++) {

            f=s;
            s=t;
            t=f+s;

        }
        return t;

    }

}
