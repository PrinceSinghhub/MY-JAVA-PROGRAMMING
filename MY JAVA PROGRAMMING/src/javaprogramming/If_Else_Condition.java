package javaprogramming;

import java.util.Scanner;

public class If_Else_Condition {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter Your age ");
        int a = p.nextInt();

        if(a>18){
            System.out.println("Hello Codex Coder! Vote now");

        }
        else{
            System.out.println("Sorry your age is not correct!");
        }
    }
}
