package javaprogramming;

import java.util.Scanner;

public class multiple_case_in_single_case {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);

        int age = p.nextInt();

        switch(age){

            case 18:


                System.out.println("Hello ji");
                break;
            case 15:
                System.out.println("sorry");
                break;
            case 10:
                System.out.println("Happy biday");
                break;
            default:
                System.out.println("tHANKGYOU");
        }

    }
}


