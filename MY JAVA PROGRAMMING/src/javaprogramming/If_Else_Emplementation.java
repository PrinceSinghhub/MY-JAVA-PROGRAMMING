package javaprogramming;
import java.util.Scanner;

public class If_Else_Emplementation {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int m = n.nextInt();

        if (m>95 && m<=100){
            System.out.println("Passed by +A Grade");
        }
        else if(m>=85 &&m<95){
            System.out.println("Passed by A Grade");
        }
        else if(m>=70 && m<85){
            System.out.println("Passed by B Grade");
        }
        else if(m>=55 && m<70){
            System.out.println("Passed by C Grade");
        }
        else if(m>=33 && m<55){
            System.out.println("Passed by D Grade");
        }
        else{
            System.out.println("Sorry You Are Fail!");
        }
    }
}
