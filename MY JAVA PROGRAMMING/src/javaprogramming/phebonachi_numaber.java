package javaprogramming;

import java.util.Scanner;

public class phebonachi_numaber {
    public static void main(String[] args){

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int f = 0;
        int s = 1;
        int t = 0;
        for(int i = 0;i<=a;i++){
            System.out.print(t + " ");
            f=s;
            s=t;
            t=f+s;

        }
    }
}
