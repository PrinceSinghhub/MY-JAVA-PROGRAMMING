package javaprogramming;

import java.util.Scanner;

public class check_String_are_upper_or_lower {
    public static void main(String[] args){

        Scanner c = new Scanner(System.in);
        char cr = c.next().trim().charAt(0);

        if(cr >= 'a' && cr<='z'){
            System.out.println("Char are Small letter: "+ cr);
        }
        else {
            System.out.println("Char are Capital letter: " + cr);
        }


    }
}
