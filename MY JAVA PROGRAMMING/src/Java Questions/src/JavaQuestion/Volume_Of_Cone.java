package JavaQuestion;

import java.util.Scanner;

public class Volume_Of_Cone {
    static float pi = 3.1416f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();

        float v = v_of_cone(r,h);
        System.out.println("Valume of Cone: " + v);

    }

    static float v_of_cone(float r,float h) {
        float v =pi*(r*r)*h/3;
        return v;
    }
}
