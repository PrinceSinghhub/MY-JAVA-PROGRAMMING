package JavaQuestion;

import java.util.Scanner;

public class all_the_factors_of_that_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();
        PossibleFactore(n);
    }

    static void PossibleFactore(int n) {
        System.out.println("all possiblr factore are");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }

        }
    }
}
