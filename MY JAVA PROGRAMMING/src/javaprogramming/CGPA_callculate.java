package javaprogramming;
import java.util.Scanner;
public class CGPA_callculate {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter Yours 3 Marks");
        int maths = p.nextInt();
        int physics = p.nextInt();
        int chemis = p.nextInt();
        int total = maths+physics+chemis;
        float per = total/3f;
        float cgpa = per/9.8f;
        System.out.printf("%.2f\n" , per);
        System.out.printf("%.2f",cgpa);


    }
}
