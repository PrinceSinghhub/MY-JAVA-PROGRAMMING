package JavaQuestion;

import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        float radius = sc.nextFloat();

        float result = 3*radius;
        System.out.println("P of Equilateral Trangle: " + result);
    }
}
