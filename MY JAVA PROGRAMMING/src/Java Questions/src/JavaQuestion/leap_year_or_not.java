package JavaQuestion;

import java.util.Scanner;

public class leap_year_or_not {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter year: ");
        int r = n.nextInt();
        LORN(r);
    }

    static void LORN(int a){
        if(a%400 == 0 || a%100!=0 && a%4==0){
            System.out.println(a + " Year is a Leap Year");

        }
        else{
            System.out.println(a + " Year is Not Leap Year");
        }

    }
}
