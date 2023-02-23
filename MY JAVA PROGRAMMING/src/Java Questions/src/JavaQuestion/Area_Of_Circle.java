package JavaQuestion;

import java.util.Scanner;

public class Area_Of_Circle {
    static float pi = 3.1416f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A = pi*r*r
        System.out.print("Enter Radius: ");
        float radius = sc.nextFloat();
        float area = pi*radius*radius;
        System.out.println("Area of Circle: "+ area);

    }
}
