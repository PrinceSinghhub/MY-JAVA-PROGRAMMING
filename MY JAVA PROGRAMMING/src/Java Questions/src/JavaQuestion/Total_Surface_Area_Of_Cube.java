package JavaQuestion;

import java.util.Scanner;

public class Total_Surface_Area_Of_Cube {
    public static void main(String[] args) {
        areaofcube();
    }

    static void areaofcube() {
//        Total surface area = 6a2
        Scanner n = new Scanner(System.in);
        System.out.print("Enter edge: ");
        float a = n.nextFloat();
        float v = 6*a*a;
        System.out.println("Area of cube is: " + v);
    }
}
