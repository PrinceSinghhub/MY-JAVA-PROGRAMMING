package JavaQuestion;
import java.util.Scanner;

//todo use our PrimeorNot programe here to save line of code
import static JavaQuestion.prime_or_not.PrimeorNot;

public class prime_or_not_under_the_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of range: ");
        int s = sc.nextInt();
        int e = sc.nextInt();
        for (int i = s; i <=e ; i++) {

            if(i>2){
                boolean r = PrimeorNot(i);
                if(r==true){
                    System.out.print(i + " ");
                }
            }
        }

    }

}
