package JavaQuestion;

import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //P=2(a+b)
        System.out.print("Enter base: ");
        float base = sc.nextFloat();
        System.out.print("Enter side: ");
        float side = sc.nextFloat();

        float result = 2*(base+side);
        System.out.println("P of Equilateral Parallelograme: " + result);
    }
}
