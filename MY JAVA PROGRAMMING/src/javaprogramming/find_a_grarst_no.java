package javaprogramming;

import java.util.Scanner;

public class find_a_grarst_no {
    public static void main(String[] args){

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        int max = a;
        if(b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);

//        todo using math class
        int maxc = Math.max(c,Math.max(a,b));
        System.out.println("using math class "+ maxc);
    }
}
