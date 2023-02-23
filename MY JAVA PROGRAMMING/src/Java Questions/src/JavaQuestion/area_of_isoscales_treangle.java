package JavaQuestion;

import java.util.Scanner;

public class area_of_isoscales_treangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        float base = sc.nextFloat();
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();

        float area = base*height/2;
        System.out.println("Area of isoscales Trangle: "+ area);
    }
}
