package javaprogramming;
import java.util.Scanner;
public class PrimeNoOrNot {
    public static void main(String args[]){
        int num;
        int result = 0;
        Scanner codex = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        num = codex.nextInt();
        for(int i = 2;i<num;i++){
            if(num%i==0){
                result+=1;
                break;
            }
        }
        if(result==0){
            System.out.println(num+" is a Prime Number");
        }
        else if(result==1){
            System.out.println(num+" is Not a Prime Number");
        }
    }
}
