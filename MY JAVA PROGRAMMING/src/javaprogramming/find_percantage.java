package javaprogramming;
import  java.util.Scanner;
public class find_percantage {
    public static void main (String[] args){
        System.out.print("Enter MATHS MARKS: ");
        Scanner p  = new Scanner(System.in);
        int math = p.nextInt();
        System.out.print("Enter Physics MARKS: ");
        int physic = p.nextInt();
        System.out.print("Enter chem MARKS: ");
        int chem = p.nextInt();
        System.out.print("Enter eng MARKS: ");
        int eng = p.nextInt();
        System.out.print("Enter hindi MARKS: ");
        int hindi = p.nextInt();


        int sum = math+physic+chem+eng+hindi;
        float result = sum / 5.0f;
        System.out.println(sum);
        System.out.println(result);

    }
}
