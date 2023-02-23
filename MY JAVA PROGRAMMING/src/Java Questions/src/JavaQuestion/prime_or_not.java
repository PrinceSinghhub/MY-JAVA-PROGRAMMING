package JavaQuestion;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int a = sc.nextInt();

        if(a<2){
            System.out.println("Enter Valid Number");
        }
        else{
            boolean r = PrimeorNot(a);
            if(r==true){
                System.out.println("Number are Prime Number");
            }
            else {
                System.out.println("Number are Not a Prime Number");
            }
        }
    }

    static boolean PrimeorNot(int a) {
        int r = 0;
        int s = 2;
        while (s * s <= a) {
            if (a % s * s == 0) {
                r++;
                break;
            }
            s++;
        }
//        System.out.println(r);
//        System.out.println(s);
        if (r==0){
            return true;
        }
        else{
            return false;
        }
    }
}

