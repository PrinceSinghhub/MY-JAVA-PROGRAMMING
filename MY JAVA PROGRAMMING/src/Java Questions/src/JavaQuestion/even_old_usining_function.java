package JavaQuestion;

import java.util.Scanner;

public class even_old_usining_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int a = sc.nextInt();

        evenold(a);
    }

    static void evenold(int a) {
        if(a%2==0){
            System.out.println("The given no is Evene");
        }
        else {
            System.out.println("The given no is Old");
        }
    }
}
