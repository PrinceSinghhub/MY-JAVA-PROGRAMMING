package JavaQuestion;

import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
    static float pi = 3.1416f;
    public static void main(String[] args) {
        csaoc();
    }

    static void csaoc() {
//        2πrh
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float r = n.nextFloat();
        System.out.print("Enter Height: ");
        float h = n.nextFloat();

        float v;
        v = 2*pi*r*h;
        System.out.println("result: " + v);
    }
}
