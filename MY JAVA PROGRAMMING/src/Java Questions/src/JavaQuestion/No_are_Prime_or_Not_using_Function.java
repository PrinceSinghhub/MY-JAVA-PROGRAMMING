package JavaQuestion;

import java.util.Scanner;

public class No_are_Prime_or_Not_using_Function {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter No: ");
        int a = n.nextInt();
        prime_or_not(a);
    }

    static void prime_or_not(int n) {
        if(n>1){
            int r = 0;
            int s = 2;
            while (s*s<=n){
                if (n%s*s == 0){
                    r++;
                    break;
                }
                s++;
            }
            if(r == 0){
                System.out.println(n+" is a Prime Number");
            }
            else{
                System.out.println(n+" Not a Prime Number");
            }
        }
        else {
            System.out.println("Enter no grater than 1");
        }
    }
}
