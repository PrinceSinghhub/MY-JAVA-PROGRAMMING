package JavaQuestion;

import java.util.Scanner;

public class Algostrom_no_are_not_using_Function {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ENTER No: ");
        int n = s.nextInt();
        Angastrome(n);

    }

    static void Angastrome(int n) {
        int real = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            int cub = rem*rem*rem;
            sum+=cub;
            n/=10;
        }
        if (real == sum) {
            System.out.println(real + " is a Angostrom Number");
        } else {
            System.out.println(real + " Not a Angostrom Number");
        }
    }
}
