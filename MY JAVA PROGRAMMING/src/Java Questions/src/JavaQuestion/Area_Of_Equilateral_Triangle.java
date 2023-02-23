package JavaQuestion;

import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    static float value = 1.7320f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        float side = sc.nextFloat();
        float area = AOET(side);
        System.out.println("Area of Eq trangle: "+ area);
    }

    static float AOET(float side) {
        float res = (value/4)*side*side;
        return res;

    }


}
