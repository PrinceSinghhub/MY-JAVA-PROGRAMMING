package JavaQuestion;

import java.util.Scanner;

public class maximum_and_the_minimum_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter all 3No: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = maximum(a,b,c);
        int min = minimum(a,b,c);

        System.out.println("The maximum no is: " + max);
        System.out.println("The minimum no is: " + min);


    }

    static int minimum(int a, int b, int c) {
        int min = 0;
        if(a<min){
            min = a;
        }
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }


    static int maximum(int a, int b, int c) {
        int max = 0;
        if(a>max){
            max = a;
        }
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
}
